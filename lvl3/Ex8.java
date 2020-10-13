public class Ex8{
	public static void main(String[] args){
		System.out.println(kol(args[0]));
	}
	public static String kol(String num){
		int k = 0, s = 0;
		String rez = "";
		for (int i = 0; i < num.length(); i++){
			if (Character.toString(num.charAt(i)).equals("0"))
				k++;
			else
				k = 0;
			if (k > s)
				s = k;
		}
		for (int i = 0; i < s; i++)
			rez += "0";
		return rez;
	}
}