// Given an array A[] of size N and a positive integer K,4
//  find the first negative integer for each and every window(contiguous subarray) of size K.
class abc {
    
    public long[] printFirstNegativeInteger(long arr[], int N, int k)
    {
        long []ans=new long[N-k+1];
        int idx=0;
        int i=k-1;
        int j=0;
       
        while(i<arr.length){
            int count=0;
            for(int a=j;a<=i;a++){
            long val=arr[a];
            if(val<0){
                count++;
                ans[idx++]=arr[a];
                break;
            }
            
            }
            if(count==0)ans[idx++]=0;
            i++;
            j++;
        }
        return ans;
    }
}