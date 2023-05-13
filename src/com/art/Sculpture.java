package com.art;

public class Sculpture extends Art {
	private String material;
	public Sculpture(String material, String title, String description, String author) {
		this.material = material;
		this.setAuthor(author);
		this.setDescription(description);
		this.setTitle(title);
	}
	
	@Override
	public void viewArt() {
		System.out.printf("Title: %s \n "
				+ "Description: %s \n Author: %s \n "
				+ "Material: %s \n", this.getTitle(), this.getDescription(), this.getAuthor(), this.getMaterial());

	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

}
