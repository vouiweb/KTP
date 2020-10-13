public class Ex9{
	public static void main(String[] args){
		double num1 = Double.parseDouble(args[0]);
		double num2 = Double.parseDouble(args[1]);
		System.out.println(trouble(num1, num2));
	}

	public static boolean trouble(double num1, double num2) {
		String numOne = Double.toString(num1);
		String numTwo = Double.toString(num2);
		for (int i = 2; i < numOne.length(); i++) {
			if (numOne.charAt(i) == numOne.charAt(i - 1) &&
				  numOne.charAt(i - 1) == numOne.charAt(i - 2)) {
				for (int j = 1; j < numTwo.length(); j++) {
					if (numTwo.charAt(j) == numTwo.charAt(j - 1) &&
						 	numTwo.charAt(j) == numOne.charAt(i)) {
						return true;
					}
				}
			}
		}
		return false;
	}
}