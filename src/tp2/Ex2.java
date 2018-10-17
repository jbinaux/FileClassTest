package tp2;

import java.io.File;
import java.io.IOException;

public class Ex2 {

	static int showAbsolutePath(File f)
	{
		int tab = 0;
		int i = 0;
		int j = 0;
		while(i < f.getAbsolutePath().lastIndexOf("\\"))
		{
			if(f.getAbsolutePath().charAt(i) == '\\')
			{
				System.out.print("\n");
				while(j <= tab)
				{
					System.out.print('\t');
					j++;
				}
				j = 0;
				tab++;
			}
			else
			{
				System.out.print(f.getAbsolutePath().charAt(i));
			}
			i++;
		}
		System.out.print("\n");
		return tab;
	}
	static void showDirectory(String path, int tab)
	{
		File f = new File(path);
		int i = 0;
		int test = 0;
		String[] listFiles = f.list();
		if(tab == 0)
		{
			tab = showAbsolutePath(f);
		}
		for(String name : listFiles)
		{
			while(i <= tab)
			{
				System.out.print("\t");
				i++;														
			}
			test = testFile(f.getAbsolutePath() + "\\" + name, tab + 1);
			if(test == 1)
			{
				System.out.println(name);
			}
			else
			{
				System.out.println(name);
				showDirectory(f.getAbsolutePath() + "\\" + name, tab + 1);
			}
			i = 0;
		}
	}
	
	static int testFile(String path, int tab)
	{
		File f = new File(path);
		if(f.exists())
		{
			if(f.isFile())
			{
				return 1;
			}
			else if(f.isDirectory())
			{
				if(tab == 0)
				{
					showDirectory(path, tab);
				}
				return 2;
			}
			else
			{
				return -1;
			}
		}
		else
		{
			/*try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}*/
		}
		return -1;
	}
	
	public static void main(String[] args) {
		testFile("src", 0);
	}
}
