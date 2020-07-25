package day05;

import java.util.Stack;

/**
 * 创建一个栈，存入Integer类型元素1,2,3,4,5
 * 然后遍历队列并输出每个元素
 *
 * @author Bonnie
 */
public class Test02 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i <6; i++) {
            stack.push(i);
        }

        System.out.println("循环遍历栈:");
        System.out.print("[");
        for(Integer s:stack){
            System.out.print(s+" ,");
        }
        System.out.println("]");

        System.out.println("弹出遍历栈:");
        while(!stack.empty()){
            System.out.println(stack.pop());
        }
    }

}
