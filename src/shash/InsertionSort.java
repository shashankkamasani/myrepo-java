package shash;

public class InsertionSort {
	public static void main(String[] args) {
		int[] numbers = { 1,0,0 };

		
		
		for (int j = 1; j < numbers.length; j++) {
        int index = j-1;
        int temp = numbers[j];
			while( (index >= 0) && (numbers[index]> temp)) {
			numbers[index+1] = numbers[index];
			index--;
			}
              numbers[index+1] = temp;
			
		}
		for(int i =0 ; i < numbers.length; i++) {
			System.out.print(numbers[i] + ",");
		}
	}
	public static void printArray(int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + ",");
			
		}
	}
}
