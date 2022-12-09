package zookeeper;

public class Bat extends Mammal {
	
	public Bat(int energyLevel) {
		super(energyLevel);
	}
	
	public void fly() {
		System.out.println("\nFlap flap flap\n");
		changeEnergy(-50);
	}
	
	public void eatHumans() {
		System.out.println("");
		changeEnergy(25);
	} 

	public void attackTown() {
		System.out.println("\nFwooooom crackle crackle crackle");
		changeEnergy(-100);
	} 
	
}