package tp2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex3 {

	public static void main(String[] args) {
		try {
			BufferedReader buf = new BufferedReader(new FileReader("src\\tp2\\Ex3.java"));
			String line;
			while((line = buf.readLine()) != null)
			{
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
