package day02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary;name,age,gender,salary;....
 * 例如:
 * 张三,25,男,5000;李四,26,女,6000;...
 * 然后将每个员工信息解析成Person对象。并存入到一个数组中。
 * 然后循环数组，输出每一个员工信息(输出使用toString返回的字符串)
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args) {
        System.out.println("请输入员工格式信息：");
        Scanner sc = new Scanner(System.in);
        String input = sc.next().trim();
        String[] message = input.split(";");
        ArrayList<Person> list = new ArrayList<Person>();

        for(String s : message){
            String[] message0 = s.split(",");
            String name = message0[0];
            int age = Integer.parseInt(message0[1]);
            String gender = message0[2];
            int salary = Integer.parseInt(message0[3]);
            Person p = new Person(name,age,gender,salary);
            list.add(p);
            //System.out.println(s);
        }

        for(Person p : list){
            System.out.println(p);
        }

    }

}
