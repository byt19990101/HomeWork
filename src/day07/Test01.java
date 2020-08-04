package day07;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 使用文件流复制myfile.txt文件为myfile_cp.txt
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        File file = new File("myfile.txt");
        file.createNewFile();
        File file0 = new File("myfile_cp.txt");
        file0.createNewFile();
        FileReader fr = new FileReader(file);
        FileWriter fw = new FileWriter(file0);
        int len;
        char[] cf = new char[1024];
        while((len = fr.read(cf))!=-1){
            fw.write(cf,0,len);
        }
        fr.close();
        fw.close();
    }

}
