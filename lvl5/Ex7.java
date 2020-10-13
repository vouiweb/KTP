public class Ex7{
	public static void main(String[] args){
		System.out.println(numToEng(Integer.parseInt(args[0])));
	}
	public static String numToEng(int num){
		if (num == 0) return "zero";
		String res = "";
		String[] num1 = new String[] {"", "one", "two", "three", "four", "five", "six", "seven",
            "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] num2 = new String[] {"", "", "twenty", "thirty", "forty", "fifty",
            "sixty", "seventy", "eighty","ninety"};
        if (num < 20) {
        	res = num1[num];
        }
        else if (num < 100) {
        	res = num2[num / 10] + (num % 10 != 0 ? " ": "") + num1[num % 10];
        }
        else if (num < 1000) {
        	res = num1[num / 100] + " hundered " + (num % 100 != 0 ? numToEng(num % 100) : "");
        }
        return res;
	}
}