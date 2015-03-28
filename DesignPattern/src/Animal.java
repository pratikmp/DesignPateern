
public interface Animal {

	public void describe();
	
}

class LivingAnimal implements Animal{
	
	public void describe(){
		
		System.out.println("Animal");
	}
	
}

abstract class Decorator implements Animal{
	
	Animal animal;
	
	public Decorator(Animal animal){
		this.animal=animal;
		
	}
	
} 

class AddWings extends Decorator{

	public AddWings(Animal animal) {
		super(animal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void describe() {
		// TODO Auto-generated method stub
		animal.describe();
		System.out.println("Wing Added");
	readyToFly();
	}
	
	public void readyToFly(){
		System.out.println("Flying");
		
	}

	
}

class AddLeg extends Decorator{

	public AddLeg(Animal animal) {
		super(animal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void describe() {
		// TODO Auto-generated method stub
		animal.describe();
		System.out.println("Leg Added");
		readyToDance();
	}
	
	public void readyToDance(){
		System.out.println("Dancing");
		
	}
	
}