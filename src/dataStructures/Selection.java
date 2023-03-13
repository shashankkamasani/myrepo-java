package dataStructures;

public class Selection {
	public static void main(String[] args) {
		
		int [] numbers = {5,12,0,2,7,8,9,97};
		
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
		
		for(int i =0 ; i < numbers.length; i++) {
			System.out.print(numbers[i] + ",");
		}
	}
}
