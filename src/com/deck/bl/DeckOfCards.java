package com.deck.bl;


public class DeckOfCards {
	public static void main(String[] args) {
		int[] deck = new int[52];
		String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
		String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		String[] playerCards = new String[9];

		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}
		for (int i = 0; i < deck.length; i++) {
			int index = (int) (Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 9; i++) {

				String suit = suits[deck[i] / 13];
				String rank = ranks[deck[i] % 13];
				System.out.println(rank + " of " + suit);

			}

		}
	}
}