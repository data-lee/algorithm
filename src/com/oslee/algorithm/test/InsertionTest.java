package com.oslee.algorithm.test;

import com.oslee.algorithm.sort.Insertion;

import java.util.Arrays;

/**
 * @version:
 * @description:
 * @author: Lee
 * @create: 2020-03-10 22:45
 */
public class InsertionTest {
    public static void main(String[] args) {
        Integer[] a = {4, 3, 2, 10, 12, 1, 5, 6};
        Insertion.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
