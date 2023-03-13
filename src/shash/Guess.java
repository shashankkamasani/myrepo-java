package shash;

public class Guess {
public static void main(String[]args) {
	
	String word = "Mississipi";
	String guess = "Mississipi";
	String placeHolder = word;
	int index = 0;
	int count = 0;
	 
	for(int j =0; j < word.length(); j++) {
		
		 placeHolder = placeHolder.substring(index , placeHolder.length());
		
		 if(placeHolder.indexOf(guess)  == -1) 
		 break;
		 
		 index = placeHolder.indexOf(guess) + guess.length();
		 count++;
		 
		
	 }
		int calc = guess.length()* guess.length()* count;
	System.out.println(calc);
	System.out.println(count);
}
}
