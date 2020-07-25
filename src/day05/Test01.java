package day05;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 创建一个队列，存入Integer类型元素1,2,3,4,5
 * 然后遍历队列并输出每个元素
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <6; i++) {
            queue.offer(i);
        }

        System.out.println("循环遍历队列:");
        System.out.print("[");
        for(Integer q:queue){
            System.out.print(q+" ,");
        }
        System.out.println("]");

        System.out.println("队列方式遍历，元素移除:");
        while(queue.peek()!=null){
            System.out.println(queue.poll());
        }
    }

}
