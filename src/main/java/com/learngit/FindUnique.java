package com.learngit;

public class FindUnique {

    public static void main(String[] args) {
        int arr[] = {3,6,1,3,6};

        int ans = 0;
        for(int i = 0 ; i < arr.length; i++) {



            ans =ans ^ arr[i];

            System.out.println(ans);

        }
        System.out.println("unique value is : " + ans);

    }
}

