package model;

public class RealImage extends LoadImage {
	
	public RealImage(String fileName) {
		super(fileName);
		loadFromDisk(fileName);
	}

	public void display() {
		System.out.println("Displaying" + getFileName());
	}

	public void loadFromDisk(String fileName) {
		System.out.println("Loading" + fileName);		
	}


}
