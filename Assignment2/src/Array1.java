import java.util.Scanner;

public class Array1 {

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
	}

}
