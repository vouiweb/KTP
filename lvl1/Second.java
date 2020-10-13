public class Second{
	public static void main(String[] args) {
		int[] Arr = new int[args.length];
        for (int i = 0; i < args.length; i++){
            Arr[i] = Integer.parseInt(args[i]);
        }

        System.out.println(0.5 * Arr[0] * Arr[1]);
	}
}