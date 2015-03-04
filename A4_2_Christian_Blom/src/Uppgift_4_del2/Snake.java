package Uppgift_4_del2;

public class Snake extends Animal {

	private boolean isPosionous;
	public Snake(String latinName, boolean isPosionous) {
		super(latinName);
		this.isPosionous = isPosionous;
	}
	@Override
	public String getInfo() {
		String info = "";
		if (isPosionous()){
			info = "En orm som heter " + getFriendlyName() + ", latin: " + getLatinName() +
					", som är giftig";
		}else{
			info = "En orm som heter " + getFriendlyName() + ", latin: " + getLatinName() +
					", som är ogiftig";
		}

		return info;
	}

	public boolean isPosionous() {
		return isPosionous;
	}
}
