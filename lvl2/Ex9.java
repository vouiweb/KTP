public class Ex9{
	public static void main(String[] args){
		if (Character.toString(args[1].charAt(0)).equals("-")){
			System.out.println(isSuffix(args[0], args[1]));
		}
		else {
			System.out.println(isPreffix(args[0], args[1]));
		}
	}
	public static boolean isPreffix(String x, String y){
		y = y.replace("-","");
		for (int i = 0; i < y.length(); i++){
			if (y.charAt(i) == x.charAt(i)){
				continue;
			}
			else {
				return false;
			}
		}
		return true;
	}
	public static boolean isSuffix(String x, String y){
		y = y.replace("-","");
		int len = x.length() - y.length();
		for (int i = len; i < x.length(); i++){
			if (y.charAt(i - len) == x.charAt(i)){
				continue;
			}
			else {
				return false;
			}
		}
		return true;
	}
}