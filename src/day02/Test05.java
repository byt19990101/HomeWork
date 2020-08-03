package day02;

import java.util.Scanner;

/**
 * 实现文件重命名。
 * 要求用户输入一个文件名称，例如:abc.jpg
 * 然后对该名字进行重新命名，输出的格式为:系统时间毫秒值.jpg
 * 例如:1465266796279.jpg
 *
 * @author Bonnie
 */
public class Test05 {
    public static void main(String[] args) {
        System.out.println("请输入文件名：");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String str = Long.toString(System.currentTimeMillis());
        int x = name.indexOf(".");
        String suffix = name.substring(x);
        System.out.println(str + suffix);

    }
}
