package day02;

import java.util.Scanner;

/**
 * 测试正则表达式，并尝试编写规则: 电话号码可能有3-4位区号，
 * 7-8位号码:0415-5561111
 *
 * @author Bonnie
 */
public class Test06 {
    public static void main(String[] args) {
        System.out.println("请输入文件名：");
        Scanner sc = new Scanner(System.in);
        String textNumber0 = sc.next();
        String textNumber = "0415-5561111";
        String regex = "^[0-9]{3,4}[/-][0-9]{7,8}$";

        System.out.println(textNumber + " " + textNumber.matches(regex));
        System.out.println(textNumber0 + " " + textNumber0.matches(regex));
    }

}
