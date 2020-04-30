package src;

import java.util.*;

public class Card_main {
	public static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		Card c1 = new Card(reader.nextInt(), reader.next());
		Card c2 = new Card(reader.nextInt(), reader.next());
		if (c1.equalValue(c2.getValue()))
			System.out.println("Same values");
		else
			System.out.println("Different values");
		String shape3;

		if (!(c1.equalShape("Hearts") || c2.equalShape("Hearts")))
			shape3 = "Hearts";
		else if (!(c1.equalShape("Spades") || c2.equalShape("Spades")))
			shape3 = "Spades";
		else
			shape3 = "Clubs";// No point in adding Diamonds
		Card c3 = new Card(Math.max(c1.getValue(), c2.getValue()), shape3);
		System.out.println(c3.toString());
		if (c3.equalValue(c1.getValue()) || c3.equalValue(c2.getValue()))
			System.out.println("The third card value is not unique");
	}

}
