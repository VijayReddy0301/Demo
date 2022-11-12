import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Size Of The Array :- ");
		
		int size = sc.nextInt();

		int[] array = new int[size];

		for(int i=0;i<size;i++) {

			System.out.println("Enter the element At " + i +" index  :-");
			array[i]=sc.nextInt();

		}

		System.out.println();

		System.out.println("The Array Is ");

		for(int a:array) {

			System.out.print(a+" ");
		}
		
		sc.close();
		
		for(int i=0;i<array.length;i++) {
			
			for(int j=1;j<array.length-i;j++) {
				
				if(array[j]<array[j-1]) {
					
					int tempVar = array[j];
					
					array[j]=array[j-1];
					
					array[j-1]=  tempVar;
				}
			}
		}
		
		System.out.println();

		System.out.println("Sorted Array Through Bubble Sort is  ");

		for(int a:array) {

			System.out.print(a+" ");
		}
		
		

	}

}
