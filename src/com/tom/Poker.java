package com.tom;

import java.util.ArrayList;
import java.util.Random;

public class Poker {
	
	ArrayList bag = new ArrayList();
	
//	int[] cards = new int[52];
//	Card[] cards = new Card[52];
	
	public Poker(){
		for (int i=0; i<52; i++){
//			cards[i] = i;
//			cards[i] = new Card(i);
			Card c = new Card(i);
			bag.add(c);
		}
		System.out.println(bag.size());
	}
	
/*	public void shuffle() {
		for (int i=0; i<52; i++) {
			int r = new Random().nextInt(52);
			// a = cards[i]
			// b = cards[r]
			Card temp = cards[i];
			cards[i] = cards[r];
			cards[r] = temp;
		}
	}*/
	
	public void print() {
		for (int i=0; i<52; i++) {
			
			Card c = (Card)bag.get(i);
//			System.out.print(cards[i].draw() + "\f");
			System.out.print(c.draw() + " ");
			if (i % 13 == 12) {
			System.out.println();			
			}
/*			int suits = cards[i] / 13;
			char c = 0;
			switch(suits) {
			case 0:
				c = 'S';
				break;
			case 1:
				c = 'H';
				break;
			case 2:
				c = 'D';
				break;
			case 3:
				c = 'C';
				break;
			}*/
		}
	}
	
}
