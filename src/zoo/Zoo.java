package zoo;

import java.util.ArrayList;

public class Zoo {

	public ArrayList<Animal> animals = new ArrayList<Animal>();

	public ArrayList<Mammal> mammals = new ArrayList<Mammal>();

	public ArrayList<Bird> birds = new ArrayList<Bird>();
	
	public void main() {

	}	
	
	
	public void createZoo() {

		Dog mammal1 = new Dog("Fluffy", "Brown", 6, 001);
		Cat mammal2 = new Cat("Tibbles", "Grey", 3, 002);
		Dog mammal3 = new Dog("Rex", "Golden", 2, 003);

		Owl bird1 = new Owl("Steve", "Black", 2, 004);
		Parrot bird2 = new Parrot("Jeff", "Red", 1, 005);
		Parrot bird3 = new Parrot("Dave", "Green", 2, 006);
		
		
		mammals.add(mammal1); mammals.add(mammal2); mammals.add(mammal3);
		birds.add(bird1); birds.add(bird2); birds.add(bird3);
		
		/*animals.add(mammal1); animals.add(mammal2); animals.add(mammal3);
		animals.add(bird1); animals.add(bird2); animals.add(bird3);*/
		
		for (Mammal m : mammals) {
			animals.add(m);
		}
		
		for (Bird b : birds) {
			animals.add(b);
		}
		
	}

	
	public void rollCall(ArrayList<Animal> list) {
		for (Animal i : list)
		{	System.out.print(i.name + ", ");
			System.out.print(i.getClass().getSimpleName() + ", ");
			System.out.print("Present?" + ", ");
			System.out.println(i.makeNoise());}
		}
	}

