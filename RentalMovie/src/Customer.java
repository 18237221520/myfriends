import java.util.Enumeration;
import java.util.Vector;

class Customer {
	private String _name;
	private Vector _rentals = new Vector();
	
	public Customer (String name) {
		_name = name;
	}
	
	public void addRental (Rental arg) {
		_rentals.add(arg);
	}
	
	public String getName () {
		return _name;
	}
	
	/*
    public String statement(){
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		Enumeration rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		while (rentals.hasMoreElements()){
			double thisAmount = 0;
			Rental each = (Rental) rentals.nextElement();
			
			
			//determine amounts for each line
			switch (each.getMovie().getPriceCode()) {
				case Movie.REGULAR:
				thisAmount += 2;
				if (each.getDaysRented() > 2)
					thisAmount += (each.getDaysRented() - 2) * 1.5;
				break;
				case Movie.NEW_RELEASE:
		        thisAmount += each.getDaysRented() * 3;
				case Movie.CHILDRENS:
				thisAmount += 1.5;
				if (each.getDaysRented() > 3)
					thisAmount += (each.getDaysRented() - 3) * 1.5;
				break;
			}
			
			//add frequent renter points
			frequentRenterPoints ++;
			//add bonus for a two day new release rental 
			if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && 
			each.getDaysRented() > 1) frequentRenterPoints ++;
			
			//show figures for this rental
			result += "\t" + each.getMovie().getTitle()+ "\t" +
			String.valueOf(thisAmount) + "\n";
			totalAmount += thisAmount;
		}
		//add footer lines
		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints)+
		" frequent renter points";
		return result;
		}
		*/
	
	/*
	public String Statement(){
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		Enumeration rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		while (rentals.hasMoreElements()){
			double thisAmount = 0;
			Rental each = (Rental) rentals.nextElement();
			
			thisAmount = amountFor(each);
			
			//add frequent renter points
			frequentRenterPoints ++;
			//add bonus for a two day new release rental 
			if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && 
			each.getDaysRented() > 1) frequentRenterPoints ++;
			
			//show figures for this rental
			result += "\t" + each.getMovie().getTitle()+ "\t" +
			String.valueOf(thisAmount) + "\n";
			totalAmount += thisAmount;
			
		}	
		//add footer lines
		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints)+
		" frequent renter points";
		return result;
		}
		*/
	
	/*
	public String Statement(){
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		Enumeration rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		while (rentals.hasMoreElements()){
			Rental each = (Rental) rentals.nextElement();
			
			thisAmount = each.getCharge();
			
			//add frequent renter points
			frequentRenterPoints ++;
			//add bonus for a two day new release rental 
			if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && 
			each.getDaysRented() > 1) frequentRenterPoints ++;
			
			//show figures for this rental
			result += "\t" + each.getMovie().getTitle()+ "\t" +
			String.valueOf(thisAmount) + "\n";
			totalAmount += thisAmount;
			
		}	
		//add footer lines
		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints)+
		" frequent renter points";
		return result;
		}
		*/
	
	/*
	public String Statement(){
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		Enumeration rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		while (rentals.hasMoreElements()){
			Rental each = (Rental) rentals.nextElement();
			
			
			//add frequent renter points
			frequentRenterPoints ++;
			//add bonus for a two day new release rental 
			if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && 
			each.getDaysRented() > 1) frequentRenterPoints ++;
			
			//show figures for this rental
			result += "\t" + each.getMovie().getTitle()+ "\t" +
			String.valueOf(each.getCharge()) + "\n";
			totalAmount += each.getCharge();
			
		}	
		//add footer lines
		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints)+
		" frequent renter points";
		return result;
		}
		*/
	
	/*
	public String Statement(){
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		Enumeration rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		while (rentals.hasMoreElements()){
			Rental each = (Rental) rentals.nextElement();
			frequentRenterPoints += each.getFrequentRenterPoints();	
			
			//show figures for this rental
			result += "\t" + each.getMovie().getTitle()+ "\t" +
			String.valueOf(each.getCharge()) + "\n";
			totalAmount += each.getCharge();
			
		}	
		//add footer lines
		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints)+
		" frequent renter points";
		return result;
		}
		*/
	
	/*
	public String Statement(){
		int frequentRenterPoints = 0;
		Enumeration rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		while (rentals.hasMoreElements()){
			Rental each = (Rental) rentals.nextElement();
			frequentRenterPoints += each.getFrequentRenterPoints();	
			
			//show figures for this rental
			result += "\t" + each.getMovie().getTitle()+ "\t" +
			String.valueOf(each.getCharge()) + "\n";
	
		}	
		//add footer lines
		result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints)+
		" frequent renter points";
		return result;
		}
	
	private double getTotalCharge() {
		// TODO Auto-generated method stub
		double result = 0;
		Enumeration rentals = _rentals.elements();
		while(rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += each.getCharge();
		}
		return result;
	}
	*/
	
	private double amountFor(Rental aRental) {
		return aRental.getCharge();
	}
	
	/*
	private int amountFor(Rental each){
	//private double amountFor(Rental each){
	//double thisAmount = 0;
	int thisAmount = 0;
	switch (each.getMovie().getPriceCode()) {
			case Movie.REGULAR:
			thisAmount += 2;
			if (each.getDaysRented() > 2)
				thisAmount += (each.getDaysRented() - 2) * 1.5;
			break;
			case Movie.NEW_RELEASE:
	        thisAmount += each.getDaysRented() * 3;
			case Movie.CHILDRENS:
			thisAmount += 1.5;
			if (each.getDaysRented() > 3)
				thisAmount += (each.getDaysRented() - 3) * 1.5;
			break;
		}
		return thisAmount;		
    }
    */
	
	/*	
    private double amountFor(Rental aRental){
		double result = 0;
		switch (aRental.getMovie().getPriceCode()) {
				case Movie.REGULAR:
				result += 2;
				if (aRental.getDaysRented() > 2)
					result += (aRental.getDaysRented() - 2) * 1.5;
				break;
			case Movie.NEW_RELEASE:
		        result += aRental.getDaysRented() * 3;
			case Movie.CHILDRENS:
				result += 1.5;
				if (aRental.getDaysRented() > 3)
					result += (aRental.getDaysRented() - 3) * 1.5;
				break;
			}
			return result;
	}
	*/
	
	private int frequentRenterPoints(Rental aRental) {
  	  return aRental.getFrequentRenterPoints();
    }
	
	private double getTotalCharge() {
		// TODO Auto-generated method stub
		double result = 0;
		Enumeration rentals = _rentals.elements();
		while(rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += each.getCharge();
		}
		return result;
	}
	
	private int getTotalFrequentRenterPoints() {
		// TODO Auto-generated method stub
		double result = 0;
		Enumeration rentals = _rentals.elements();
		while(rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += each.getCharge();
		}
		return (int) result;
	}

	public String Statement(){
		Enumeration rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		while (rentals.hasMoreElements()){
			Rental each = (Rental) rentals.nextElement();
			
			//show figures for this rental
			result += "\t" + each.getMovie().getTitle()+ "\t" +
			String.valueOf(each.getCharge()) + "\n";
		}
		
		//add footer lines
		result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
		result += "You earned " + String.valueOf(getTotalFrequentRenterPoints())+
		" frequent renter points";
		return result;
		}
		
}
