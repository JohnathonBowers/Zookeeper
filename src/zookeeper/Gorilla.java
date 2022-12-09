package zookeeper;

public class Gorilla extends Mammal {
	
	public void throwSomething() {
		System.out.println("\nThe gorilla threw something!\n");
		changeEnergy(-5);
	}
	
	public void eatBananas() {
		System.out.println("\nThe gorilla has eaten bananas. It's stomach is full, and it is content.\n");
		changeEnergy(10);
	} 
	
	public void climb() {
		System.out.println("\nThe gorilla has climbed a tree.\n");
		changeEnergy(-10);
	}
	
}