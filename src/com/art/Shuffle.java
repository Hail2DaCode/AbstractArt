package com.art;


import java.util.ArrayList;
import java.util.Random;

public class Shuffle {
	public static ArrayList<Art> shuffleArray(ArrayList<Art> work) {
		Random randMachine = new Random();
        for(int i = 0; i < 1000000; i++) {
            int num1 = randMachine.nextInt(work.size());
            int num2 = randMachine.nextInt(work.size());
            Art temp = work.get(num1);
            work.set(num1, work.get(num2));
            work.set(num2, temp); 
        }
        return work; }
}
