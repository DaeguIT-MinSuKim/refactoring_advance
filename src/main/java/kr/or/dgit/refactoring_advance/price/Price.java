package kr.or.dgit.refactoring_advance.price;

public abstract class Price {
	public abstract PriceType getPriceCode();
	
	public abstract double getCharge(int aDaysRented);
	
	public abstract int getFrequentRentalPoints(int aDaysRented);
}
