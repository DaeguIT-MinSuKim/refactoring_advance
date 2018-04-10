package kr.or.dgit.refactoring_advance.price;

public class Regular extends Price {
	private static Regular instance = new Regular();
	
	private Regular() {}

	public static Regular getInstance() {
		return instance;
	}
	
	@Override
	public PriceType getPriceCode() {
		return PriceType.REGULAR;
	}

	@Override
	public double getCharge(int aDaysRented) {
		double result = 0.0;
		
		result += 2;
	    if (aDaysRented>2)
	        result += (aDaysRented -2 ) * 1.5;
	    
		return result;
	}

	@Override
	public int getFrequentRentalPoints(int aDaysRented) {
		return 1;
	}

}
