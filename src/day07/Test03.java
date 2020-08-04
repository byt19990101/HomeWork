package day07;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 要求用户控制台输入想输入的员工人数（至少5个），然后依序输入员工信息，每行为
 * 一条员工信息，格式如:张三,25,男,5000,2006-3-18
 * 然后将该对象写入到文件<name>.obj并保存到当前项目根目录中，例如:张三.obj。
 *
 *  张三,25,男,5000,2006-02-15
 *  李四,26,女,6000,2007-12-24
 *  老八,23,男,6000,2006-09-24
 *  王五,32,男,5500,2003-08-20
 *  悠太,24,男,4514,2004-01-14
 *
 * @author Bonnie
 */
public class Test03 {
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
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(name+".obj"));
            out.writeObject(e);
            out.close();
        }

    }


}
