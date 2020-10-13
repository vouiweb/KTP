import java.util.Scanner;

class Ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String string = in.nextLine();
        System.out.println(longestNonrepeatingSubstring(string));
    }
    public static boolean isTrue(String string) {
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < string.length(); j++) {
                if (i == j) continue;
                if (string.charAt(i) == string.charAt(j)) return false;
            }
        }
        return true;
    }
    public static String longestNonrepeatingSubstring(String string) {
        String help;
        String result = "";
        for (int j = 0; j < string.length(); j++) {
            help = "";
            for (int i = j; i < string.length(); i++) {
                if (i == 0) help += string.charAt(i);
                else {
                    while (isTrue(help)) {
                        help += string.charAt(i);
                        if (i != string.length()-1) i++;
                        String temp = help;
                        temp += string.charAt(i);
                        if (!isTrue(temp)) break;
                    }
                    if (help.length() > result.length())
                        result = help;
                    break;
                }
            }
        }
        return result;
    }
}