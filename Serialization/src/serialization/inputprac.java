package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class inputprac implements Serializable {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		try {
			FileInputStream is=new FileInputStream("test.txt");
			ObjectInputStream s=new ObjectInputStream(is);
			Object one=s.readObject();
			inputprac p=(inputprac) one;
			System.out.println(p);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
