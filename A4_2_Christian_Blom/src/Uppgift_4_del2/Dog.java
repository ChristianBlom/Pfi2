package Uppgift_4_del2;

public class Dog extends Mammal {
	
	private boolean isStupid;

	public Dog(String latinName, int gestationTime, boolean isStupid) {
		super(latinName, gestationTime);
		this.isStupid = isStupid;
		// TODO Auto-generated constructor stub
	}

	public Dog(String latinName, int gestationTime, boolean isStupid, String friendlyName) {
		super(latinName, gestationTime);
		this.isStupid = isStupid;
		setFriendlyName(friendlyName);
		// TODO Auto-generated constructor stub
	}
	public boolean isStupid(){
		return isStupid;
		
	}
	
	@Override
	public String getInfo(){
			String info = "";
			if (isStupid){	
				info = "En hund som heter: " + getFriendlyName() + ", latin: " + getLatinName() +
					" som har en dräktighetsperiod i " + getGestationTime() + " månader och är dum";
			} else {
				info = "En hund son heter: " + getFriendlyName() + ", latin: " + getLatinName() +
					", som har dräktighetsperiod i " + getGestationTime() + " månader och är inte dum";
			}
			return info;
			
			
		}
	
	
	

}
