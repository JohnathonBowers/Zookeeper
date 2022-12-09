package zookeeper;

public class Mammal {
	
	private int energyLevel = 100;
	
	public Mammal () {}
	
	public Mammal (int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public int displayEnergy() {
		System.out.printf("\nEnergy level is: %s\n", energyLevel);
		return energyLevel;
	}
	
	public int changeEnergy(int changeAmount) {
		energyLevel += changeAmount;
		System.out.printf("Energy gained/lossed: %s\n", changeAmount);
		System.out.printf("Current energy level: %s\n", energyLevel);
		return energyLevel;
	}
	
}