package day09;

public class Thread01 extends Thread {
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("你好");
        }
    }
}
