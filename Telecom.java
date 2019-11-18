package phone;
import phonefactory.*;
public abstract class Telecom implements Phone{
	public double feePerMinute(){
		return (double) 0.2;
	}
}
