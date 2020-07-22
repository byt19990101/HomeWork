package day01;

import java.util.ArrayList;

/**
 * 随机生成一个5位的英文字母验证码(大小写混搭)
 * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
 * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
 * @author Bonnie
 *
 */
public class Test05 {
	public static void main(String[] args) {
		String charStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		ArrayList<String> a = new ArrayList<String>();
		for (int i = 0; i <5; i++) {
			a.add(String.valueOf((int)(Math.random()*52)));
		}
		System.out.println(a);
		//String n = String.valueOf((int)(Math.random()*52));

	}
	
}
