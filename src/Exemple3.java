import java.io.File;
import java.io.IOException;

public class Exemple3 {

	public static void main(String[] args) {
		
		try {
			File f = new File("MonFric.txt");
			if(f.createNewFile())
			{
				System.out.println("fichier cree");
			}
			else
			{
				System.out.println("fichier existe deja BOLOS !");
			}

			File rep = new File("MonRep");
			if (rep.mkdir()) {
				System.out.println("dossier créé");
			} else {
				System.out.println("dossier existe deja BOLOS !");
			}
			File f2 = null;
			if (f.renameTo(new File(System.getProperty("user.dir") + "\\MonRep\\MonFric.txt"))) {
				System.out.println("success");
				 f2 = new File(System.getProperty("user.dir") + "\\MonRep\\MonFric.txt");
			} else {
				System.out.println("failure");
			}

			if (rep.isDirectory()) {
				for (String chouette : rep.list()) {
					System.out.println(chouette);
				}
			}
			System.out.println(f.getAbsolutePath());
			if(f2.delete())
			{
				System.out.println("fichier suppr");
			}
			else
			{
				System.out.println("error");
			}
			rep.delete();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
