package day06;

import java.io.File;
import java.util.Scanner;

/**
 * 要求用户输入一个目录名并使用File在当前目录下创建出来。
 * 若该目录已经存在，则提示用户该目录已经存在。并创建副本，原则与第二题一致。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        System.out.println("请输入目录名：");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int i = 1;
        File file = new File(input);

        while (file.exists()) {
            file = new File(input + "_副本" + i );
            i++;
        }
        file.mkdir();
    }

}
