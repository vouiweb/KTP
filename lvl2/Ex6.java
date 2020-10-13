public class Ex6{
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
        System.out.println(fibb(n));
	}
	public static int fibb(int n){
		if (n == 0 || n == 1) {
			return 1;
		}
		return fibb(n - 1) + fibb(n - 2);
	}
}