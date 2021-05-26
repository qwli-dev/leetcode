package com.qwli7.algorithm.sort;

/**
 * @author liqiwen
 * @date 2021-03-17
 * 计数排序算法 java 实现
 **/
public class CountSort {
  public static void main(String[] args) {
    System.out.println("hello world");
  }
  
  
   public static void sort(int[] arr) {
        int[] count = new int[10];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int[] newArr = new int[arr.length];
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                newArr[j++] = i;
                count[i]--;
            }
        }

        System.out.println(Arrays.toString(newArr));

    }
}
