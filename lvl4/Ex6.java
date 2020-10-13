public class Ex6 {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		System.out.println(bugger(num));
	}
	public static int bugger(int num){
		String val = String.valueOf(num);
		int count = 0;
		int multip = 1;
		int current = 0;
		while (num > 10) {
			while (num > 0){
				multip *= num % 10;
				num /= 10;
			}
			count++;
			num = multip;
			multip = 1;
		}
		return count;
	}

}