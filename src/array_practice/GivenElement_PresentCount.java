package array_practice;

public class GivenElement_PresentCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 3, 4, 3, 5, 6, 3, 7, 3 };
		int no = 3;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == no)
				count += 1;

		}
		System.out.println(no + " element Presented in " + count + " times");
	}

}
