public class Eighth{
	public static void main(String[] args) {
		int[] Arr = new int[args.length];
        for (int i = 0; i < args.length; i++){
            Arr[i] = Integer.parseInt(args[i]);
        }
        int a = Arr[0];
        int b = Arr[1];

        System.out.println(a + b - 1);
	}
}