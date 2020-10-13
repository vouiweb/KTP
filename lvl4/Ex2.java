import java.util.*;

public class Ex2 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Введите строку: ");
		String text = in.nextLine();
		System.out.println(claster(text));
	}
	public static List<String> claster(String text){
		List<String> res = new ArrayList<String>();
		String str = "";
		int x = 0;
		for (char ch: text.toCharArray()){
			if (Character.toString(ch).equals("(")) {
				x++;
				str += "(";
			}
			else {
				x--;
				str += ")";
			}
			if (x == 0) {
				res.add(str);
				str = "";
			}
		}
		return res;
	} 
}