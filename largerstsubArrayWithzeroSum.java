// 1. You are given an array(arr) of integers.
// 2. You have to find the length of the largest subarray with sum 0.

import java.util.*;
public class largerstsubArrayWithzeroSum {
    public static int solution(int[] arr) {
        int ans=0;
        int i=-1,sum=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(sum,i);
        while(i<arr.length-1){
            i++;
            sum+=arr[i];
            if(hm.containsKey(sum)){
                int fi=hm.get(sum);
                int len=i-fi;
                if(len>ans){
                    ans=len;
            }
          }
            else{
              hm.put(sum,i);  
            }
        }
  
          return ans;
      }
  
      public static void main(String[] args) {
          try (Scanner scn = new Scanner(System.in)) {
            int[] arr = new int[scn.nextInt()];
              for (int i = 0; i < arr.length; i++) {
                  arr[i] = scn.nextInt();
              }
              System.out.println(solution(arr));
        }
      }
  
  }
      

