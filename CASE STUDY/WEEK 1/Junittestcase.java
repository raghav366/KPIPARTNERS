package testcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Example {
	public double balance(int amount, double rate, int year){
	    double yearlyRate = amount * rate;
	    double totalAmount= amount;


	    System.out.println(amount + " :- " + " grows with the interest rate of " + rate);

	    for (int i = 0; i <= year; i++ ){

	         
	             totalAmount  = totalAmount + yearlyRate;
	             
	    
	    } System.out.println("totalamount" + totalAmount);
	    return totalAmount;
	}


	@Test
	void test() {
		double x = balance(2,1,1);
		assertEquals(6,x);
		
	}

}
