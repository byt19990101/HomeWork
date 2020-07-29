package day09;

/**
 * 使用线程方式二创建两个线程:分别输出1000次，你好和再见
 * *
 * * @author Bonnie
 */
public class Test02 {
    public static void main(String[] args) {
        Runnable01 r1 = new Runnable01();
        Runnable02 r2 = new Runnable02();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

    }
}
