package day08;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 使用异常捕获机制完成下述IO操作
 * 编写程序，要求下面的类实现功能:
 * 添加新员工
 * 要求用户输入一个员工信息，格式如下:
 * jackson,25,男,5000,2008-12-22
 * 用户输入后需要做下述验证:
 * 要求用户名长度在1-20个字符之间且必须是英文
 * 年龄在0-100之间的整数
 * 性别只能是:"男"或"女"
 * 当发现用户输入有不符合规定时，提醒用户
 * 相关内容输入不符合要求，并要求重新输入。
 * 都输入正确后，将该员工添加到emp.txt文件
 * 的最后一行。
 *
 * @author Bonnie
 */
public class Test06 {
    public static void main(String[] args) {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("请输入员工信息：");
        Scanner sc = new Scanner(System.in);
        while (true) {
            String input = sc.nextLine();
            String[] me = input.split(",");
            String name = me[0];
            int age = Integer.parseInt(me[1]);
            String gender = me[2];
            int salary = Integer.parseInt(me[3]);
            Date hiredate = null;
            try {
                hiredate = sf.parse(me[4]);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            boolean bn = name.matches("^[a-zA-Z]{1,20}$");
            boolean ba = age > 0 && age < 100;
            boolean bg = gender.matches("^男$|^女$");
            if (!bn) {
                System.out.println("输入的用户名不符合规定，请重新输入。");
            }
            if (!ba) {
                System.out.println("输入的年龄不符合规定，请重新输入。");
            }
            if (!bg) {
                System.out.println("输入的性别不符合规定，请重新输入。");
            }
            if (bn && ba && bg) {
                Emp e = new Emp(name, age, gender, salary, hiredate);
                PrintWriter pw = null;
                try {
                    pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("src/day08/emp.txt", true)));
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
                pw.println(e);
                pw.flush();
                System.out.println("格式正确，输入成功。");
                break;
            }
        }
    }
}
