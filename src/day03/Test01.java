package day03;

import java.util.Date;

/**
 * 使用Date输出当前系统时间，以及3天后这一刻的时间
 *
 * @author Bonnie
 */
public class Test01 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("当前系统时间："+date);
        long time = date.getTime();
        time += 3l * 24 * 60 * 60 * 1000;
        date.setTime(time);
        System.out.println("3天后系统时间："+date);

    }

}
