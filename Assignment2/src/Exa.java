import java.util.Arrays;

public class Exa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array = {2,2,2,1};
		
	Arrays.sort(array);
	
	if(array.length <3) {
		
		System.out.println(array[array.length-1]);
	}
	   int count =0;
	
	//int[] array1 = new int[array.length];
	
	//array1[0] = array[array.length-1];
	
	for(int i=array.length-1;i>0;i--) {
		
		if(array[i]!=array[i-1]) {
			
			count++;
			
			//System.out.println(count);
			
		//	System.out.println(count);
		}
		
		
		if(count ==3) {
			
			System.out.println(array[i]);
			
		}
		
	}
	
	
	if(array.length == 3 && count ==1) {
		
		System.out.println(array[array.length-1]);
	}
	
		System.out.println(array[0]);
		//for(int ele : array) {
			
			//System.out.println(ele);
	//	}
	
}
}
	