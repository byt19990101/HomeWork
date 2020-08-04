package day06;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 编写一个程序，将当前目录下所有员工文件进行读取，并解析出所有员工为Emp
 * 对象并存入集合。然后排序该集合，按照员工的年龄排序，年龄大的靠前，年龄小
 * 的靠后。排序完毕后输出结果。
 *
 * @author Bonnie
 */
public class Test11 {
    public static void main(String[] args) throws IOException, ParseException {
        File dir = new File(".");
        File[] files = dir.listFiles(f ->
                f.isFile() && f.getName().endsWith(".emp")
        );
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        List<Emp> list = new ArrayList<Emp>();
        for (File f : files) {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
            String str = br.readLine();
            String[] me = str.split(",");

            String name = me[0];
            int age = Integer.parseInt(me[1]);
            String gender = me[2];
            int salary = Integer.parseInt(me[3]);
            Date hiredate = sf.parse(me[4]);

            Emp e = new Emp(name, age, gender, salary, hiredate);
            list.add(e);

        }
        Collections.sort(list, (o1, o2) -> o2.getAge() - o1.getAge());
        for (Emp e : list) {
            System.out.println(e);
        }
    }

}
