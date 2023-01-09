/*
Francesco Maresca's Username Generator.
Copyright (C) 2023 Francesco Maresca (@programmerhelloworld). All rights reserved.
*/
package com.francescomaresca.usernamegenerator.main;
import java.util.Random;

public class Main {
	static String username;
	
	static String[] abj = {"strong", "dark", "magic", "cool"};
	
	static String[] words = {"gamer", "programmer", "tryharder", "mitico"};
	
	
	public static void main (String args[]) {
		
		
	}
		
		public static void genUsername() {
			GUI window = new GUI();
			Random randomNum = new Random();
			int randomabj = randomNum.nextInt(abj.length);
			int randomword = randomNum.nextInt(words.length);
			window.username = abj[randomabj] + "-" + words[randomword] + randomNum.nextInt(100);
	
	 
	 
	}
}
