public class Ex10{
	public static void main(String[] args) {
        System.out.println(steps(Integer.parseInt(args[0])));
	}
	public static int steps(int arg){
		if (arg % 2 == 0) {
			return arg;
		}
		else {
			return arg + 2;
		}
	}
}