public class Fourth{
	public static void main(String[] args) {
		double[] Arr = new double[args.length];
        for (int i = 0; i < args.length; i++){
            Arr[i] = Double.parseDouble(args[i]);
        }
        double prob = Arr[0];
        double prize = Arr[1];
        double pay = Arr[2];
        System.out.println(prob*prize>pay ? true : false);
	}
}