import java.util.Scanner;

public class FindDuplicate {

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
		
		
		for(int i=0;i<array.length-1;i++) {
			
			 for(int j=i+1;j<array.length;j++) {
				
				if(array[i]== array[j]) {
					
					System.out.println("Duplicate Elements in Given Array:" + array[j]);
				}
			}
		}
		

	}

}
