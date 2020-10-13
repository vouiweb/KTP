import java.util.*;

public class Ex7 {
	public static void main(String[] args) {
		System.out.println(toStarShorthand(args[0]));
	}
	public static StringBuffer toStarShorthand(String text){
		StringBuffer sb = new StringBuffer();
		int count = 1;
		for (int i = 0; i < text.length()-1; i++){
			if (text.charAt(i) == text.charAt(i+1)) {
				count++;
				if (i != text.length()-2) continue;
			}
			if (count > 1) sb.append(text.charAt(i) + "*" + count);
			else sb.append(text.charAt(i));
			if (i == text.length()-2 && count == 1) sb.append(text.charAt(text.length()-1));
			count = 1;
		}
		return sb;
	}
}