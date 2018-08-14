package edu.uvm.jchen27.sortFunctions;

public class QuickSort {
	public int partition(int [] arr, int low, int high){
		int pivot = arr[low];
		while(low < high){
			while(low < high && arr[high] >= pivot) high--;
			
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			
			while(low < high && arr[low] <= pivot) low ++; 
			 
		    temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;

		}
		
		return low;
	}
	
	public void quickSort(int[] arr, int low, int high){
		if(low < high){
			int pivotLoc = partition(arr, low, high);
			quickSort(arr, low, pivotLoc-1);
			quickSort(arr, pivotLoc+1, high);
			
		}
	}
	
	public void printArr(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args){
		
		int[] arr = {3, 5, 4, 1, 2, 8, 6, 9, 12};
		QuickSort qs = new QuickSort();
		qs.printArr(arr);
		System.out.println("");
		qs.quickSort(arr, 0, arr.length - 1);
		qs.printArr(arr);
	}
}
