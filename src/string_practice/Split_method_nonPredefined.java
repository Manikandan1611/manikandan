package string_practice;

public class Split_method_nonPredefined {
	public static void main(String[] args) {
		Split_method_nonPredefined mani = new Split_method_nonPredefined();

		String date = "21/11/2022";
		mani.splitTheDate(date, '/');

	}

	private void splitTheDate(String date, char sp) {
		// TODO Auto-generated method stub

		for (int i = 0; i < date.length(); i++){
			if (date.charAt(i) != sp) {
				System.out.println(date.charAt(i));
			}
		}
	}

}
