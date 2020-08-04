package day06;

import java.io.*;
import java.util.Scanner;

/**
 * 要求用户输入一个文件名，并复制当前目录中该文件，并取名为"原文件名_copy.后缀名"
 * 定义两个方法分别使用单字节形式复制，以及字节数组形式复制
 * @author Bonnie
 *
 */
public class Test07 {
	public static void main(String[] args) throws IOException {
		System.out.println("请输入要复制的文件名：");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		File file = new File(name);
		if(!file.exists()){
			file.createNewFile();
		}
		//copy1：使用单字节复制
		copy1(name);
		//copy2：使用字节数组复制
		copy2(name);
	}
	/**
	 * 使用单字节方式复制
	 * @param name 要复制的文件名
	 */
	public static void copy1(String name) throws IOException {
		InputStream is = new FileInputStream(name);
		int x = name.indexOf(".");
		String pr = name.substring(0,x);
		String su = name.substring(x);
		OutputStream os = new FileOutputStream(pr + "_copy" + su);

		int a;
		while((a=is.read())!=-1){
			os.write(a);
		}
		is.close();
		os.close();
	}
	/**
	 * 使用字节数组形式复制
	 * @param name 要复制的文件名
	 */
	public static void copy2(String name) throws IOException {
		InputStream is = new FileInputStream(name);
		int x = name.indexOf(".");
		String pr = name.substring(0,x);
		String su = name.substring(x);
		OutputStream os = new FileOutputStream(pr + "_copy" + su);

		int len;
		byte[] b = new byte[1024];
		while((len=is.read(b))!=-1){
			os.write(b,0,len);
		}
		is.close();
		os.close();
	}
}
