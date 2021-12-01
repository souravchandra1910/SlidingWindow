class Solution {
    public String minWindow(String s1, String s2) {
   String ans="";
	    HashMap<Character,Integer>hm=new HashMap<>();
	    for(int i=0;i<s2.length();i++){
	        char ch=s2.charAt(i);
	        hm.put(ch,hm.getOrDefault(ch,0)+1);
	    }
	    
	    HashMap<Character,Integer>map=new HashMap<>();
	    
	    int i=-1,j=-1,mct=0,dc=s2.length();
	    
	    while(true){
	        boolean f1=false;
	        boolean f2=false;
	        
	        while(i < s1.length()-1 && mct < dc){
	            f1=true;
	            i++;
	            char ch=s1.charAt(i);
	            map.put(ch,map.getOrDefault(ch,0)+1);
	            if(map.getOrDefault(ch,0)<=hm.getOrDefault(ch,0)){
	                mct++;
	            }
	        }
	        while(j<i && mct==dc){
	            f2=true;
	           String pans=s1.substring(j+1,i+1);
	           if(ans.length()==0 || pans.length()<ans.length()){
	               ans=pans;
	           }
	           
	           j++;
	           char ch=s1.charAt(j);
	           int freq=map.get(ch);
	           if(freq==1){
	               map.remove(ch);
	           }
	           else{
	               map.put(ch,freq-1);
	           }
	           
	           if(map.getOrDefault(ch,0) < hm.getOrDefault(ch,0)){
	               mct--;
	           }
	        }
	        if(f1==false && f2==false){
	            break;
	        }
	    }
	    
		
		return ans;
       }
	}
