package Uppgift_4_del2;

public abstract class Mammal extends Animal {

	private int gestationTime;

	public int getGestationTime() {
		return gestationTime;
	}

	public Mammal(String latinName, int gestationTime){
		super(latinName);
		this.gestationTime = gestationTime;

	}

	@Override
	public String getInfo(){
		return null;
	}
}