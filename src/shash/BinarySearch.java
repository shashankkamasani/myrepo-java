package shash;
import java.util.Scanner;
public class BinarySearch {
public static void main(String[]args) {
	Scanner input = new Scanner(System.in);
	int result = 0;
	int start = 0; 
	int end = 0;
	
	int [] numbers = {1,2,3,4,5,6};
	System.out.println("enter the number to be searched.");
	int num = input.nextInt();
	int j = 0;
	end = numbers.length -1;
	do {
		
		j++;
		System.out.println(j);
	if(numbers[(end - start) / 2] < num) {	
	start = (end - start) / 2;
	
	} else {
		end = (end-start)/2;
	}
	
	}while (start!=end);
 	result = start;
 	
 	
 	if(num == numbers[result]) {
 		System.out.println(numbers[result]);
 	}
}
}
