import java.io.FileWriter;
import java.io.IOException;

public class Exemple5 {

	public static void main(String[] args) {
		try
		{
			FileWriter fw = new FileWriter("MonFric.txt");
			fw.write("De l'argeeeeeent !");
			fw.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

	}

}
