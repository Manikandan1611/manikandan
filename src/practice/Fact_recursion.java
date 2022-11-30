package practice;

public class Fact_recursion
{
 
	int find_fact(int num)
	{
		
		if (num == 1)
			return num;
		return num * find_fact(num - 1);

	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Fact_recursion s = new Fact_recursion();
		s.find_fact(5);
		System.out.println(s.find_fact(5));

	}

}
