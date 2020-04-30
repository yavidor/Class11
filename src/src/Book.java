package src;

public class Book {
	private String name;
	@SuppressWarnings("unused")
	private String writer;
	private int year;
	private double price;
	public Book(String name, String writer, int year, double price) {
		this.name = name;
		this.writer = writer;
		this.year = year;
		this.price = price;
	}
	public String getName() {
		return this.name;
	}
	public int getYear() {
		return this.year;
	}
	public double getPrice() {
		return this.price;
	}
	public boolean isNew(int year) {
		return year - this.year < 3;
	}
	public void newPrice(double precent) {
		this.price = this.price - (precent / 100) * this.price;
	}
}
