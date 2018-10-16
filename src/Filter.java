import java.io.File;
import java.io.FileFilter;

public class Filter {

	public static void main(String[] args) {
		// répertoire de recherche

		String rep = "C:\\Users\\jonas\\Documents\\GitHub\\JAVA\\FileClassTest\\src\\" ;

		// construction d'un fichier sur ce répertoire

		File repFile = new File(rep) ;

		// filtrage du contenu de ce répertoire

		// on passe en paramètre une instance de classe anonyme

		File [] fichiersJava = repFile.listFiles(new FileFilter() {

		// cette interface n'a qu'une unique méthode
		@Override
		public boolean accept(File pathname) {

		// on récupère le nom de ce fichier...

		String fileName = pathname.getName() ;

		// ... et on teste s'il se termine par .java

		return fileName.endsWith(".java");

		}});
		for(File truc:fichiersJava)
		{
			System.out.println(truc);
		}
	}

}
