package kr.or.dgit.refactoring_advance;

import kr.or.dgit.refactoring_advance.price.Action;
import kr.or.dgit.refactoring_advance.price.Children;
import kr.or.dgit.refactoring_advance.price.NewRelease;
import kr.or.dgit.refactoring_advance.price.Price;
import kr.or.dgit.refactoring_advance.price.Regular;

public class Movie {
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int CHILDRENS = 2;
    public static final int ACTION = 3;
    
    private String title;
    private Price price;
    
    public Movie(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    public int getPriceCode() {
        return price.getPriceCode();
    }

    public void setPriceCode(int aPriceCode) {
        switch(aPriceCode) {
        case REGULAR:
        	price = new Regular();
        	break;
        case CHILDRENS:
        	price = new Children();
        	break;
        case NEW_RELEASE:
        	price = new NewRelease();
        	break;
        case ACTION:
        	price = new Action();
        	break;
        default :
        	throw new IllegalArgumentException("가격 코드가 잘못되었습니다");
        }
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
