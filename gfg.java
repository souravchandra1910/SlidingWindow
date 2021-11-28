// Given an array of integers Arr of size N and a number K. Return the maximum sum of a subarray of size K.

import java.util.*;

class gfg{
    static int maximumSumSubarray(int k, ArrayList<Integer> arr,int N){
         HashMap<Integer,Integer>hm=new HashMap<>();
         int max=0;
         int sum=0;
          for(int i=0;i<k-1;i++){
              sum+=arr.get(i);
            hm.put(sum,i);
    }
    int j=-1;
    for(int i=k-1;i<arr.size();i++){
        sum+=arr.get(i);
        if(sum>max){
            max=sum;
        }
        j++;
        sum-=arr.get(j);
    }
    return max;
    }
}