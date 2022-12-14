package collection_framework;

import java.util.Comparator;

public class MyComparator implements Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Mobiles m1 = (Mobiles) o1;
		Mobiles m2 = (Mobiles) o2;
		if (m1.price > m2.price)
			return +1234;
		else if (m1.price < m2.price)
			return -1234;
		return 0;
	}

}
