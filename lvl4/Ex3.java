import java.util.*;

public class Ex3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите строку: ");
		String text = in.nextLine();
		if (text.contains("_")) System.out.println("CamelCase: " + ToCamelCase(text));
		else System.out.println("Snake_case: " + ToSnakeCase(text));
	}

	public static String ToCamelCase(String text) {
		while(text.contains("_"))
            text = text.replaceFirst("_[a-z]", String.valueOf(Character.toUpperCase(text.charAt(text.indexOf("_") + 1))));
        return text;
	}

	public static String ToSnakeCase(String text) {
        return text.replaceAll("(.)(\\p{Upper})", "$1_$2").toLowerCase();
	}
}
