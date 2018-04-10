package kr.or.dgit.refactoring_advance.price;

public class Action extends Price {
	private static Action instance = new Action();
	
	private Action() {}

	public static Action getInstance() {
		return instance;
	}

	@Override
	public PriceType getPriceCode() {
		return PriceType.ACTION;
	}

	@Override
	public double getCharge(int aDaysRented) {
		double result = 0.0;
		
		result += 2;
	    if (aDaysRented>3)
	        result += (aDaysRented - 3) * 1.5;
	    
		return result;
	}

	@Override
	public int getFrequentRentalPoints(int aDaysRented) {
		return 1;
	}

}
