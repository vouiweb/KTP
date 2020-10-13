public class Ex1 {
	public static void main(String[] args) {
		System.out.println(bell(Integer.parseInt(args[0])));
	}

	public static int bell(int n) {
		int[][] arr = new int[n + 1][n + 1];
		arr[0][0] = 1;
		for (int i = 1; i <= n; i++) {
			arr[i][0] = arr[i - 1][i - 1];
			for (int j = 1; j <= i; j++) {
				arr[i][j] = arr[i - 1][j - 1] + arr[i][j - 1];
			}
		}
		return arr[n][0];
	}
}