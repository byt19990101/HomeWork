package day05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个List集合中。
 * 并对集合排序，然后输出每个员工信息。
 * <p>
 * 再根据员工的入职时间排序，入职晚的在前，早的在后并
 * 输出每个员工的信息。
 *
 * @author Bonnie
 */
//张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;老八,23,男,6000,2006-9-24;
public class Test03 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("请输入员工信息：");
        Scanner sc = new Scanner(System.in);
        String input = sc.next().trim();
        String[] me = input.split(";");
        List<Emp> list = new ArrayList<>();
        for (String s : me) {
            String[] inf = s.split(",");
            String name = inf[0];
            int age = Integer.parseInt(inf[1]);
            String gender = inf[2];
            int salary = Integer.parseInt(inf[3]);
            Date hiredate = sf.parse(inf[4]);
            Emp e = new Emp(name, age, gender, salary, hiredate);


            if (list.contains(e)) {
                System.out.println(e.getName()+"员工已存在,取消该项数据输入。");
            } else {
                list.add(e);
            }

        }
        Collections.sort(list);
        System.out.println("按照年龄排序：");
        System.out.println(list);



        Collections.sort(list);
        compareDate(list);

    }

    public static void compareDate(List<Emp> list) {
        System.out.println("按照入职时间排序：");
        Collections.sort(list, new Comparator<Emp>() {
            @Override
            public int compare(Emp o1, Emp o2) {
                Date t1 = o1.getHiredate();
                Date t2 = o2.getHiredate();
                return t2.compareTo(t1);

            }
        });
        System.out.println(list);
    }
}
