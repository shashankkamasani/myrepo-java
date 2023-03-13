package shash;

public class MergeSort {
public static void main(String[] args) {
 int [] num = { 1,4,4,3,-1,1, 7 };
  int[] fin = mergeSort(num);
 
  InsertionSort.printArray(fin);
}

	public static int[] mergeSort(int [] numbers) {
	int arrayLength = numbers.length;
	
	if(arrayLength == 1) {
		return numbers;
	}
	
	int middle = arrayLength/2;
	int [] leftArr = new int [middle];
	int [] rightArr = new int [arrayLength-middle];
	
	for(int i = 0; i < middle; i++) {
		leftArr[i] = numbers[i];
	}
	int i =0;
	for(int j = middle; j < numbers.length; j++) {
	
		rightArr[i] = numbers[j];
		i++;
	}
        int[] sortedLeft = mergeSort(leftArr);
        int[] sortedRight  = mergeSort(rightArr);
	  
	    return merge(sortedLeft, sortedRight);
	}
	
	public static int [] merge(int [] left, int [] right) {
		int [] result = new int [left.length + right.length];
	int leftInd = 0;	
	int rightInd = 0;
	int resultInd = 0;

	while(leftInd < left.length && rightInd < right.length) {
		if(left[leftInd] > right[rightInd]) {
			result[resultInd] = right[rightInd];
			rightInd++;
			resultInd++;
		} else {
			result[resultInd] = left[leftInd];
			leftInd++;
			resultInd++;
		}
		
		if(rightInd == right.length) {
			for(int i = leftInd; i < left.length; i++) {
				result[resultInd] = left[leftInd];
				resultInd++;
				leftInd++;
			} 
			
			
		}
		if(leftInd == left.length) {
			for(int i = rightInd; i < right.length; i++) {
				result[resultInd] = right[rightInd];
				resultInd++;
				rightInd++;
			}
		}
	}
		
		return result;
	}
}
