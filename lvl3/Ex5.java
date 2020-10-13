import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Ex5{
	public static void main(String[] args){
		System.out.println(isSix(inputMas()));
	}

	public static String inputMas(){
		Scanner in = new Scanner(System.in);
		Scanner inmas = new Scanner(System.in);
		System.out.print("Введите количество элементов: ");
		int n = in.nextInt();
		String[] a = new String[7];

    	for (int i = 0; i < n; i++) {       
        	System.out.print("Введите " + (i + 1) + "-й элемент: ");
        	a[i] = inmas.nextLine();
    	}

    	StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            stringBuilder.append(a[i]);
        }
        return stringBuilder.toString();
	}
	
	public static boolean isSix(String num){
		String[] list = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "A", "B", "C", "D", "E", "F"};
		List<String> array = Arrays.asList(list);

		if (num.length() == 7 || Character.toString(num.charAt(0)) == "#"){
			for (int i = 1; i < num.length(); i++){
				if (array.contains(Character.toString(num.charAt(i)).toUpperCase()))
					return true;
			}
		}

		return false;
	}
}