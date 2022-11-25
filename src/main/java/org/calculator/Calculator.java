package org.calculator;


public class Calculator {

	private float num1;
	private float num2;
	
	public Calculator(float num1, float num2) {
		
		setNum1(num1);
		setNum2(num2);
	}

	public float getNum1() {
		return num1;
	}

	public void setNum1(float num1) {
		this.num1 = num1;
	}

	public float getNum2() {
		return num2;
	}

	public void setNum2(float num2) {
		this.num2 = num2;
	}
	
	
	
	public float add() {
		
		return getNum1() + getNum2();
	}
	
	public float subtract() {
		
		return getNum1() - getNum2();
	}
	public float multiply() {
	
		return getNum1() * getNum2();
	}
	public float divide() {
		
		
		if(getNum2() == 0) {
			
			throw new IllegalArgumentException(
					"Il divisore non può essere 0"
				);
		}

		return getNum1() / getNum2();
	}
	
	
	@Override
	public String toString() {
		
		return "Num1: " + getNum1()
			+ "\nNum2: " + getNum2()
			+ "\nSum: " + add()
			+ "\nSubtraction: " + subtract()
			+ "\nMultiplication: " + multiply()
			+ "\nDivision: " + divide();
			
	}
	
}
