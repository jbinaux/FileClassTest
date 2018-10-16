import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Exemple4 {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("MonZoo.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Object monChien = "Bacchus";
			oos.writeObject(monChien);
			Object monCanard = "Huber";
			oos.writeObject(monCanard);
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		FileInputStream fin;
		try {
			fin = new FileInputStream("MOnZoo.ser");
			ObjectInputStream ois = new ObjectInputStream(fin);
			Object chien = (Object) ois.readObject();
			System.out.println(chien);
			Object canard = (Object) ois.readObject();
			System.out.println(canard);
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
