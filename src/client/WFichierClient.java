package client;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WFichierClient {

	public static void ecrire(Client[] myClients, String myFile) throws IOException
	{
		FileWriter fw = new FileWriter(myFile);
		BufferedWriter bw = new BufferedWriter(fw);
		for(Client cli : myClients)
		{
			bw.write(cli.toString());
			bw.write("\n");
		}
		bw.close();
	}
	
	public static void main(String[] args) {
		Client cli1 = new Client("bob", "moranne", 12);
		Client cli2 = new Client("bruce", "wayne", 7);
		Client cli3 = new Client("marie", "curie", 1);
		Client[] clicli = new Client[3];
		clicli[0] = cli1;
		clicli[1] = cli2;
		clicli[2] = cli3;
		
		File cli4 = new File("clients.txt");
		try
		{
			cli4.createNewFile();
			ecrire(clicli, cli4.getAbsolutePath());
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
}
