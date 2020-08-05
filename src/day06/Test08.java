package day06;

import java.io.*;

/**
 * 创建一个"raf.dat"的文件，并在其中写出一个int的最大值，long的最大值，
 * 然后将其分别读取出来并输出
 *
 * @author Bonnie
 */
public class Test08 {
    public static void main(String[] args) throws IOException {
        File file = new File("raf.dat");
        file.createNewFile();

        RandomAccessFile rw = new RandomAccessFile("raf.dat", "rw");
        rw.writeInt(Integer.MAX_VALUE);
        rw.skipBytes(4);
        rw.writeLong(Long.MAX_VALUE);

//        Writer w = new OutputStreamWriter(new FileOutputStream(file, true));
//        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("raf.dat")));
//        w.write(String.valueOf(Integer.MAX_VALUE));
//        w.write("\n");
//        w.write(String.valueOf(Long.MAX_VALUE));
//        w.close();
//        System.out.println("int的最大值：" + br.readLine());
//        System.out.println("long的最大值：" + br.readLine());
//        br.close();
        rw.seek(0);
        System.out.println("int的最大值：" + rw.readInt());
        rw.seek(4);
        System.out.println("long的最大值：" + rw.readLong());
        rw.close();

    }

}
