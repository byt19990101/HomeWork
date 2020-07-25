package day04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 通过控制台输入3个日期(yyyy-MM-dd格式)，然后转换为Date对象后存入
 * 集合，然后对该集合排序后输出所有日期。
 * @author Bonnie
 *
 */
//2020-01-01
//        1999-01-01
//        2012-01-01
public class Test08 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        List<Date> col = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入日期（格式为\"yyyy-MM-dd\",输入三个）：");
        for (int i = 0; i <3; i++) {
            String sd = sc.next();
            Date date = sf.parse(sd);
            col.add(date);
        }
        Collections.sort(col);

        System.out.print("[");
        for(Date d : col){
            String s = sf.format(d);
            System.out.print(s+",");
        }
        System.out.print("]");

    }



}
