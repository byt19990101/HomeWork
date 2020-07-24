package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

/**
 * 要求用户首先输入员工数量，然后输入相应员工信息，格式为：
 * name,age,gender,salary,hiredate
 * 例如:
 * 张三,25,男,5000,2006-02-15
 * 每一行为一个员工信息，然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 在解析成Emp对象后要先查看当前集合是否包含该员工，若包含则提示该用于已存在，
 * 否则才存入集合。
 * 然后输出集合查看每个员工信息.
 *
 * @author Bonnie
 */
public class Test07 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        Collection<Emp> col = new ArrayList<>();
        while (true) {
            System.out.println("请输入员工信息：-------(输入ok结束输入，显示结果)");
            String input = sc.next().trim();
            if (input.equalsIgnoreCase("ok")) {
                break;
            } else {
                Collection<String> c = new ArrayList<String>();
                String[] me = input.split(",");
                String name = me[0];
                int age = Integer.parseInt(me[1]);
                String gender = me[2];
                int salary = Integer.parseInt(me[3]);
                Date hiredate = sf.parse(me[4]);
                Emp e = new Emp(name, age, gender, salary, hiredate);

                if (col.contains(e)) {
                    System.out.println("该员工已存在！");
                } else {
                    col.add(e);
                }

            }

        }

        System.out.println("所有员工信息：");
        for (Emp s : col) {
            System.out.println(s);
        }

    }
}
