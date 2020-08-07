package day07;

import java.io.*;
import java.util.Scanner;

/**
 * 要求用户输入一个文件，该文件应当是Test07程序生成的文件，然后将该文件中所有字符读取
 * 出来，并以UTF-8编码写入到另一个文件中，实现文件转码工作，该文件取名格式:原文件名_utf.txt。
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args) throws IOException {
        System.out.println("请输入文件名：");
        Scanner sc = new Scanner(System.in);
        File file = new File(sc.nextLine());
        if(file.exists()){
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file.getName()+"_utf.txt"),"UTF-8"));
            int b;
            while((b = br.read())!=-1){
                bw.write(b);
            }
            br.close();
            bw.close();
        }else{
            System.out.println("文件不存在于根目录！");
        }

    }

}
