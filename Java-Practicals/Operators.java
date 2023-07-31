class Operators{
		
	void calc_arithmatic(){
		
		int num1 = 45, num2 = 65, res;
		System.out.println("Addition is " + (num1 + num2));
		System.out.println("Subtraction is " + (num1 - num2));
		System.out.println("Division is " + (num1 / num2));
		System.out.println("Multiplication is " + (num1 * num2));
		System.out.println("Modulo is " + (num1 % num2));
	}	
	
	void calc_relational(){
		
		double num1=875.32, num2=374.32;
		System.out.println("Greater number is " + (num1 > num2));
		System.out.println("Smaller number is " + (num1 < num2));
	}

	public static void main(String args[]) {
	
	Operators op = new Operators();
	op.calc_arithmatic();
	op.calc_relational();
	}
	
}