package shash;

public class BubbleSort {
public static void main(String[]args) {
	int temp = 0;
	int[] numbers = {5, 31, 4, 4, 12, 1};
	
	for(int j = 0; j < numbers.length; j++) {
		
		for(int k = 0; k < numbers.length; k++) {
			if(k < numbers.length -1 && numbers[k] > numbers[k+1] ) {
				temp = numbers[k];
				numbers[k] = numbers [k+1];
					numbers[k+1] = temp;
		
			}
			
		}
		
		for(int l = 0; l < 6; l++) {
			System.out.println(numbers[l]);
		}
	}
}
}
