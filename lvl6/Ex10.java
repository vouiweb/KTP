import java.util.Scanner;

class Ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        int n = in.nextInt();
        System.out.println(palindromeDescendant(n));
    }
    public static boolean palindromeDescendant(int n) {
        String newN = Integer.toString(n);
        String temp = "";
        for (int i = 0; i < newN.length(); i++) temp += newN.charAt(i);
        for (int i = 0; newN.length() >= 2; i++) {
            if (newN.equals(temp)) return true;
            newN = "";
            for (int y = temp.length() - 1; y > 0; y -= 2)
                newN += Character.getNumericValue(temp.charAt(y)) + Character.getNumericValue(temp.charAt(y - 1));
            temp = "";
            for (int x = 0; x < newN.length(); x++) temp += newN.charAt(x);
        }
        return false;
    }
}