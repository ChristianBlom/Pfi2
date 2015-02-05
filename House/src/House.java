
public class House{ 
	public int yearBuilt;					// instansvariabler
	private final int minYearBuilt = 1800;
	private final int maxYearBuilt= 2015;
	public int size;
	private final int minSize = 10;
	private final int maxSize = 1000;

	public House(int setSize, int  setYearBuilt){ // konstruktor
		size = setSize;
		yearBuilt = setYearBuilt;

		if(setSize > minSize){
			size = setSize;
		}else{
			size = minSize;
			
		}
		if(setYearBuilt > minYearBuilt){
			yearBuilt = setYearBuilt;
		}else{
			yearBuilt = minYearBuilt;
		}

		if(setSize < maxSize){
			size = setSize;
		}else{
			size = maxSize;
			
		}
		if(setYearBuilt < maxYearBuilt){
			yearBuilt = setYearBuilt;
		}else{
			yearBuilt = maxYearBuilt;
		}
	}

	public int getYearBuilt(){ // Metoder
		return yearBuilt;


	}
	public int getSize(){
		return size;
	}

}
