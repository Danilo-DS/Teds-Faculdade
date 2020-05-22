package model;

public abstract class LoadImage implements Image {
	
	private String fileName;
	
	public LoadImage(String fileName) {
		this.fileName = fileName;
		
	}
	public String getFileName() {
		return this.fileName;
	}
	public abstract void loadFromDisk(String fileName);

}
