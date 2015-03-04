package Uppgift_4_del2;

public class Cat extends Mammal {

	private int numberOfLives;

	public Cat(String latinName, int gestationTime, int numberOfLives){
		super(latinName, gestationTime);
		this.numberOfLives = numberOfLives;	
		// TODO Auto-generated constructor stub
	}

	public int getNumberOfLives(){
		return numberOfLives;
	}

	public void setNumberOfLives(int numberOfLives){
		this.numberOfLives = numberOfLives;

	}

	@Override
	public String getInfo(){
		String info = "En katt som heter " + getFriendlyName() + ", latin: "  + getLatinName() +
				", som har en dräktighetsperiod på " + getGestationTime() + " månader"	+
				" och har " + getNumberOfLives() + " liv kvar.";
		return info;

	}
}
