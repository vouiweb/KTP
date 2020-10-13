public class Ex3{
	public static void main(String[] args) {
		int[] Arr = new int[args.length];
        for (int i = 0; i < args.length; i++){
            Arr[i] = Integer.parseInt(args[i]);
        }
        System.out.println(isInt(Arr));
	}
    public static boolean isInt(int[] Arr){
        double sr = 0;
        int n = 0;
        for (int i = 0; i < Arr.length; i++){
            sr += Arr[i];
            n = n + 1;
        }
        sr = sr/n;
        if (sr % 1 == 0)
            return true;
        else
            return false;
    }


}