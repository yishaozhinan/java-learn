package com.example.javalearn.learn;

import java.util.Scanner;

/**
 * 输入一个数字,判断是否是闰年
 *
 * @author ：shaonan
 * @date ：Created in 2019/8/29 13:56
 */
public class Learn1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        if (isLeapYear) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "不是闰年");
        }
    }
}
