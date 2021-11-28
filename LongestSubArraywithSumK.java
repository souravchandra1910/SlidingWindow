// Given an array containing N integers and an integer K.
//  Your task is to find the length of the longest
//   Sub-Array with the sum of the elements equal to the given value K.

import java.util.*;

public class LongestSubArraywithSumK {
    public static int lenOfLongSubarr (int arr[], int N, int k) {
        int mlen=0;
        int sum=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        int i=-1;
        hm.put(sum,i);
        
        while(i<arr.length-1){
            i++;
            sum+=arr[i];
            if(hm.containsKey(sum)==false){
                hm.put(sum,i);
            }
              if(hm.containsKey(sum-k)==true){
                int len=i-hm.get(sum-k);
                if(len > mlen){
                    mlen=len;
                }
            }
        }
        return mlen;
    }   
}
