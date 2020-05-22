package model;

public class ProxyImage implements Image {
	
	//private LoadImage loadImage;
	private RealImage realImage;
	private String fileName;

	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

	public void display() {
		if (realImage == null  ) {
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}
}
