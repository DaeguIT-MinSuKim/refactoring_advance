package kr.or.dgit.refactoring_advance.price;

public class Children extends Price {
	private static Children instance = new Children();

	private Children() {
	}

	public static Children getInstance() {
		return instance;
	}

	@Override
	public PriceType getPriceCode() {
		return PriceType.CHILDRENS;
	}

	@Override
	public double getCharge(int aDaysRented) {
		double result = 0.0;

		result += 1.5;
		if (aDaysRented > 3)
			result += (aDaysRented - 3) * 1.5;

		return result;
	}

	@Override
	public int getFrequentRentalPoints(int aDaysRented) {
		return 1;
	}
}
