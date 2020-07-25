package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入生日（格式为\"yyyy-MM-dd\"）：");
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        String birth = sc.next();
        Date date0 = sf.parse(birth);
        long datetime0 = date0.getTime();
        Date date = new Date();
        long datetime = date.getTime();
        long time = datetime-datetime0;
        time = time/1000l/60/60/24/7;
        System.out.println("到现在为止经过了"+time+"周");

    }

}
