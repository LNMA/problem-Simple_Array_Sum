package com.louay.projects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please input length of array : ");
        int length = input.nextInt();

        Integer [] arr = new Integer[length];

        System.out.println("please input your integer number : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        resultOfSum(arr);
    }

    public static void resultOfSum(Integer [] arr){
        Integer result = 0;
        for (Integer num: arr) {
            result += num;
        }
        System.out.println( "The result of the sum is : "+result);
    }
}
