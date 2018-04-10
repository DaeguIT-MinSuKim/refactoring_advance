package kr.or.dgit.refactoring_advance.price;

import kr.or.dgit.refactoring_advance.Movie;

public class NewRelease extends Price {

	@Override
	public int getPriceCode() {
		return Movie.NEW_RELEASE;
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
