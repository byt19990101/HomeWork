package day02;

import java.util.Scanner;

/**
 * 要求用户输入一个字符串，然后若该字符串是一个整数，则转换为整数后输出乘以10后的结果
 * 若是小数，则转换为一个小数后输出乘以5后的结果，若不是数字则输出"不是数字"
 * 需要使用正则表达式进行判断。
 *
 * @author Bonnie
 */
public class Test01 {
    public static void main(String[] args) {
        System.out.println("请输入数字：");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String regex0 = "^[0-9]+$";
        String regex1 = "^[0-9]{1,}[.][0-9]*$";
        //System.out.println(str.matches(regex0));
        //System.out.println(str.matches(regex1));
        if (str.matches(regex0)) {
            int n = Integer.parseInt(str);
            n *= 10;
            System.out.println(n);
        }else{
            if (str.matches(regex1)) {
                Float n = Float.valueOf(str);
                n *= 5;
                System.out.println(n);
            }else{
                System.out.println("不是数字");
            }
        }

    }

}
