public class Ex4{
	public static void main(String[] args) {
		int[] Arr = new int[args.length];
        for (int i = 0; i < args.length; i++){
            Arr[i] = Integer.parseInt(args[i]);
        }
        System.out.printf(summa(Arr));
    }
    public static String summa(int[] Arr){
        String result = "";
        for (int i = 0; i < Arr.length; i++){
            int res = Arr[i];
            for (int j = 0; j < i; j++) {
                res += Arr[j];
            }
            result += res + " ";
        }
        return result;
    }
}