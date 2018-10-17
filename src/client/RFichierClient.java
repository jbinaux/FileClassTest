package client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class RFichierClient {

	public static Client[] lire(String myFile) throws IOException
	{
		Client[] clicli = new Client[3];
		String line = null;
		int i = 0;
		
		BufferedReader br = new BufferedReader(new FileReader(new File(myFile)));
		while((line = br.readLine()) != null)
		{
			clicli[i] = new Client(line.substring(line.lastIndexOf(':')+1,line.length()),line.substring(line.indexOf(':')+1, line.lastIndexOf(':')),Integer.parseInt(line.substring(0, line.indexOf(':'))));
			i++;
		}
		br.close();
		return clicli;
	}
	
	
	public static void main(String[] args) {
		try
		{
			for(Client cli : lire(System.getProperty("user.dir") + "\\clients.txt"))
			{
				System.out.println(cli);
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
