package src;

import java.util.*;

public class Book_main {
	public static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book gTheory = new Book("Conversations on Game Theory", "Haim Shapira", 2008, 94);// My current non-fiction
		Book omens = new Book("Good Omens", "Terry Pratchett and Neil Gaiman", 1990, 98);// My current fiction book
		Book tafsan = new Book("The Catcher in the Rye", "J.D. Salinger", 1951, 84);// My next fiction book.
		double precent = reader.nextDouble();
		gTheory.newPrice(precent);
		omens.newPrice(precent);
		tafsan.newPrice(precent);
		System.out.println(gTheory.getName() + " new price is: " + gTheory.getPrice());
		System.out.println(omens.getName() + "new Price is: " + omens.getPrice());
		System.out.println(tafsan.getName() + "new Price is: " + tafsan.getPrice());
		int counter = 0;
		if (gTheory.isNew(2020))
			counter++;
		if (omens.isNew(2020))
			counter++;
		if (tafsan.isNew(2020))
			counter++;
		System.out.println(counter + " books are new");
	}

}
