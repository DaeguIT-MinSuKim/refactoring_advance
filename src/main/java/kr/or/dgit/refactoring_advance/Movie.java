package kr.or.dgit.refactoring_advance;

import kr.or.dgit.refactoring_advance.price.FactoryPrice;
import kr.or.dgit.refactoring_advance.price.Price;
import kr.or.dgit.refactoring_advance.price.PriceType;

public class Movie {
   
    private String title;
    private Price price;
    
    public Movie(String title, PriceType priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    public PriceType getPriceCode() {
        return price.getPriceCode();
    }

    public void setPriceCode(PriceType priceType) {
        price = FactoryPrice.createPrice(priceType);
    }

    public String getTitle() {
        return title;
    }

	double getCharge(int aDaysRented) {
		return price.getCharge(aDaysRented);
	}

	int getFrequentRentalPoints(int aDaysRented) {
		return price.getFrequentRentalPoints(aDaysRented);
	}

}
