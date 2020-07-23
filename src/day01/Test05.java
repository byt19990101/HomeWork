package day01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 随机生成一个5位的英文字母验证码(大小写混搭)
 * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
 * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
 * @author Bonnie
 *
 */
public class Test05 {
	public static void main(String[] args) {
		//ArrayList<Character> a = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <5; i++) {
			int n =(int)(Math.random()*52)+65;
			if(n>=91 && n<=96){
				i--;
			}else{
				char c = (char) n;
				String s = String.valueOf(c);
				sb.append(s);
				//a.add(c);
			}
		}
		System.out.println(sb);
		System.out.println("请输入验证码：");
		Scanner sc = new Scanner(System.in);
		String m = sc.next();
		if(String.valueOf(sb).equalsIgnoreCase(m)){
			System.out.println("验证码输入正确！");
		}else{
			System.out.println("验证码输入错误！");
		}

	}
	
}
