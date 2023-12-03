package com.linearsearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int arr[][] = {
                {12, 3, 45, 4, 77, 44},
                {4, 55, 7, 88, 68},
                {88, 96, 84, 66},
                {44, 42, 62},
        };
        int target = 62;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

        static int[] search(int[][] arr, int target){
            for(int row=0;row<arr.length;row++){
                for(int col=0;col<arr.length;col++){
                    if(arr[row][col]==target){
                        return new int[] {row,col};
                    }
                }
            }
            return new int[]{-1,-1};
        }

}
