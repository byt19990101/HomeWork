package day06;

import java.io.*;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 将emp.dat文件中所有员工解析出来，并创建为若干Emp实例存入一个
 * 集合，然后输出该集合中每个员工信息。
 * 该文件800字节，每80个字节为一个员工的信息。
 * 其中:
 * name为字符串，长度为32个字节，编码为:UTF-8
 * age为int,长度为4个字节
 * gender为字符串，长度为10个字节，编码为:UTF-8
 * salary为int,长度为4个字节
 * hiredate为字符串，格式"yyyy-MM-dd"，长度为30个字节，编码为:UTF-8
 * 格式可参考当前包中emp.jpg图
 * 提示:
 * 使用RandomAccessFile读取字符串时，例如name,可以先读取32个字节，再按照UTF-8
 * 转换为字符串，读取age时可以直接使用readInt方法。依次类推。
 *
 * @author Bonnie
 */
public class Test13 {
    public static void main(String[] args) throws URISyntaxException, IOException, ParseException {
        //使用类加载器加载当前包中的emp.dat文件
        File file = new File(Test13.class.getClassLoader().getResource("day06/emp.dat").toURI());
        RandomAccessFile rw = new RandomAccessFile(file, "rw");
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        List<Emp> list = new ArrayList<Emp>();

        rw.seek(0);
        while(true){
            try{
                byte[] b = new byte[32];
                int len = rw.read(b);
                //读取name
                String name = new String(b, 0, len).trim();
                //System.out.println(new String(b, 0, len).trim());
                //读取age
                int age = rw.readInt();
                //读取gender
                b = new byte[10];
                len = rw.read(b);
                String gender = new String(b, 0, len).trim();
                //读取salary
                int salary = rw.readInt();
                //读取hiredate
                b = new byte[30];
                len = rw.read(b);
                Date hiredate = sf.parse(new String(b, 0, len).trim());
                Emp e = new Emp(name, age, gender, salary, hiredate);
                list.add(e);
            }catch(StringIndexOutOfBoundsException e){
                break;
            }

        }
        for(Emp e :list){
            System.out.println(e);
        }
        //System.out.println(list.toString());

    }

}


