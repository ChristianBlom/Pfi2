package Uppgift_4_del2;

public abstract class Animal {
	private String latinName;
	private String friendlyName = "no name ";

	public Animal(String latinName){
		this.setLatinName(latinName);		
	}
	public abstract String getInfo();
	public String getLatinName() {
		return latinName;
	}
	public void setLatinName(String latinName) {
		this.latinName = latinName;
	}
	public String getFriendlyName() {
		return friendlyName;
	}
	public void setFriendlyName(String friendlyName) {
		this.friendlyName = friendlyName;
	}



}
