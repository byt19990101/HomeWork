package day02;

import java.util.Scanner;

/**
 * 输入一个数学计算表达式，如:1+2
 * 然后输出计算后的结果:1+2=3
 * 这里计算表达式只计算一次即可，可以使用加减乘除任意一个,可以进行小数运算。
 *
 * @author Bonnie
 */
public class Test07 {
    public static void main(String[] args) {
        System.out.println("请输入计算表达式：");
        Scanner sc = new Scanner(System.in);
        String ex = sc.next();
        //String ex = "5.8/5.5";
        String[] n = ex.split("[\\+\\-\\*/]");
        double f0 = Double.parseDouble(n[0]);
        double f1 = Double.parseDouble(n[1]);

        if (ex.contains("+")) {
            System.out.println(f0 + f1);
        }else if (ex.contains("-")) {
            System.out.println(f0 - f1);
        } else if (ex.contains("*")) {
            System.out.println(f0 * f1);
        }else if (ex.contains("/")) {
            System.out.println(f0 / f1);
        }

//        if(ex.matches("\\d.\\d+([+]\\d.\\d+)+")){
//            String[] n = ex.split("\\+");
//            BigDecimal b0 = new BigDecimal(n[0]);
//            BigDecimal b1 = new BigDecimal(n[1]);
//            System.out.println(b0.add(b1));
//        }else if(ex.matches("\\d.\\d+([-]\\d.\\d+)+")){
//            String[] n = ex.split("\\-");
//            BigDecimal b0 = new BigDecimal(n[0]);
//            BigDecimal b1 = new BigDecimal(n[1]);
//            System.out.println(b0.subtract(b1));
//        }else if(ex.matches("\\d.\\d+([*]\\d.\\d+)+")){
//            String[] n = ex.split("\\*");
//            BigDecimal b0 = new BigDecimal(n[0]);
//            BigDecimal b1 = new BigDecimal(n[1]);
//            System.out.println(b0.multiply(b1));
//        }else if(ex.matches("\\d.\\d+([/]\\d.\\d+)+")){
//            String[] n = ex.split("/");
//            double f0 = Double.parseDouble(n[0]);
//            double f1 = Double.parseDouble(n[1]);
//            System.out.println(f0/f1);
//        }

    }

}
