package src;

public class Card {
	private int value;
	private String shape;

	public Card(int value, String shape) {
		this.value = value;
		this.shape = shape;
	}

	public int getValue() {
		return value;
	}

	public String getShape() {
		return shape;
	}

	public boolean equalValue(int num) {
		return this.value == num;
	}

	public boolean equalShape(String shape) {
		return this.shape.equals(shape);
	}

	public String toString() {
		return "Value: " + this.value + " Shape: " + this.shape;
	}
}
