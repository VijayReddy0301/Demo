import java.util.Arrays;
import java.util.Scanner;

public class DuplicateArray {

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
		
		System.out.println();

		System.out.println("Checked the Array Whether Duplicates Present Or Not.. See The Result ");
		
		Arrays.sort(array);

		boolean flag=false;

		for(int i=1;i<size;i++) {


			if(array[i]==array[i-1]) {

				System.out.println("Duplicate Element Present is "+ array[i]);
				flag =true;
			}

		}
		
		System.out.println();

		if(flag == false) {
			
			System.out.println("No Duplicate Elements Are Present");

		}
		

	}

}
