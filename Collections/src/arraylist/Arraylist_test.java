package arraylist;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Arraylist_test {

	static ArrayList<Song> songlist=new ArrayList<Song>();
	//static ArrayList<String> songlist2=new ArrayList<String>();
	
	public static void main(String[] args) throws IOException {
		new Arraylist_test().go();
		System.out.println(songlist);
		Collections.sort(songlist);
		System.out.println(songlist);
		//System.out.println(songlist2);
	}

	private void go() throws IOException {
		File f=new File("songs.txt");
		BufferedReader reader=new BufferedReader(new FileReader(f));
		String line=null;
		while((line=reader.readLine())!=null){
			System.out.println("before calling addsong method");
			addsong(line);
			System.out.println("after calling addsong method");
	}
		
		
	}

	private void addsong(String line) {
		System.out.println("inside addsong" );
		String[] token=line.split("/");
		Song nextsong=new Song(token[0],token[1]);
	    songlist.add(nextsong);
		System.out.println("sanchit");
		//songlist2.add(token[1]);
		
	}

}
