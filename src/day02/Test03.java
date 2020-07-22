package day02;

import java.util.Scanner;

/**
 * 输入一个IP地址，然后将4段数字分别输出
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        //String ip = "192.168.6.66";
        System.out.println("请输入IP地址：");
        Scanner sc = new Scanner(System.in);
        String ip = sc.next();
        String[] ip0 = ip.split("[.]");
        for (int i = 0; i <ip0.length; i++) {
            System.out.println(ip0[i]);
        }
    }
}
