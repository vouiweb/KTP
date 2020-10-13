import java.util.*;

public class Ex1{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Введите строку: ");
		String text = in.nextLine();
		System.out.println(Arrays.toString(encrypt(text)));

		System.out.println("Введите количество элементов: ");
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++){
			System.out.println("Введите " + (i+1) + " элемент строки: ");
			arr[i] = in.nextInt();
		}
		System.out.println(decrypt(arr));

	}
	public static int[] encrypt(String text){
		int[] arr = new int[text.length()];
		arr[0] = text.charAt(0);
		for (int i = 1; i < text.length(); i ++)
			arr[i] = text.charAt(i) - text.charAt(i-1);
		return arr;
	}
	public static String decrypt(int[] arr){
		String text = "";
		text += (char) arr[0];
		for (int i = 1; i < arr.length; i++)
			text += (char) 	(text.charAt(i-1) + arr[i]);
		return text;
	}
}