package com.tom;

import java.util.Random;

public class PokerGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] suits = {0x2663, 0x2666, 0x2665, 0x2660};
		int[] nums = new int[5];
		nums[0] = 77;
		nums[4] = 98;
		System.out.println(nums[4]);
		System.out.println(nums.length);
		for(int i=0; i < nums.length; i++){
			System.out.println(nums[i]);
		}
		char f = 0x2666;
		System.out.println(f);
				
		
/*		Random random = new Random();
		for(int i=0; i<52; i++) {
			int number = random.nextInt(13) + 1;
			System.out.print(number);
			int color = random.nextInt(4);
			switch(color) {
			case 0:
				System.out.print("S");
				break;
			case 1:
				System.out.print("H");
				break;
			case 2:
				System.out.print("D");
				break;
			case 3:
				System.out.print("C");
				break;
			}
		}*/
	}

}