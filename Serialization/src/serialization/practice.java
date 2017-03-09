package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class practice implements Serializable {

	int x;
	String name;
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		practice p=new practice();
		p.x=10;
		p.name="sanchit";
		
		try{
			FileOutputStream s=new FileOutputStream("test.txt");
			ObjectOutputStream os=new ObjectOutputStream(s);
			
			os.writeObject(p);
			os.close();
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
		try {
			FileInputStream is=new FileInputStream("test.txt");
			ObjectInputStream s=new ObjectInputStream(is);
			Object one=s.readObject();
			practice p1=(practice) one;
			System.out.println("the number is "+p1.x);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
