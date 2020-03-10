package com.oslee.algorithm.sort;

/**
 * @version:
 * @description:
 * @author: Lee
 * @create: 2020-03-10 22:37
 */
public class Insertion {

    /*
    对数组a中的元素进行排序
     */
    public static void sort(Comparable[] a){
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0 ; j--) {
                // 比较索引j处的值和索引j-1处的值, 如果索引j-1处的值比索引j处的值大, 则交换数据
                // 如果不大, 那么就找到合适的位置了, 退出
                if(greater(a[j - 1], a[j])) {
                    exch(a, j - 1, j);
                } else {
                    break;
                }
            }
        }
    }

    /*
    判断v是否大于w
     */
    private static boolean greater(Comparable v, Comparable w){
        return v.compareTo(w) > 0;
    }

    /*
    交换a数组中, 索引i和索引j处的值
     */
    private static void exch(Comparable[] a, int i, int j){
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
