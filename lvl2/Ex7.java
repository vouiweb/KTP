public class Ex7{
	public static void main(String[] args){
		System.out.println(isInd(args[0]));
	}
	public static boolean isInd(String args){
		try{
			int num = Integer.parseInt(args);
			if (args.length() != 5){
				return false;
			}
			return true;
		}
		catch(Exception e){
			return false;
		}
	}
}