package shash;

public class SelectionSort {
public static void main(String[] args) {
	
	int [] numbers = {1,8,0,6,3,8,9,99};
	
	int temp;
	for(int i = 0; i < numbers.length; i++) {
	
		int minN = numbers[i];
		int min = i;
		
		for(int j = i; j < numbers.length; j++) {
			if(numbers[j] < minN) {
				minN = numbers[j];
				min = j;
			}
		}
		
		
			temp = numbers[i];
			numbers[i] = numbers[min];
			numbers[min] = temp;
		
	}
	
	for(int i = 0 ; i < numbers.length; i++) {
		System.out.println(numbers[i]);
	}
}
}
