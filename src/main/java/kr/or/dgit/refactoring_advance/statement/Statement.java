package kr.or.dgit.refactoring_advance.statement;

import java.util.List;

import kr.or.dgit.refactoring_advance.Customer;
import kr.or.dgit.refactoring_advance.Rental;

public abstract class Statement {

	public String value(Customer aCustomer) {
		StringBuilder result = new StringBuilder();
		List<Rental> rentals = aCustomer.getRentals();

		result.append(headerString(aCustomer.getName()));

		for (Rental each : rentals) {
			result.append(eachRentalString(each));
		}

		result.append(footerString(aCustomer));

		return result.toString();
	}

	protected abstract String footerString(Customer aCustomer);

	protected abstract String eachRentalString(Rental each);

	protected abstract String headerString(String name);

}