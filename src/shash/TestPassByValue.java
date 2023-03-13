package shash;

public class TestPassByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = new String("9");
		aMethod(input);
		System.out.println(input);

	}

	public static String aMethod(String inp) {
		inp = inp+1;
		String ret=inp;
		return inp;
		
	}
}
