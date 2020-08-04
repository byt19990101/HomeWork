package day06;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 编写一个程序，将当前目录下所有的员工文件进行读取，并解析出所有员工为Emp
 * 对象并存入Map。其中key为该员工的名字，value为该员工的emp对象。
 * 然后，要求用户输入一个员工名字，若该员工存在，则输出该员工的名字，年龄，工资，以及入职20周年的纪念日当周的周六的日期。
 * 即:输入名字"张三"
 * 若该员工存在，则输出如下格式:
 * 张三,25,5000,2006-02-14
 * 入职20周年纪念日派对日期: 2026-02-14  （注:若入职日期为:2006-02-14）
 * 若该员工不存在，则输出:"查无此人"
 *
 * @author Bonnie
 */
public class Test12 {
    public static void main(String[] args) throws IOException, ParseException {
        File dir = new File(".");
        File[] files = dir.listFiles(f ->
                f.isFile() && f.getName().endsWith(".emp")
        );
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Map<String, Emp> map = new HashMap<String, Emp>();
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
            map.put(name, e);

        }
        System.out.println("请输入员工名字：");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (map.containsKey(input)) {
            Emp e = map.get(input);
            Calendar c = Calendar.getInstance();
            c.setTime(e.getHiredate());
            c.set(Calendar.YEAR,c.get(Calendar.YEAR)+20);
            Date date = c.getTime();
            System.out.println(input + "," + e.getAge() + "," + e.getSalary() + "," + sf.format(e.getHiredate()));
            System.out.println("入职20周年纪念日派对日期:"+sf.format(date));
        }else{
            System.out.println("查无此人");
        }

    }

}
