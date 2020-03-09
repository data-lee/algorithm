package com.oslee.algorithm.sort;


public class Selection {

    /*
    对数组a中的元素进行排序
     */
    public static void sort(Comparable[] a){
        for (int i = 0; i < a.length - 1; i++) {
            // 定义一个变量 记录最小元素所在的索引 默认为参与选择排序的第一个元素所在的位置
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                // 比较最小索引minIndex处的值和j索引处的值
                if(greater(a[minIndex], a[j])){
                    minIndex = j;
                }
            }
            // 交换最小元素所在索引minIndex处的值和索引i的位置
            exch(a, i, minIndex);
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