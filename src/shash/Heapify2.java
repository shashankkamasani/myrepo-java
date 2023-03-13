package shash;

public class Heapify2 {

	public static void main(String[] args) {
		int [] arr = {7,8,9,5,4,3,2,1};
		heapSort(arr);
		InsertionSort.printArray(arr);
	}
	
public static void heapSort(int[] intArray) {
	int arrLen = intArray.length;
	
	for(int i = arrLen-1; i >=0; i--) {
		
		for(int j = ((i+1)/2)-1; j>=0;j--) {
			heapify(intArray, i+1, j);
		}		
		int temp = intArray[0];
		intArray[0] = intArray[i];
		intArray[i] = temp;
	}
}

public static void heapify(int [] arr, int currentArrLen, int parentIdx) {
	int largestIdx = parentIdx;
	int leftIdx = 2*parentIdx + 1;
	int rightIdx = 2*parentIdx + 2;


	if(leftIdx < currentArrLen && arr[leftIdx] > arr[largestIdx]) {
		largestIdx = leftIdx;
	}
	
	if(rightIdx<currentArrLen && arr[rightIdx] > arr[largestIdx]) {
		largestIdx = rightIdx;
	}
	
	if(largestIdx != parentIdx) {
		int temp = arr[parentIdx];
		arr[parentIdx] = arr[largestIdx];
		arr[largestIdx] = temp;
		
	}
	
	
	
	
	
}
}	