import java.util.*;

public class Ex10 {
	public static void main(String[] args) {
		System.out.println(countUniqueBooks(args[0], args[1].charAt(0)));
	}
	public static int countUniqueBooks(String text, char word){
		boolean flag = false;
		Set temp = new HashSet<>();
		for (char ch: text.toCharArray()){
			if (ch != word && flag) temp.add(ch);
			if (ch == word) {
				if (flag) flag = false;
				else flag = true;
			}
		}
		return temp.size();
	}
}