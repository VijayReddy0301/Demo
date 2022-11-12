import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
	String s ="Marge, let's \"[went].\" I await {news} telegram.[ [" ;
		
	     
		 s= s.toLowerCase();
		 
		 StringBuffer sb = new StringBuffer(s);
	        
	        for(int i=0;i<sb.length();i++){
	            
	            if(!(sb.charAt(i)>47 && sb.charAt(i)<58 || sb.charAt(i)>64 && sb.charAt(i)<91 ||sb.charAt(i)>96 &&  sb.charAt(i)<123)){
	                
	           //   String st = s.charAt(i)+"";
	                
	            //   s =s.replace(st, "");
	            	//System.out.println(i);
	            	
	            	char ch = sb.charAt(i);
	            	
	            //	System.out.println(i);
	            	
	            	 System.out.println(ch);
	            	
	           sb = sb.deleteCharAt(sb.charAt(i));
	            
	          // System.out.println(i);
	            	
	            }
	            
	        }
	        
       
        
        System.out.println(sb); 
		
		// Next Solution
		
		
		
		int[] nums = {3,2,3};
		
		 Arrays.sort(nums);
		 
		 for(int ele :nums) {
			 
			 System.out.println(ele);
		 }
		 
		 boolean flag=false;
	        int count =0;
	        for(int i=1;i<nums.length;i++){
	            
	            if(nums[i]==nums[i-1]){
	                count++;
	                
	                if(count>=nums.length/2){
	                    
	                    System.out.println(nums[i]);
	                }
	           }else {
	            	
	            	flag = true;
	            }
	            if(flag == true) {
	            	
	            	count =0;
	            	flag = false;
	            }
	            
	        }
	        
	        
	        
		
		
		int[] num = {3,2,3,3,3,2,3,2,2,2,2,2};
		
		int count = 0; int major = num[0];
		for(int i:num) {
			if(count==0){ major=i; count++;	}
			else if(i==major) count++;
			else count--;
		}
		 System.out.println(major);
		
		**/
		
		
		
		String s = "abbaca";
	
		
		char [] ch = s.toCharArray();
		
		Arrays.sort(ch);
		
		System.out.println(ch);
		
		String newString = "";
		int i =0 ,j=1;
		while(i<=ch.length&&j<=ch.length) {
			
			
			if(i == ch.length) {
				newString = newString+ch[i];
				
			}
			
			if(j == ch.length) {
				
				newString = newString+ch[j];
				
			}
			
			
			
			if(ch[i]==ch[j]) {
				
				i=j+1;
				j=i+1;
			}else {
				
				newString = newString+ch[i];
				i++;
				j++;
			}
		}
		
		System.out.println(newString);
		
	} 

}
