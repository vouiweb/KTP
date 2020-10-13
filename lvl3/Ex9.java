public class Ex9{
	public static void main(String[] args){
		System.out.println(nextInt(Integer.parseInt(args[0])));
	}

	public static int nextInt(int x){
		boolean intnum = true;
		int y = x;
		while (true){
			intnum = true;
			for (int i = 2; i < y - 1; i++)
				if (y % i == 0)
					intnum = false;
			
			if (intnum == true)
				return y;
			y++;
		}
	}
}