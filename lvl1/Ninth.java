public class Ninth{
	public static void main(String[] args) {
		int[] Arr = new int[args.length];
		int s  = 0;
        for (int i = 0; i < args.length; i++){
            Arr[i] = Integer.parseInt(args[i]);
        }
        for (int i = 0; i < args.length; i++){
        	Arr[i] = (int)Math.pow(Arr[i], 3);
        	if (i == args.length-1){
        		System.out.print(Arr[i] + "=");
        	} else {
        		System.out.print(Arr[i] + "+");
        	}
        	s = s + Arr[i];
        }
        System.out.println(s);
	}
}