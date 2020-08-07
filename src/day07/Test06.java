package day07;

import java.io.*;
import java.util.Scanner;

/**
 * 记事本功能，首先要求用户输入一个文件名，并将该文件创建出来，
 * 然后通过控制台输入的每一行字符串都按行写入到该文件中，并
 * 使用GBK编码保存。当输入的字符串为"exit"时退出程序。
 * @author Bonnie
 *
 */
public class Test06 {
    public static void main(String[] args) throws IOException {
        System.out.println("请输入要创建的文件名：");
        Scanner sc = new Scanner(System.in);
        File file = new File(sc.nextLine());
        file.createNewFile();
        while(true){
            System.out.println("--------------------------");
            System.out.println("请输入要输入的字符串信息(输入exit退出)：");
            String str = sc.nextLine();
            if(str.equalsIgnoreCase("exit")){
                break;
            }
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file,true),"GBK"));
            pw.println(str);
            System.out.println("输入成功！");
            pw.flush();
        }
    }

}
