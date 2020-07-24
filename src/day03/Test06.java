package day03;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 创建一个集合，存放字符串"one","two"，"three"
 * 然后输出该集合的元素个数。
 * 然后输出该集合是否包含字符串"four"
 * 然后输出集合是否不含有任何元素
 * 然后清空集合
 * 然后输出该集合的元素个数
 * 然后输出集合是否不含有任何元素
 * @author Bonnie
 *
 */
public class Test06 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("one");
        c.add("two");
        c.add("three");
        //输出该集合的元素个数
        printCollectionSize(c);
        //输出该集合是否包含字符串"four"
        containStringFour(c);
        //输出集合是否不含有任何元素
        printIsEmpty(c);
        //清空集合
        clearCollection(c);
        //输出该集合的元素个数
        printCollectionSize(c);
        //输出该集合是否包含字符串"four"
        containStringFour(c);
    }

    public static void printCollectionSize(Collection<String> c){
        System.out.println("集合元素个数:"+c.size());
    }

    public static void containStringFour(Collection<String> c){
        if(c.contains("four")){
            System.out.println("该集合包含字符串four");
        }else{
            System.out.println("该集合不包含字符串four");
        }
    }

    public static void printIsEmpty(Collection<String> c){
        if(c.isEmpty()){
            System.out.println("该集合不含任何元素");
        }else{
            System.out.println("该集合中有元素");
        }
    }

    public static void clearCollection(Collection<String> c){
        c.clear();
    }



}
