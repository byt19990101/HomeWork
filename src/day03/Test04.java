package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**2018-03-25
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 * @author Bonnie
 * 
 */
public class Test04 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("请输入生产日期（格式为\"yyyy-MM-dd\"）：");
        Scanner sc = new Scanner(System.in);
        String sd0 = sc.next();
        System.out.println("请输入保质的天数：");
        int life = sc.nextInt();
        Date date0 = sf.parse(sd0);
        long datetime0 = date0.getTime();
        long datetiem1 = datetime0 + life*24l*60*60*1000 - 2l*7*24*60*60*1000;
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(datetiem1);
        c.set(Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY);
        //System.out.println(c.get(Calendar.DAY_OF_MONTH));
        Date date=c.getTime();
        String d = sf.format(date);
        System.out.println("促销日期为："+d);
    }
	
}
