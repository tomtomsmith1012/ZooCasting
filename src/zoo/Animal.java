package zoo;

public abstract class Animal extends Zoo {

	//Attributes
	String name;
	String colour;
	int age;
	int ID;
	
	//Constructors
	public Animal (String name, String colour, int age, int ID) {
		this.name = name;
		this.colour = colour;
		this.age = age;
		this.ID = ID;
	}
	
	//Methods
	public abstract String makeNoise();
}
