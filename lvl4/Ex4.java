public class Ex4 {
	public static void main(String[] args) {
		double[] Arr = new double[args.length];
        for (int i = 0; i < args.length; i++){
            Arr[i] = Double.parseDouble(args[i]);
        }
        System.out.println("$" + overTime(Arr));
	}

	public static double overTime(double[] Arr){
		double payment = 0;

		if (Arr[1] <= 17) payment = (Arr[1] - Arr[0]) * Arr[2];
		else payment = (17 - Arr[0]) * Arr[2] + (Arr[1] - 17) * Arr[2] * Arr[3];

		return payment;
	}
}