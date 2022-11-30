package fileIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriting {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// File mani = new File("/home/manikandan/Documents/mani.txt");
		// mani.createNewFile();
		// FileWriter m = new FileWriter(mani);
//		m.write("MANIKANDAN\t");
//		m.write("DEVAKUAMR\n");
//		m.write("SIVA");
//		m.flush();
//		m.close();

		// BufferedWriter a = new BufferedWriter(m);
//		a.write("mani");
//		a.newLine();
//		a.write("Deva");
//		a.flush();
//		a.close();
//		m.close();

		PrintWriter n = new PrintWriter("/home/manikandan/Documents/mani.txt");
		n.write("Deva is a comedy fellow. siva is a brillient man. paul is a very tallented person.");
		n.flush();
		n.close();
		// a.close();
		// m.close();

	}

}
