package day06;

import java.io.*;
import java.util.Scanner;

/**
 * 创建一个文件"note.txt",然后通过控制台输入的每一行字符串都按行写入到
 * note.txt中。当输入的字符串为"exit"时退出程序。
 * @author Bonnie
 *
 */
public class Test09 {
    public static void main(String[] args) throws IOException {
        File file = new File("note.txt");
        file.createNewFile();
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file,true)));
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入字符串（输入exit时退出）：");
            String str = sc.nextLine();
            if(str.equalsIgnoreCase("exit")){
                break;
            }
            pw.println(str);
            pw.flush();
        }
    }
}
