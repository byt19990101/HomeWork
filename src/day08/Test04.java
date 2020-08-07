package day08;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 使用异常捕获机制完成下述读取操作
 * 读取emp.txt文件，并将每个员工信息读取出来，以一个Emp实例保存，然后将
 * 这些Emp实例存入到一个Map集合中。其中key为字符串，是该员工名字，而value
 * 是该Emp实例。
 * 存入后，要求用户输入一个员工的名字,如:张三
 * 若该员工存在则输出该员工所有信息(Emp的toString方法返回的字符串)
 * 输入的员工名若是英文，不要求区分大小写。
 * 若输入的员工名字不存在，则显示"查无此人"
 *
 * @author Bonnie
 */
public class Test04 {
    public static void main(String[] args) {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Map<String, Emp> map = new HashMap<>();
        BufferedReader bf = null;
        try {
            bf = new BufferedReader(new InputStreamReader(new FileInputStream("src/day08/emp.txt")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String str;
        try{
            while ((str = bf.readLine()) != null) {
                String[] emp = str.split(",");
                String name = emp[0];
                int age = Integer.parseInt(emp[1]);
                String gender = emp[2];
                int salary = Integer.parseInt(emp[3]);
                Date hiredate = null;
                try {
                    hiredate = sf.parse(emp[4]);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                Emp e = new Emp(name, age, gender, salary, hiredate);
                map.put(name, e);
            }
        }catch(IOException e){
            e.printStackTrace();
        }

        System.out.println("请输入员工姓名：");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int c = 0;
        for (String name : map.keySet()) {
            if (input.equalsIgnoreCase(name)) {
                System.out.println(map.get(name));
                c++;
                break;
            }
        }
        if (c == 0) {
            System.out.println("查无此人！");
        }
    }
}
