package kr.or.dgit.refactoring_advance.price;

public class NewRelease extends Price {
	private static NewRelease instance = new NewRelease();
	
	private NewRelease() {}

	public static NewRelease getInstance() {
		return instance;
	}
	
	@Override
	public PriceType getPriceCode() {
		return PriceType.NEW_RELEASE;
	}
	
	@Override
	public double getCharge(int aDaysRented) {
		double result = 0.0;
		
		result += aDaysRented * 3;
	    
		return result;
	}

	@Override
	public int getFrequentRentalPoints(int aDaysRented) {
		return aDaysRented>1?2:1;
	}
}
