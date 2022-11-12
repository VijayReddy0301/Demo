import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

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
		
		int n =array.length;
		
		for(int i=0;i<n-1;i++) {
			
			int min=i;
			
			for(int j=i+1;j<n;j++) {
				
				if(array[j]<array[min]) {
					min =j;
				}
			}
			
			int temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}
		
		
		System.out.println();

		System.out.println("Sorted The Array Using Selection Sort ");

		for(int a:array) {

			System.out.print(a+" ");
		}
		
		

	}

}
