package dataStructures;


	// Java program to illustrate HashMap class of java.util
	// package

	// Importing HashMap class
	import java.util.HashMap;

	// Main class
	public class Hash {

		// Main driver method
		public static void main(String[] args)
		{
			
			HashMap<String, Integer> map = new HashMap<>();

			
			map.put("a", 10);
			map.put("b", 30);
			map.put("c", 20);

			
			System.out.println("Size of map is:- "
							+ map.size());

			
			System.out.println(map);

			if (map.containsKey("a")) {

				
				Integer a = map.get("a");

				
				System.out.println("value for key"	+ " \"a\" is:- " + a);
			}
		}
	}


