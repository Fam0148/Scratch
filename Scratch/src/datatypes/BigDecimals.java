package datatypes;

import java.math.BigDecimal;

class SimpleIntrestCalculator
{
	BigDecimal v;
	BigDecimal ti;
	BigDecimal tv;
	
	SimpleIntrestCalculator(String v, String ti)
	{
		this.v = new BigDecimal(v);
		this.ti = new BigDecimal(ti).divide(new BigDecimal(100));
	}

	public BigDecimal calculateTotalValue(int i) 
	{		
		tv = v.add(v.multiply(ti).multiply(new BigDecimal(i)));
		return tv;
	}
}
public class BigDecimals 
{
	public static void main(String[] args) 
	{
		SimpleIntrestCalculator calculator = new SimpleIntrestCalculator("10000","7.5");
		BigDecimal tv = calculator.calculateTotalValue(5);
		System.out.print(tv);
	}
}
