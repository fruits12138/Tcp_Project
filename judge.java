//import java.util.*;
//
//public class judge {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // 从标准输入中读入第一组整数集的个数和数据
//        int n1 = scanner.nextInt();
//        int[] set1 = new int[n1];
//        for (int i = 0; i < n1; i++) {
//            set1[i] = scanner.nextInt();
//        }
//
//        // 从标准输入中读入第二组整数集的个数和数据
//        int n2 = scanner.nextInt();
//        int[] set2 = new int[n2];
//        for (int i = 0; i < n2; i++) {
//            set2[i] = scanner.nextInt();
//        }
//
//        // 判断两个数据集是否相同
//        int result = checkSameSet(set1, set2);
//        System.out.println(result);
//
//        // 按照从小到大的顺序分行输出第一个数据集中的数据及重复个数
//        printSet(set1);
//    }
//
//    public static int checkSameSet(int[] set1, int[] set2) {
//        if (set1.length != set2.length) {
//            return 0;
//        }
//
//        Map<Integer, Integer> count1 = new HashMap<>();
//        Map<Integer, Integer> count2 = new HashMap<>();
//
//        // 统计set1中每个数字的出现次数
//        for (int num : set1) {
//            count1.put(num, count1.getOrDefault(num, 0) + 1);
//        }
//
//        // 统计set2中每个数字的出现次数
//        for (int num : set2) {
//            count2.put(num, count2.getOrDefault(num, 0) + 1);
//        }
//
//        // 比较两个数据集中每个数字的出现次数
//        for (int num : set1) {
//            if (!count1.get(num).equals(count2.get(num))) {
//                return 0;
//            }
//        }
//
//        return 1;
//    }
//
//    public static void printSet(int[] set) {
//        Arrays.sort(set);
//        Map<Integer, Integer> count = new HashMap<>();
//
//        // 统计set中每个数字的出现次数
//        for (int num : set) {
//            count.put(num, count.getOrDefault(num, 0) + 1);
//        }
//
//        // 按照从小到大的顺序分行输出数据及重复个数
//        Set<Integer> printed = new HashSet<>();
//        for (int num : set) {
//            if (!printed.contains(num)) {
//                System.out.println(num + " " + count.get(num));
//                printed.add(num);
//            }
//        }
//    }
//}
