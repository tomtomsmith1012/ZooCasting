package zoo;

import java.util.ArrayList;

import zoo.Zoo;

public class Main {

	
	
	
	public static void main(String[] args) {
		
	Zoo zc = new Zoo();
	zc.createZoo();
	
	zc.rollCall(zc.animals);
	zc.rollCall(new ArrayList<Animal>(zc.mammals));
	zc.rollCall(new ArrayList<Animal>(zc.birds));
	}
	
	

}
