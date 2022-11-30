package fileIO;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file_obj = new File("/home/manikandan/Documents/mani.txt");
		file_obj.createNewFile();
		// file_obj.delete();
		System.out.println("file length " + file_obj.length());
		System.out.println("file present " + file_obj.exists());
		// file_obj.isHidden();
		System.out.println(file_obj.getPath());
		System.out.println(file_obj.getName());
		System.out.println(file_obj.isDirectory());
		System.out.println(file_obj.isFile());
		System.out.println(file_obj.mkdir());
		System.out.println(file_obj.mkdirs());

	}

}
