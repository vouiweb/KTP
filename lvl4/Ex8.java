import java.util.*;

public class Ex8{
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Введите 1 строку: ");
        String str1 = in.nextLine();
        System.out.println("Введите 2 строку: ");
        String str2 = in.nextLine();

        System.out.println(doesRhyme(str1, str2));
	}
	public static boolean doesRhyme(String str1, String str2){
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		str1 = str1.replaceAll("[^a-z]", "");
		str2 = str2.replaceAll("[^a-z]", "");
		System.out.println(str1);
		System.out.println(str2);
		if (str1.substring(str1.length() - 2).equals(str2.substring(str2.length() - 2)))
			return true;
		else return false;
	}
}