import java.util.Scanner;

public class Ex6{
	public static void main(String[] args){
		int[] Arr = new int[args.length];
        for (int i = 0; i < args.length; i++)
            Arr[i] = Integer.parseInt(args[i]);

    	System.out.println(isTrue(uniqueCount(inputMas()),uniqueCount(inputMas())));
	}

	public static int[] inputMas(){
		Scanner in = new Scanner(System.in);
		System.out.print("Введите количество элементов массива: ");
		int n = in.nextInt();
    	int[] a = new int[n];

    	for (int i = 0; i < a.length; i++) {       
        	System.out.print("Введите " + (i + 1) + "-й элемент: ");
        	a[i] = in.nextInt();
    	}
    	return a;
	}

	public static int uniqueCount(int[] array) {
    	int result = 0;
   		int countUnique = 0;
    	int count = 0;
    	for (int i = 0; i < array.length; i++) {
        	countUnique++;
        	for (int j = i+1; j < array.length; j++) {
            	if (array[j] == array[i]) {
                	count++;
                	break;
            	}
        	}
    	}
    	return result = countUnique - count;
	}
	
	public static boolean isTrue(int x, int y){
		if (x == y)
			return true;
		return false;
	}
}