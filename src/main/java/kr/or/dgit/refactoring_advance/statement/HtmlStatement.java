package kr.or.dgit.refactoring_advance.statement;

import kr.or.dgit.refactoring_advance.Customer;
import kr.or.dgit.refactoring_advance.Rental;

public class HtmlStatement extends Statement {
	private static final HtmlStatement instance = new HtmlStatement();

	public static HtmlStatement getInstance() {
		return instance;
	}

	private HtmlStatement() {}

	protected String headerString(String name) {
		return String.format("<H1><EM>%s  고객님의 대여 기록 </EM></H1><P>%n", name);
	}

	protected String eachRentalString(Rental each) {
		return String.format("\t%s : \t%s<br>%n", each.getMovie().getTitle(), each.getCharge());
	}

	protected String footerString(Customer aCustomer) {
		return String.format("<p>누적 대여료 : <EM>%s</Em>%n<p>적립 포인트 : <EM>%s</Em><p>", aCustomer.getTotalCharge(),
				aCustomer.getFrequentRenterPoints());
	}

}
