public class Ex7{
	public static void main(String[] args){
		System.out.println(isKapr(Integer.parseInt(args[0])));
	}

	public static boolean isKapr(int num) {
		String result = String.valueOf((int)Math.pow(num, 2));
		int x, y;
		if (result.length() == 1) 
			x = 0;
		else 
			x = Integer.parseInt(result.substring(0, (int)(result.length() / 2)));
			y = Integer.parseInt(result.substring((int)(result.length() / 2)));
			System.out.printf("%s, %s \n", x, y);
		return (x + y == num);
	}
}