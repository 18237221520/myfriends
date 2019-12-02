
class ChildrensPrice extends Price {
	int getPricceCode() {
		return Movie.CHILDRENS;
	}
	double getCharge(int daysRented) {
		double result = 1.5;
		if(daysRented > 3)
			result += (daysRented - 3) * 1.5;
		return result;
	}
	@Override
	int getPriceCode() {
		// TODO Auto-generated method stub
		return 0;
	}

}