package day03;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 实现时间的计算: 要求用户输入身份证号，若格式有误，要求其重新输入。然后根据身份证号码输出20岁生日
 * 所在周的周三的日期。
 * 例如:
 * 出生日期:1992-07-15。
 * 20岁生日:2012-07-15
 * 当周的周三为:2012-07-18
 *
 * @author Bonnie
 */

public class Test05 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sfi = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat sfo = new SimpleDateFormat("yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入身份证号：");
            String id = sc.next();
            String regex = "^[1-9]\\d{5}(18|19|([23]\\d))\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$";
            if (id.matches(regex)) {
                String sd = id.substring(6, 14);
                Date dateBirth = sfi.parse(sd);
                Calendar c = Calendar.getInstance();
                c.setTime(dateBirth);
                c.set(Calendar.YEAR, c.get(Calendar.YEAR) + 20);
                Date date20Birth = c.getTime();
                c.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
                Date date20BirthWed = c.getTime();
                System.out.println("出生日期:" + sfo.format(dateBirth));
                System.out.println("20岁生日:" + sfo.format(date20Birth));
                System.out.println("当周的周三为:" + sfo.format(date20BirthWed));
                break;
            } else {
                System.out.println("输入身份证格式有误，请重新输入！");
            }
        }

    }
}
