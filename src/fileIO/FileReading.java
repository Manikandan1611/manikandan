package fileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File mani = new File("/home/manikandan/Documents/mani.txt");
		FileReader reader = new FileReader(mani);
//		int r = reader.read();
//		int wordCount = 1;
//		int sentenceCount = 0;
//		while (r != -1) {
//			System.out.print((char) r);
//			if ((char) r == ' ')
//				wordCount++;
//			if ((char) r == '.')
//				sentenceCount++;
//			r = reader.read();
//		}
//		System.out.println("Word Count is" + wordCount);
//		System.out.println("Sentence Count is " + sentenceCount);

		BufferedReader bReader = new BufferedReader(reader);
		String output = bReader.readLine();
	
		int count = 0;
		String word = "is";
		String[] eachLine = output.split(" ");
		System.out.println("total word count "+eachLine.length);
		for (int i = 0; i < eachLine.length; i++) {
			if (eachLine[i].equals(word)) {
				count++;}
			
			
		}
		System.out.println("count "+count);
		System.out.println(output);
	}
}