package com.art;

public class Painting extends Art {
	private String paintType;
	

	public Painting(String paint, String title, String description, String author) {
		this.setPaintType(paint);
		this.setAuthor(author);
		this.setDescription(description);
		this.setTitle(title);
		
	}


	@Override
	public void viewArt() {
		System.out.printf("Title: %s \n "
				+ "Description: %s \n Author: %s \n "
				+ "Material: %s \n", this.getTitle(), this.getDescription(), this.getAuthor(), this.getPaintType());

	}


	public String getPaintType() {
		return paintType;
	}


	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}
	

}
