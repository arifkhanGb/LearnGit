package com.learngit;

public class FindDuplicate {
    public static void main(String[] args) {

        int arr[] =new int[] {5,1,2,4,3,2};
        int ans = 0;

        for(int i =0; i < arr.length; i++) {

            ans = ans ^ arr[i];
        }

        for(int i =1; i < arr.length ; i++) {

            ans = ans ^ i;
        }

        System.out.println(ans);


    }
}
