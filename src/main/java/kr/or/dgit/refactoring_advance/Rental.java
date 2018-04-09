package kr.or.dgit.refactoring_advance;

public class Rental {
	private Movie movie;
	private int daysRented;

	public Rental(Movie aMovie, int aDaysRented) {
		this.movie = aMovie;
		this.daysRented = aDaysRented;
	}

	public Movie getMovie() {
		return this.movie;
	}

	public int getDaysRented() {
		return this.daysRented;
	}

	double getCharge() {
		double result = 0;
		
		switch(getMovie().getPriceCode()){
		case Movie.REGULAR:
		    result += 2;
		    if (getDaysRented()>2)
		        result += (getDaysRented() -2 ) * 1.5;
		    break;
		case Movie.NEW_RELEASE:
		    result += getDaysRented() * 3;
		    break;
		case Movie.CHILDRENS:
		    result += 1.5;
		    if (getDaysRented()>3)
		        result += (getDaysRented() - 3) * 1.5;
		    break;
		}
		return result;
	}

	int getFrequentRentalPoints() {
		//최신물을 이틀 이상 대여하면 보너스 포인트 지급
		if ((getMovie().getPriceCode() == Movie.NEW_RELEASE) && 
		        getDaysRented() > 1) {
		    return 2;
		} else {
			return 1;
		}
	}

}
