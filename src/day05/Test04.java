package day05;

import java.util.*;

/**
 * 创建一个Map，保存某个学生的成绩:
 * 在控制台输入该学生成绩，格式:
 * 科目:成绩;科目:成绩;...
 * 例如:
 * 语文:99;数学:98;英语:97;物理:96;化学:95
 * 然后输出物理的成绩。
 * 然后将化学的成绩设置为96
 * 然后删除英语这一项。
 * 然后遍历该Map分别按照遍历key，Entry，value
 * 的形式输出该Map信息。
 *
 * @author Bonnie
 */
public class Test04 {
    public static void main(String[] args) {
        Map<String, Integer> stu = new HashMap<String, Integer>();
        System.out.println("请输学生成绩信息：");
        Scanner sc = new Scanner(System.in);
        String input = sc.next().trim();
        String[] cl = input.split(";");
        for (String s : cl) {
            String[] in = s.split(":");
            String sub = in[0];
            int score = Integer.parseInt(in[1]);
            stu.put(sub, score);
        }
        System.out.println(stu);

        System.out.println("输出物理成绩：" + stu.get("物理"));

        stu.put("化学", 96);
        System.out.println("更改化学成绩后：" + stu);

        stu.remove("英语");
        System.out.println("删除英语成绩后：" + stu);

        System.out.println("遍历key：");
        Set<String> kset = stu.keySet();
        for (String sub : kset) {
            int score = stu.get(sub);
            System.out.println(sub + "=" + score);
        }

        System.out.println("遍历Entry：");
        Set<Map.Entry<String, Integer>> eset = stu.entrySet();
        for (Map.Entry<String, Integer> en : eset) {
            String sub = en.getKey();
            int score = en.getValue();
            System.out.println(sub + "=" + score);
        }

        System.out.println("遍历value：");
        Collection<Integer> vset = stu.values();
        for(Integer i :vset){
            System.out.println(i);
        }


    }

}
