package com.linearsearch;

public class FindMin {
    public static void main(String[] args){
        int [] arr= {-12,1,4,5,6,7,8,9};
        System.out.println(min(arr));
    }

    static int min(int [] arr ){
        if(arr.length == 0){
            return -1;
        }
        int ans= arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
