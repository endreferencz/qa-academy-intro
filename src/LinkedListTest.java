public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList names = new LinkedList();
		names.add("Zoli");
		names.add("Peter");
		names.add("Zoli");
		names.add("Zs�fi");
		names.add("Zoli");
		System.out.println(names.get(3));
		
		System.out.println(names.toString());
		names.remove("Zoli");
		System.out.println(names.toString());
		greet(names);
		
		
	}
	
	/**
	 * Say hello to all my friends, but greets everyone only once, even if
	 * he/she appears more than once in the list.
	 * For example: 
	 * <pre>
	 * names.add("Zoli");
	 * names.add("Peter");
	 * names.add("Zoli");
	 * names.add("Zs�fi");
	 * </pre>
	 * Result:
	 * <pre>
	 * Hello Zoli!
	 * Hello Peter!
	 * Hello Zs�fi!
	 * </pre>
	 * 
	 */
	public static void greet(LinkedList friends) {
		
		
	}

}
