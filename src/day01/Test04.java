package day01;

import java.util.Scanner;

/**
 * 要求用户从控制台输入一个email地址，然后获取该email的用户名(@之前的内容)
 * @author Bonnie
 *
 */
public class Test04 {
	public static void main(String[] args) {
		System.out.println("请输入email地址：");
		Scanner sc = new Scanner(System.in);
		String email = sc.next();
		if(email.indexOf("@")!=-1){
			String username = email.substring(0,email.indexOf("@"));
			System.out.println("该email的用户名为："+username);
		}else{
			System.out.println("输入邮箱格式错误！");
		}
//		int x = email.indexOf("@");
//		System.out.println("该email的用户名为："+email.substring(0,x));
		
	}
}
