package day08;

import java.io.*;
import java.util.Scanner;

/**
 * 使用异常捕获完成下述操作
 * 将控制台输入的每一行字符串使用缓冲字符输出流PrintWriter
 * 按行以GBK编码写入到文件note.txt中
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) {
        System.out.println("请输入字符串(输入exit退出)");
        File file = new File("note.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(System.in);
        while(true){
            String str = sc.nextLine();
            if(str.equalsIgnoreCase("exit")){
                break;
            }
            PrintWriter pw = null;
            try {
                pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file,true),"GBK"));
            } catch (UnsupportedEncodingException | FileNotFoundException e) {
                e.printStackTrace();
            }
            pw.println(str);
            pw.flush();
        }
    }
	
}
