import java.util.*;

public class Ex6{
	public static void main(String[] args){
		System.out.println(validateCard(args[0]));
	}
	public static boolean validateCard(String num){
		if (num.length() < 16 || num.length() > 19) return false;
		int kNum = Integer.parseInt(String.valueOf(num.charAt(num.length() - 1)));
		int cNum = 0;
		int lNum = 0;
		int sum = 0;
		for (int i = num.length() - 2; i >= 0; i--){
			if (i % 2 == 0) cNum = Integer.parseInt(String.valueOf(num.charAt(i))) * 2;
			else cNum = Integer.parseInt(String.valueOf(num.charAt(i)));
			if (cNum > 9) {
				lNum = 0;
				for (char ch: String.valueOf(cNum).toCharArray()) {
					lNum += Integer.parseInt(String.valueOf(ch));
				}
				sum += lNum;
				continue;
			}
			sum += cNum;
		}
		String sumStr = String.valueOf(sum);
		return (10 - Integer.parseInt(String.valueOf((sumStr.charAt(sumStr.length() - 1)))) == kNum);
	}
}