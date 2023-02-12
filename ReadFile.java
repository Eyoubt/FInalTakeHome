package finalTakeHome;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		doesFileExist("src\\finalTakeHome\\dictionary.txt");
	}

	public static void doesFileExist(String path) throws IOException {

		File f = new File(path);

		FileReader fr = new FileReader(f);

		BufferedReader br = new BufferedReader(fr);
		String line;

		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
	}
}