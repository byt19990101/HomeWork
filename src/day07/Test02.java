package day07;

import java.io.*;

/**
 * 使用缓冲流复制myfile.txt文件为myfile_cp2.txt
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        File file = new File("myfile.txt");
        File file0 = new File("myfile_cp2.txt");
        file0.createNewFile();
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file0)));
        int a;
        while((a=br.read())!=-1){
            bw.write((char)a);
        }
        br.close();
        bw.close();
    }

}
