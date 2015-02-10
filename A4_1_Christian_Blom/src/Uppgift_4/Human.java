package Uppgift_4;

	public class Human {
	private Dog dog;
	private String name;
	
	public Human (String name){
		this.name = name;
		}
	public String getName(){
		return name;
	}
	public void buyDog(Dog dog){
		this.dog = dog;
	 
	}
	public String getInfo(){
		if(dog == null){
			String info = name + " äger en hund some heter" + dog.getName();
		}else{
			String info = name + "äger inte en hund";
					return info;
		}
	
	}
}	