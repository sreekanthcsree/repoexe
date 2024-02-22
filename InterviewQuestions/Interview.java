package com.InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class Interview {

   // int [] i = {1,2,3,4,1,2,3,4};
  //  int k = 3;

    public static boolean duplicateNum(int[] nums,int k){
        Set<Integer> set = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
            if(set.size()>k){
                set.remove(nums[i-k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,1,2,3,3};
        int k = 3;
        boolean result = duplicateNum(nums,k);
        System.out.println("Duplicated within distance : "+k+":"+result);
    }
}
