import java.io.*;

public class Exemple6 {

	public static void main(String[] args) {
		try
		{
			File f = new File("MonFric.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String ligne = null;
			while ((ligne = br.readLine()) != null)
			{
				System.out.println(ligne);
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
