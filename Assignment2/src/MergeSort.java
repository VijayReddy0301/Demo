import java.util.Scanner;

class MergeTheArray{
	
	
	public void sort(int [] arr ,int [] temp,int low , int high ) {
		
		if(low<high) {
		
		int mid = low + (high-low) /2;
		
		sort(arr,temp,low , mid);  //  This is Used To Sort Left Part Of Array
		
		sort(arr, temp, mid+1 ,high);  // This is Used To Sort Right Part Of Array
		
		merge(arr,temp,low ,mid,high);   // Merge The Two Sorted Arrays
		
		}
		
	}

	public void merge(int[] arr, int[] temp, int low, int mid, int high) {
		
		for(int i=low;i<=high;i++) {
			
			temp[i]=arr[i];
		}
		
		int i=low;
		
		int j=mid+1;
		
		int k=low;
		
		while(i<=mid && j<=high) {
			
			if(temp[i]<=temp[j]) {
				
				arr[k]=temp[i];
				
				i++;
			}else {
				
				arr[k]=temp[j];
				j++;
			}
			
			k++;
		}
		
		while(i<=mid) {
			
			arr[k]=temp[i];
			i++;
			k++;
		}
	}
	
}



public class MergeSort {
	
	
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
		
		printArray(array);
		
		sc.close();
		
		int[] temp = new int[size];
		
		MergeTheArray ms = new MergeTheArray();
		
		ms.sort(array,temp,0,array.length-1);
		
		System.out.println("Sorted Array By Using MergeSort ");
		
		printArray(array);

	}

}
