import java.util.Scanner;

class ArrayQuickSort{
	
	int partition(int[] arr , int low, int high) {
		
		int pivot = arr[high];
		
		int i = low;
		int j= low;
		
		while(i<=high) {
			
			if(arr[i]<= pivot) {
				
				int temp = arr[i];
				
				arr[i] = arr[j];
				
				arr[j] = temp;
				j++;
			}
			
			i++;
		}
		
		return j-1 ;
		
	}
	
	
	public void sort(int [] arr ,int low , int high) {
		
		if(low<high) {
			
			int p = partition(arr, low, high);
			
			sort(arr,low,p-1);
			
			sort(arr,p+1,high);
		}
		
	}
	
	

	
}

public class QuickSort {
	

	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

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
		

		ArrayQuickSort as = new ArrayQuickSort();
		
		as.sort(array, 0, array.length-1);
		
		System.out.println();
		
		System.out.println("Sorted The Array Using Quick Sort");
		
		printArray(array);
		
		

	}

}
