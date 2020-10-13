import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите римское вычисло: ");
        int n = Integer.parseInt(in.nextLine());
        System.out.println(convertToRoman(n));
    }

    public static String convertToRoman(int number) {
        String[] lessten = new String[] {"" /*0*/, "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] hungtothous = new String[] {"" /*0*/, "С", "СС", "ССС", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] morethousand = new String[] {"" /*0*/, "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String result = "";
        if (number > 999) {
            for (int i = 0; i < number / 1000; i++) result += "M";
            number = number % 1000;
        }
        if (number / 100 > 0) {
            result += hungtothous[number / 100];
            number = number % 100;
        }
        if (number / 10 > 0) {
            result += morethousand[number / 10];
            number = number % 10;
        }
        if (number > 0) result += lessten[number];
        return result;
    }
}