package model;

public class LoadImage extends RealImage {

	public LoadImage(String fileName) {
		super(fileName);
		loadFromDisk(fileName);
	}
	
	private void loadFromDisk(String fileName) {
		System.out.println("Loading " + fileName);
	}

}
