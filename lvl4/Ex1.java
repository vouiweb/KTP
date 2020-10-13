import java.util.Scanner;

public class Ex1{
	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Scanner instr = new Scanner(System.in);
        System.out.println("Введите количество элементов слов (1<=N<=100): ");
        int n = in.nextInt();
        System.out.println("Введите количество символов в строке (1<=K<=80): ");
        int k = in.nextInt();
        System.out.println("Введите текст: ");
        String text = instr.nextLine();
        System.out.println(essay(n, k, text));
	}

    public static String essay(int n, int k, String text){
        String[] str = text.split(" ");
        String str0 = "";
        String result = "";

        if (n > str.length) return "Ошибка";
        for (int i = 0; i < str.length; i++){
            String word = str[i];
            if (str0.replace(" ", "").length() + word.length() >= k){
                result += str0 + "\n";
                str0 = word + " ";
                }
            else str0 += word + " ";  
        }
        if (str0.length() > 0) {
            result += str0 + "\n";
        }
        return result;
    }
}