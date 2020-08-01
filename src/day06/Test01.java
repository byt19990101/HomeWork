package day06;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 * 通过File输出当前项目目录下的文件"myfile.txt"的名字，大小，最后修改时间。
 * 最后修改时间格式如:2017-06-30 14:22:16
 *
 * @author Bonnie
 */
public class Test01 {
    @Test
    public void Test() throws IOException {
        File file = new File("src/day06/myfile.txt");
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        file.createNewFile();
        System.out.println("文件名：" + file.getName());
        System.out.println("文件大小：" + file.length());
        System.out.println("最后修改时间：" + sf.format(file.lastModified()));
    }

}
