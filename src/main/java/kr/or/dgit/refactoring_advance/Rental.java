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

}
