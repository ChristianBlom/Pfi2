package Uppgift_4;

public class Human {
	private Dog dog;
	private String name;
	private String Info = "";


	public Human (String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void buyDog(Dog dog){
		this.dog = dog;

	}
	public String getInfo() {

		if (dog == null ){
			String Info = name +(" har ingen hund ");
			return Info;
		}
		if(name == null){
			String info = (" Här finns varken hund eller människa");
			return info;
		}else {

			String Info = name +(" äger en hund some heter ")+ name;

			return Info;
		}
