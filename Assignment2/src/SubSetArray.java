import java.util.Arrays;
import java.util.Scanner;

public class SubSetArray {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Size Of The 1 Array :- ");
		
		int size1 = sc.nextInt();

		int[] array = new int[size1];

		for(int i=0;i<size1;i++) {

			System.out.println("Enter the element At " + i +" index  :-");
			array[i]=sc.nextInt();

		}
		
		System.out.println("Enter The Size Of The 2 Array :- ");
		
		int size = sc.nextInt();

		int[] array2 = new int[size];

		for(int i=0;i<size;i++) {

			System.out.println("Enter the element At " + i +" index  :-");
			array2[i]=sc.nextInt();

		}

		System.out.println();

		System.out.println("The 2  Array Are  ");

		for(int a:array) {

			System.out.print(a+" ");
		}
		
		System.out.print("     And   ");
		
		for(int a:array2) {

			System.out.print(a+" ");
		}
		
		sc.close();
		
		
		System.out.println();
		System.out.println();
		
		int[] array3,array4;
		
		if(size1>=size) {
			
			
			array3 =array;
			array4 =array2;
			
		}else {
			
			array3 =array2;
			array4 =array;
		}
		
		
		int count =0;
		boolean flag = false;
		for(int i=0;i<array4.length;i++) {
			
			
			 count = Arrays.binarySearch(array3, array4[i]);
			
			if(count<0) {
				
				flag=true;
			}
			
			
		}
		
		
		if(flag == true) {
			
			System.out.print("{ ");

			for(int a:array4) {

				System.out.print( a+" ");
			}
			
			System.out.print(" }");
			
			System.out.print(" is  Not Subset Of ");
			
			System.out.print("{ ");
			
			for(int a:array3) {

				System.out.print(a+" ");
			}
			
			System.out.print(" }");
		
			
		}else {
			
			if(array4.length==0  ||  array3.length==0) {
				
				System.out.println("Empty Arrayset is Always Subset to Other ArraySet");
			}
			else {
				
				System.out.print("{ ");
				
			for(int a:array4) {

				System.out.print(a+" ");
			}
			
			System.out.print("}");
			
			System.out.print(" is Subset OF ");
			
			System.out.print("{ ");
			
			for(int a:array3) {

				System.out.print(a+" ");
			}
			
			System.out.print("}");
			}
		}
		
		
		
	}

}
