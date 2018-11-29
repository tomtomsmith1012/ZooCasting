package zoo;

public class Cat extends Mammal {

	//Attributes
	
	//Constructors
	public Cat(String name, String colour, int age, int ID) {
		super(name, colour, age, ID);
	}
	//Methods
	public String makeNoise() {
		return "'Meow'";
	}
}
