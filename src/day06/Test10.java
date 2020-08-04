package day06;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 要求用户输入一个员工信息，格式为：
 * name,age,gender,salary,hiredate
 * 例如:
 * 张三,25,男,5000,2006-02-15
 * 然后将输入的员工信息解析成Emp对象。
 * 然后将该Emp对象的toString返回的字符串写入到文件中，该文件的
 * 名字为:name.emp,以上面的例子，那么该文件名为:张三.emp
 * 至少运行5次该程序，输入五个员工信息，并生成5个文件。
 *
 * @author Bonnie
 * <p>
 * 张三,25,男,5000,2006-02-15
 * 李四,26,女,6000,2007-12-24
 * 老八,23,男,6000,2006-09-24
 * 王五,32,男,5500,2003-08-20
 * 悠太,24,男,4514,2004-01-14
 */
public class Test10 {
    public static void main(String[] args) throws ParseException, IOException {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入员工信息（输入exit时结束输入）：");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            String[] me = input.split(",");

            String name = me[0];
            int age = Integer.parseInt(me[1]);
            String gender = me[2];
            int salary = Integer.parseInt(me[3]);
            Date hiredate = sf.parse(me[4]);

            Emp e = new Emp(name, age, gender, salary, hiredate);
            File empFile = new File(name + ".emp");
            empFile.createNewFile();
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(empFile)));
            pw.println(e.toString());
            pw.close();
        }

    }

}
