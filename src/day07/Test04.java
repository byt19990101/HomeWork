package day07;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 读取当前项目根目录下所有后缀为.obj的文件，将这些Emp对象读取出来
 * 并存入到一个List集合中，然后按照员工工资从多到少的顺序依次输出员工信息
 *
 * @author Bonnie
 */
public class Test04 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File dir = new File(".");
        File[] files = dir.listFiles(f ->
                f.isFile() && f.getName().endsWith(".obj")
        );
        List<Emp> list = new ArrayList<Emp>();

        for (File f : files) {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
            Emp e = (Emp) in.readObject();
            list.add(e);
        }

        list.sort((o1, o2) -> o2.getSalary() - o1.getSalary());

        for (Emp e : list) {
            System.out.println(e);
        }
    }

}
