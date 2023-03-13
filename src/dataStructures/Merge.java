package dataStructures;

public class Merge {

	
	public static int[] mergeSort(int [] numbers) {
		int arrayL = numbers.length;
		
		if(arrayL == 1) {
			return numbers;
		}
		
		int middle = arrayL/2;
		int [] leftArr = new int [middle];
		int [] rightArr = new int [arrayL-middle];
		
		for(int i = 0; i < middle; i++) {
			leftArr[i] = numbers[i];
		}
		
		int i =0;
		for(int j = middle; j < numbers.length; j++) {
		
			rightArr[i] = numbers[j];
			i++;
		}
	        int[] sortedL = mergeSort(leftArr);
	        int[] sortedR  = mergeSort(rightArr);
		    return merge(sortedL, sortedR);
		}
	
	
	public static int [] merge(int [] leftA, int [] rightA) {
		int [] resultA = new int [leftA.length + rightA.length];
	    int leftI = 0;	
	    int rightI = 0;
	    int resultI = 0;

	while(leftI < leftA.length && rightI < rightA.length) {
		    if(leftA[leftI] > rightA[rightI]) {
			resultA[resultI] = rightA[rightI];
			rightI++;
			resultI++;
			
	} else {
			resultA[resultI] = leftA[leftI];
			leftI++;
			resultI++;
			
	  }
		
		if(rightI == rightA.length) {
			for(int i = leftI; i < leftA.length; i++) {
				resultA[resultI] = leftA[leftI];
				resultI++;
				leftI++;
				
		    } 
			
			
		}
		
		if(leftI == leftA.length) {
			for(int i = rightI; i < rightA.length; i++) {
				resultA[resultI] = rightA[rightI];
				resultI++;
				rightI++;
			}
}
	}
		
		return resultA;
		
	}
}
