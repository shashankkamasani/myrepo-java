package shash;

public class Heapify {

	public static void main(String[] args) {
		int [] arr = {3,1,2,5,4,-1};
		heapSort(arr);
		InsertionSort.printArray(arr);
	}
	
public static void heapSort(int[] intArray) {
	int arrLen = intArray.length;
	
	for(int i = arrLen/2-1; i>=0;i--) {
		heapify(intArray, arrLen, i);
	}
	for(int i = arrLen-1; i >=0; i--) {
		int temp = intArray[0];
		intArray[0] = intArray[i];
		intArray[i] = temp;
		
		heapify(intArray, i, 0);
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
		
		heapify(arr, currentArrLen, largestIdx);		
		
	}
	
	
	
	
	
}
}	