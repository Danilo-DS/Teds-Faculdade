package model;

public class ProxyImage implements Image {
	
	private LoadImage loadImage;
	//private RealImage realImage;
	private String fileName;

	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

	public void display() {
		if (loadImage == null  ) {
			loadImage = new LoadImage(fileName);
		}
		loadImage.display();
	}
}
