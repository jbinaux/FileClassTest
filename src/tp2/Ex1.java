package tp2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {
	
	public static int readNumber(String line)
	{
		int number = 0;
		try
		{
			number = Integer.parseInt(line);
			if(number >= 0 && number <= 20)
			{
				return number;
			}
			else
			{
				System.out.println("entrez un nombre entre 0 et 20");
				return -1;
			}
		}
		catch (NumberFormatException e)
		{
			System.out.println("entrez un nombre");
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String line = null;
		ArrayList<Integer> list = new ArrayList<Integer>();
		int number = 0;
		double total = 0;
		int nbNote = 0;
		
		while(!(line = scan.nextLine()).equals("fini"))
		{
			if((number = readNumber(line)) != -1)
			{
				total += number;
				nbNote++;
			}
		}
		if(nbNote != 0)
		{
			System.out.println("moyenne = " + new DecimalFormat("#.#").format(total / nbNote));
		}
		else
		{
			System.out.println("entrez au moins une note !");
		}
	}
	
}
