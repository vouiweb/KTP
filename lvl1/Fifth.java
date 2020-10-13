public class Fifth{
	public static void main(String[] args) {
		int[] Arr = new int[args.length];
        for (int i = 0; i < args.length; i++){
            Arr[i] = Integer.parseInt(args[i]);
        }
        int N = Arr[0];
        int a = Arr[1];
        int b = Arr[2];

        if (a + b == N)
            System.out.println("Сложены");
        else if (a - b == N || b - a == N)
            System.out.println("Вычитаны");
        else if (a * b == N)
            System.out.println("Умножены");
        else if (a / b == N || b / a == N)
            System.out.println("Разделены");
        else
            System.out.println("None :(");
	}
}