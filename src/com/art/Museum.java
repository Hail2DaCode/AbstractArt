package com.art;

import java.util.ArrayList;



public class Museum {

	public static void main(String[] args) {
		ArrayList<Art> museum = new ArrayList<Art>();
		Painting painting1 = new Painting("oil", "Tyrion's Journey", "Tyrion's journey to the lands outside of Westeros", "Tyrion Lannister");
		Painting painting2 = new Painting("acrylic", "Theon's Betrayal", "Describes the takeover of Winterfell by Theon's cronies during the war.", "Sansa Stark");
		Painting painting3 = new Painting("water", "Sansa's Snowy Escapades", "Depicts Sansa having fun at the Aerie during a storm", "Sansa Stark");
		Sculpture sculpture1 = new Sculpture("bronze", "Drogon", "Depicts Danaerys Targaryen's beast", "Tyrion Lannister");
		Sculpture sculpture2 = new Sculpture("porcelain", "Night King" ,"Depicts Bran's encounter with the Night King in the forest", "Bran Stark");
//		painting1.viewArt();
//		painting2.viewArt();
//		painting3.viewArt();
//		sculpture1.viewArt();
//		sculpture2.viewArt();
		museum.add(painting1);
		museum.add(painting2);
		museum.add(painting3);
		museum.add(sculpture1);
		museum.add(sculpture2);
		System.out.print(museum);
		for(Art work : museum) {
			work.viewArt();
		}
		Shuffle.shuffleArray(museum);
		System.out.print(museum);
		for(Art work : museum) {
			work.viewArt();
		}
		
		

	}

}
