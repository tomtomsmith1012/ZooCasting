package zoo;

public class Owl extends Bird {

	//Attributes
	
	//Constructors
	public Owl (String name, String colour, int age, int ID) {
		super(name, colour, age, ID);
	}
	
	//Methods
	public String makeNoise() {
		return "'Hoot'";
	}
}
