package regular_expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RegexDemo rd = new RegexDemo();
		// rd.regex_1();
		// rd.regex_2();
		// rd.regex_3();
		rd.regex_4();

	}

	private void regex_4() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter anything here: ");
		String input = sc.nextLine();
		// Pattern patternObj = Pattern.compile("[^A-Za-z0-9]");
		// Pattern patternObj = Pattern.compile("[0-9]");
		// Pattern patternObj = Pattern.compile("[a-z0-9]");
		// Pattern patternObj = Pattern.compile("(0|91)?[6-9][0-9]{9}");
		Pattern patternObj = Pattern.compile("(0|91)?[6-9]\\d{9}");

		Matcher matcherObj = patternObj.matcher(input);
		// System.out.println(matcherObj.find());
		while (matcherObj.find()) {
			System.out.print(matcherObj.group());
		}

	}

	private void regex_3() {

		String input = "abcd abcd abcd abcd abc bc abc";
		Pattern patternObj = Pattern.compile("[^abc]");
		Matcher matcherObj = patternObj.matcher(input);
		// System.out.println(matcherObj.find());
		while (matcherObj.find()) {
			System.out.print(matcherObj.group());
		}

	}

	private void regex_2() {
		// TODO Auto-generated method stub
		String input = "abcd abcd abcd abcd abcde abc abcd";
		// Pattern patternObj = Pattern.compile("[^abc]");
		Pattern patternObj = Pattern.compile("abc$");
		Matcher matcherObj = patternObj.matcher(input);
		// System.out.println(matcherObj.find());
		while (matcherObj.find()) {
			System.out.print(matcherObj.group() + " ");
		}

	}

	private void regex_1() {
		// TODO Auto-generated method stub
		String input = "abcd abcd abcd abcd abc bc abc";
		Pattern patternObj = Pattern.compile("[abc]");
		Matcher matcherObj = patternObj.matcher(input);
		// System.out.println(matcherObj.find());
		boolean found = matcherObj.find();
		while (found == true) {
			System.out.print(matcherObj.group() + "-");
			found = matcherObj.find();
		}

	}
}
