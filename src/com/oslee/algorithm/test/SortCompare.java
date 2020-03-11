package com.oslee.algorithm.test;


import com.oslee.algorithm.sort.Insertion;
import com.oslee.algorithm.sort.Shell;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SortCompare {
    public static void main(String[] args) throws IOException {
        // 1.
        ArrayList<Integer> list = new ArrayList<>();

        // 2. 读取 reverse_arr.txt 文件
//        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("reverse_arr.txt")));
        BufferedReader reader = new BufferedReader(new InputStreamReader(SortCompare.class.getClassLoader().getResourceAsStream("reverse_arr.txt")));
        String line = null;
        while((line = reader.readLine()) != null){
            // 3. 把每一个数字存入到集合中
//            list.add(Integer.valueOf(line));
            int i = Integer.parseInt(line);
            list.add(i);
        }
        reader.close();

        // 4. 把集合转换成数组
        Integer[] arr = new Integer[list.size()];
        list.toArray(arr);

//        testInsertion(arr); // 希尔插入执行的时间为: 20199毫秒
        testShell(arr); // 希尔排序执行的时间为: 23毫秒
    }

    // 测试希尔排序
    private static void testShell(Integer[] arr){
        // 1. 获取执行之前的时间
        long start = System.currentTimeMillis();
        // 2. 执行算法代码
        Shell.sort(arr);
        // 3. 获取执行之后的时间
        long end = System.currentTimeMillis();
        // 4. 算出程序执行的时间并输出
        System.out.println("希尔排序执行的时间为: " + (end - start) + "毫秒");
    }

    // 测试插入排序
    private static void testInsertion(Integer[] arr){
        // 1. 获取执行之前的时间
        long start = System.currentTimeMillis();
        // 2. 执行算法代码
        Insertion.sort(arr);
        // 3. 获取执行之后的时间
        long end = System.currentTimeMillis();
        // 4. 算出程序执行的时间并输出
        System.out.println("插入排序执行的时间为: " + (end - start) + "毫秒");
    }

}
