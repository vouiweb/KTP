public class Seventh{
	public static void main(String[] args) {
		int[] Arr = new int[args.length];
		int s = 0, x  = 0;
        for (int i = 0; i < args.length; i++){
            Arr[i] = Integer.parseInt(args[i]);
        }
        for (int i = 0; i < Arr[0]; i++){
        	s = s + 1;
        	if (i == Arr[0]-1){
        		System.out.print(s + "=");
        	} else {
        		System.out.print(s + "+");
        	}
        	x = x + s;
        }
        System.out.println(x);
    }
}	
