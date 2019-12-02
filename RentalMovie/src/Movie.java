
public class Movie {
	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	
	private String _title;
	private Price _price;
	
	
	
	
	public Movie(String title, int priceCode) {
		_title = title;
		//_priceCode = priceCode;
		setPriceCode(priceCode);
	}
	
	/*
	public Movie(String title, int priceCode) {
		_title = _title;
		setPriceCode(priceCode);
	}
	*/
	
	/*
	public int getPriceCode() {
		return _priceCode;
	}
	
	public void setPriceCode(int arg) {
		_priceCode = arg;
	}
	*/
	
	/*
	public int getPriceCode() {
		return _priceCode;
	}    
	//41页显示的源代码状态
	
	public void setPriceCode(int arg) {
		_priceCode = arg;
	}
	private int _priceCode;
	*/
	
	public int getPriceCode() {
		return _price.getPriceCode();
	}
	
	/*
	public void setPriceCode(int arg) {
		switch (arg) {
		case REGULAR:
			_price = new RegularPrice();
			break;
		}
		
	}
	*/
	
	public void setPriceCode(int arg) {
		switch(arg) {
		case REGULAR:
			_price=new RegularPrice();
			break;
		case CHILDRENS:
			_price=new ChildrensPrice();
			break;
		case NEW_RELEASE:
			_price=new NewReleasePrice();
			break;
		default:
			throw new IllegalArgumentException("Incorrect Price Code");
		}
     }

	public String getTitle() {
		return _title;
	}
	
	/*
	double getCharge(int daysRented) {
		double result = 0;
		switch (getPriceCode()) {
		    case Movie.REGULAR:
		    	result += 2;
		    	if (daysRented > 2)
		    		result += (daysRented - 2) * 1.5;
		    	break;
		    case Movie.NEW_RELEASE:
		    	result += daysRented * 3;
		    	break;
			case Movie.CHILDRENS:
				result += 1.5;
				if (daysRented > 3)
					result += (daysRented - 3) * 1.5;
				break;
		}
		return result;
	}
	*/
	
	public double getCharge(int daysRented) {
		return _price.getCharge(daysRented);
	}

	/*
	int getFrequentRenterPoints(int daysRented) {
		// TODO Auto-generated method stub
		if ((getPriceCode() == Movie.NEW_RELEASE)
				&& daysRented > 1) 
			return 2;
		else
			return 1;
	}
	*/
	
	public int getFrequentRenterPoints(int daysRented) {
		return _price.getFrequentRenterPoints(daysRented);
	}

}
