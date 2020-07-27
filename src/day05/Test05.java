package day05;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * 有下列字符串:
 * 销售:张三;财务:李四;销售:王五;财务:赵六;程序:mike;程序:jerry;美工:jackson;前端:green;前端:nick;程序:钱七;销售:alice
 * 分析上述字符串然后统计每个职位总共多少人?
 * 使用Map保存统计的结果，其中key:职位,value为该职位人数
 * 然后分别输出各职位的名称(keySet),各职位人数(entrySet)
 *
 * @author Bonnie
 */
public class Test05 {
    public static void main(String[] args) {
        Map<String, Integer> job = new HashMap<String, Integer>();
        System.out.println("请输入职位名称与人物姓名信息：");
        Scanner sc = new Scanner(System.in);
        String input = sc.next().trim();
        String[] p = input.split(";");
        for (String s : p) {
            String[] d = s.split(":");
            String key = d[0];
            if (job.containsKey(key)) {
                job.put(key, job.get(key) + 1);
            } else {
                job.put(key, 1);
            }
        }

        System.out.println("keySet遍历职位名：");
        Set<String> keyset = job.keySet();
        for (String key : keyset) {
            System.out.print(key+" ");
        }
        System.out.println("");

        System.out.println("entrySet遍历职位人数：");
        Set<Map.Entry<String, Integer>> entryset = job.entrySet();
        for (Map.Entry<String, Integer> en : entryset) {
            String key = en.getKey();
            int n = en.getValue();
            System.out.println(key + "=" + n);
        }

    }

}
