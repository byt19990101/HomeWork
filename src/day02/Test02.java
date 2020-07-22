package day02;
/**
 * 将字符串123,456,789,012根据","拆分，并输出拆分后的每一项
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) {
        String str = "123,456,789,012";
        String[] s0 = str.split(",");
        for (int i = 0; i <s0.length; i++) {
            System.out.println(s0[i]);
        }
    }

}
