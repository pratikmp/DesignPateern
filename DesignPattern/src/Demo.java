
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animal = new LivingAnimal();
		animal.describe();
		
		animal = new AddWings(animal);
		animal.describe();
		
		animal = new AddLeg(animal);
		animal.describe();
		
		Animal wingAnimal = new AddWings(new LivingAnimal());
		wingAnimal.describe();
		
		Animal leggedAnimal = new AddLeg(new LivingAnimal());
		leggedAnimal.describe();
	}

}
