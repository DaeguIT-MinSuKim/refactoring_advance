package kr.or.dgit.refactoring_advance;

import java.util.ArrayList;
import java.util.List;

import kr.or.dgit.refactoring_advance.statement.HtmlStatement;
import kr.or.dgit.refactoring_advance.statement.TextStatement;

public class Customer {
	private String name;
	private List<Rental> rentals = new ArrayList<>();

	public Customer(String aName) {
		this.name = aName;
	}

	public void addRental(Rental aRental) {
		this.rentals.add(aRental);
	}

	public String getName() {
		return this.name;
	}

	public List<Rental> getRentals() {
		return rentals;
	}

	public String statement() {
		return TextStatement.getInstance().value(this);
	}

	public String htmlStatement() {
		return HtmlStatement.getInstance().value(this);
	}

	public int getFrequentRenterPoints() {
		int result = 0;
		for (Rental rental : rentals) {
			result += rental.getFrequentRentalPoints();
		}
		return result;
	}

	public double getTotalCharge() {
		double result = 0;
		for (Rental rental : rentals) {
			result += rental.getCharge();
		}
		return result;
	}
}
