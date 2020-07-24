package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 创建一个集合，存放元素"1","$","2","$","3","$","4"
 *   使用迭代器遍历集合，并在过程中删除所有的"$"，
 *   最后再将删除元素后的集合使用新循环遍历，并输出每一个元素。
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("1");
        c.add("$");
        c.add("2");
        c.add("$");
        c.add("3");
        c.add("$");
        c.add("4");

        //使用迭代器遍历集合，并在过程中删除所有的"$"
        Iterator<String> it = c.iterator();
        while(it.hasNext()){
            String str = it.next();
            if(str.equals("$")){
                it.remove();
            }
        }

        //删除后新循环遍历
        for(String s : c){
            System.out.println(s);
        }
    }

}
