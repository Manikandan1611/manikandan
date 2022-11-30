package fileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class File_read_write {

	public static void main(String[] args) throws IOException {
		File mani = new File("/home/manikandan/Documents/dhoni.txt");
		mani.createNewFile();
		FileReader reader = new FileReader(mani);
		PrintWriter n = new PrintWriter(mani);
		n.write("Dhoni is a captain of indian cricket team");
		n.flush();

		BufferedReader bReader = new BufferedReader(reader);
		String output = bReader.readLine();

		int count = 0;
		String word = "captain";
		String[] eachLine = output.split(" ");
		System.out.println("total word count " + eachLine.length);
		for (int i = 0; i < eachLine.length; i++) {
			if (eachLine[i].equals(word)) {
				count++;
			}

		}
		System.out.println("count " + count);
		System.out.println(output);

	}

}
