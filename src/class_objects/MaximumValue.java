package class_objects;

public class MaximumValue {
	int large(int a[]) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MaximumValue v = new MaximumValue();
		int k[] = { 4, 6, 8, 32, 46 };
		System.out.println(v.large(k));

	}

}
