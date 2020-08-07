package day07;

import java.io.*;

/**
 * 使用字符流复制当前程序的源文件到当前项目根目录下。
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/day07/Test05.java");
        file.createNewFile();
        FileReader fr = new FileReader(file);
        FileWriter fw = new FileWriter(file.getName());
        int b;
        while((b = fr.read())!=-1){
                fw.write(b);
        }
        fw.close();
    }
}
