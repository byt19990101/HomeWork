package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个List集合并添加元素0-9
 * 然后获取子集[3,4,5,6]
 * 然后将子集元素扩大10倍
 * 然后输出原集合。
 * 之后删除集合中的[7,8,9]
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <10; i++) {
            list.add(i);
        }

        List<Integer> list0 = list.subList(3,7);
        System.out.println("获取子集:"+list0);

        for (int i = 0; i <list0.size(); i++) {
            list0.set(i,list0.get(i)*10);
        }
        System.out.println("子集元素扩大10倍:"+list0);

        System.out.println("输出原集合:"+list);
        list.subList(7,10).clear();
        System.out.println("删除集合中的[7,8,9]:"+list);
    }

}
