package day08;

import java.io.*;

/**
 * 对myfile.txt文件进行复制操作，要求使用异常捕获
 * 机制对流的异常进行捕获和处理，finally中
 * 要将流关闭
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args)  {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try{
            br = new BufferedReader(new InputStreamReader(new FileInputStream("myfile.txt")));
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("myfile_copy.txt")));
            String line;
            while((line = br.readLine())!=null){
                bw.write(line);
            }
        }catch(IOException e){
            e.getMessage();
        }finally{
            try {
                br.close();
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
