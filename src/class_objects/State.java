package class_objects;

public class State {
	String name;
	static String country = "India";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "mani";
		System.out.println(name);
		State tn = new State();
		tn.name = "Tamilnadu";
		State kr = new State();
		kr.name = "kerala";
		System.out.println(country);
		System.out.println(tn.name);
		System.out.println(kr.name);

	}

}
