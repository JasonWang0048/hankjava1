package com.tom;

public class Card {
	
	char[] suits = {'\u2663', '\u2666', 0x2665, 0x2660};
	int value;
	int suit;
	
	public Card(int value) {
		this.value = value;
	}
	
	public String draw() {
		String s = (value %13+1) + "" + (suits[value / 13]);
		return s;
	}
}
