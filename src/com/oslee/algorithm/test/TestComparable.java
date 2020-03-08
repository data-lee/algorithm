package com.oslee.algorithm.test;

import com.oslee.algorithm.sort.Student;

/**
 * @version:
 * @description: 定义测试类Test, 在测试类Test中定义测试方法Comparable getMax(Comparable c1, Comparable c2)完成测试
 * @author: Lee
 * @create: 2020-03-04 22:28
 */
public class TestComparable {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setUsername("张三");
        student1.setAge(18);

        Student student2 = new Student();
        student2.setUsername("李四");
        student2.setAge(20);

        Comparable max = getMax(student1, student2);
        System.out.println(max.toString());
    }

    public static Comparable getMax(Comparable c1, Comparable c2){
        int result = c1.compareTo(c2);
        // 如果result小于0, 则c1比c2小; 如果result小大0, 则c1比c2大; 如果result==0, 那么c1和c2一样大
        if (result >= 0){
            return c1;
        } else {
            return c2;
        }
    }
}
