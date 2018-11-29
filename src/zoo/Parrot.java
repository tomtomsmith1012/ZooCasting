package zoo;

public class Parrot extends Bird {

	//Attributes
	
	//Constructors
	public Parrot (String name, String colour, int age, int ID) {
		super(name, colour, age, ID);
	}
	
	//Methods
	public String makeNoise() {
		return "'@#%!'";
	}
}

