package day04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 然后循环集合，输出每一个员工信息(输出使用toString返回的字符串)
 * 然后输出每个员工的转正仪式日期。
 * 转正仪式日期为:入职3个月的当周周五
 *
 * @author Bonnie
 */
public class Test09 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("请输入员工信息：");
        Scanner sc = new Scanner(System.in);
        String input = sc.next().trim();
        String[] me = input.split(";");
        Collection<Emp> col = new ArrayList<>();
        for (String s : me) {
            String[] inf = s.split(",");
            String name = inf[0];
            int age = Integer.parseInt(inf[1]);
            String gender = inf[2];
            int salary = Integer.parseInt(inf[3]);
            Date hiredate = sf.parse(inf[4]);
            Emp e = new Emp(name, age, gender, salary, hiredate);

            if (col.contains(e)) {
                System.out.println(e.getName()+"员工已存在,取消该项数据输入。");
            } else {
                col.add(e);
            }

        }
        //System.out.println(col);
        for (Emp e : col) {
            System.out.println(e);
            Calendar c = Calendar.getInstance();
            c.setTime(e.getHiredate());
            c.set(Calendar.MONTH, c.get(Calendar.MONTH) + 3);
            c.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
            Date date = c.getTime();
            String d = sf.format(date);
            System.out.println("转正日期：" + d);

        }

    }

}
