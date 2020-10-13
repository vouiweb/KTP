public class Ex8{
	public static void main(String[] args){
		System.out.println(isStrange(args[0], args[1]));
	}
	public static boolean isStrange(String first, String second){
		if (second.charAt(0) == first.charAt(first.length() - 1) 
			&& second.charAt(second.length() - 1) == first.charAt(0)) {
			return true;
		}
		return false;
	}
}