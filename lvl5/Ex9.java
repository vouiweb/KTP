import java.util.*;

public class Ex9{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.printf("Введите текст: ");
		String text = in.nextLine();
		System.out.println(correctTitle(text));
	}
	public static String correctTitle(String text){
		String[] str = text.split(" ");
        String strRes = "";
        for (int i = 0; i < str.length; i++) {
            if (i > 0) strRes += " ";
            String[] noHyphens = str[i].split("-");
            for (int j = 0; j < noHyphens.length; j++) {
                if (j > 0) strRes += "-";
                if (noHyphens[j].equalsIgnoreCase("and") || noHyphens[j].equalsIgnoreCase("the")
                        || noHyphens[j].equalsIgnoreCase("of") || noHyphens[j].equalsIgnoreCase("in"))
                    strRes += noHyphens[j].toLowerCase();
                else
                {
                    strRes += noHyphens[j].substring(0,1).toUpperCase();
                    strRes += noHyphens[j].substring(1).toLowerCase();
                }
            }
        }
        return strRes;
	}
}