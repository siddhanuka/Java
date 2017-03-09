package arraylist;

public class Song implements Comparable<Song> {
	String title;
	String singer;
	
	public Song(String t, String s){
		title=t;
		singer=s;
	}

	@Override
	public int compareTo(Song s) {
		// TODO Auto-generated method stub
		return title.compareTo(s.getTitle());
	}
	public String getTitle(){
		return title;
	}

}
