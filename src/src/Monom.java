package src;

public class Monom {
	private int coefficient;
	private int power;

	public Monom(int coefficient, int power) {
		this.coefficient = coefficient;
		this.power = power;
	}

	public Monom(int coefficient) {
		this.coefficient = coefficient;
		this.power = 0;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(int coefficient) {
		this.coefficient = coefficient;
	}

	public boolean equals(Monom other) {
		return (this.coefficient == other.getCoefficient() && this.power == other.getPower());
	}

	public String toString() {
		return (this.coefficient + "x^" + this.power);
	}

}
