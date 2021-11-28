import java.util.*;

public class CountOfSubArraysEqualsToZero {

	public static int solution(int[] arr) {
		int ans=0;
		HashMap<Integer,Integer>hm=new HashMap<>();
		int sum=0;
		hm.put(sum,1);
		int i=-1;
		while(i<arr.length-1){
		    i++;
		    sum+=arr[i];
		    if(hm.containsKey(sum)){
		        ans+=hm.get(sum);
		    }
		    hm.put(sum,hm.getOrDefault(sum,0)+1);
		}

		return ans;
	}
	
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
            	arr[i] = scn.nextInt();
            }
            System.out.println(solution(arr));
        }

	}

}

