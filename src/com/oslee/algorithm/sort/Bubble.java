package com.oslee.algorithm.sort;


public class Bubble {

    /*
    对数组内的元素进行排序
     */
    public static void sort(Comparable[] a){
        for (int i = a.length - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if (greater(a[j], a[j + 1])){
                    exch(a, j, j + 1);
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
