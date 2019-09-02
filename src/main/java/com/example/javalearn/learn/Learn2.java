package com.example.javalearn.learn;

import java.util.Scanner;

/**
 * 判断回文字符串
 * 例如：aa是回文,a是,abc不是,aba是
 *
 * @author ：shaonan
 * @date ：Created in 2019/8/29 14:05
 */
public class Learn2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        boolean isPalindrome = true;
        int low = 0;
        int high = str.length() - 1;
        while (low < high) {
            if (str.charAt(low) != str.charAt(high)) {
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }
        if (isPalindrome) {
            System.out.println(str + "是回文字符串");
        } else {
            System.out.println(str + "不是回文字符串");
        }
    }
}
