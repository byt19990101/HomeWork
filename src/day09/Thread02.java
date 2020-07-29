package day09;

public class Thread02 extends Thread{
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("再见");
        }
    }
}
