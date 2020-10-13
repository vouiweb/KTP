public class Third{
	public static void main(String[] args) {
		int[] Arr = new int[args.length];
        for (int i = 0; i < args.length; i++){
            Arr[i] = Integer.parseInt(args[i]);
        }
        int chickens = Arr[0] * 2;
        int cows = Arr[1] * 4;
        int pigs = Arr[2] * 4;
        System.out.println(chickens + cows + pigs);
	}
}