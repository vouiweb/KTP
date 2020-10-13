public class Ex4{
	public static void main(String[] args){
		int[] Arr = new int[args.length];
        for (int i = 0; i < args.length; i++){
            Arr[i] = Integer.parseInt(args[i]);
        }
        System.out.println(sumDigProd(Arr));
	}
	public static int sumDigProd(int... args){
		int res = 0;
		for (int i: args) 
			res += i;
		int count = res;
		while (count > 9){
			count = 1;
			do {
				count *= res % 10;
				res = res / 10;
			} 
			while (res != 0);
			res = count;
		}
		return res;
	}
}
