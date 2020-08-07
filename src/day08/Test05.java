package day08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 使用异常捕获机制完成下述读取操作，并在finally中有关闭RandomAccessFile操作。
 * 将emp.dat文件中所有员工解析出来，并创建为若干Emp实例存入一个
 * 集合，然后按照员工入职从晚到早的顺序依次输出员工信息。
 * <p>
 * 该文件560字节，每56个字节为一个员工的信息。
 * 其中:
 * name为字符串，长度为32个字节，编码为:UTF-8
 * age为short,长度为2个字节
 * gender为字符串，长度为10个字节，编码为:UTF-8
 * salary为int,长度为4个字节
 * hiredate为long，长度为8个字节
 * 格式可参考当前包中emp.jpg图
 *
 * @author Bonnie
 */
public class Test05 {
    public static void main(String[] args) {
        File file = null;
        try {
            file = new File(Test05.class.getClassLoader().getResource("day08/emp.dat").toURI());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        RandomAccessFile rw = null;
        try {
            rw = new RandomAccessFile(file, "rw");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<Emp> list = new ArrayList<Emp>();
        try {
            rw.seek(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (true) {
            try {
                byte[] b = new byte[32];
                int len = rw.read(b);
                String name = new String(b, 0, len).trim();
                int age = rw.readShort();
                b = new byte[10];
                len = rw.read(b);
                String gender = new String(b, 0, len).trim();
                int salary = rw.readInt();
                Date hiredate = new Date(rw.readLong());
                Emp e = new Emp(name, age, gender, salary, hiredate);
                list.add(e);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        for (Emp e : list) {
            System.out.println(e);
        }
    }
}
