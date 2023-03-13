package shash;

public class binarySort {
public static void main(String[]args) {
	int [] numbers = {5,3,1,6,4,2};
	int temp = 0;
	int min = 0;
	for(int j = 0; j < numbers.length; j++) {
		
		for(int k = j; k < numbers.length; k++) {
			if(numbers[j]> numbers[k]) {
				min = j;	
			}
					}
		temp = numbers[j];
		numbers[j] = numbers[min];
		numbers[min] = temp;

	}
	
	for(int l = 0; l < numbers.length; l++) {
		System.out.println(numbers[l]);
	}
}
}
