public class First{
	public static void main(String[] args) {
		int[] Arr = new int[args.length];
        for (int i = 0; i < args.length; i++){
            Arr[i] = Integer.parseInt(args[i]);
        }
        
        System.out.println(Arr[0] % Arr[1]);
	}
}