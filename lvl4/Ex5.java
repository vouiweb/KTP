import java.util.*;

public class Ex5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println("Введите вес: ");
        String w = in.nextLine();
        String[] substrw = w.split(" ");
        double weight = Double.parseDouble(substrw[0]);

        System.out.println("Введите рост: ");
        String h = in.nextLine();
        String[] substrh = h.split(" ");
      	double height = Double.parseDouble(substrh[0]);

		if (substrw[1].equals("pounds")) weight *= 0.453592;
		if (substrh[1].equals("inches")) height *= 0.0254;

        System.out.println(bmi(weight, height));
	}

	public static List<String> bmi (double weight, double height){
		List<String> list = new ArrayList<String>();
		Double k = weight/Math.pow(height, 2);
		String res = "";
		if (k < 18.5) res = "Underweight";
		else if (k > 25) res = "Overrweight";
		else res = "Normal weight";
		String kf = String.format("%.1f", k);
		list.add(kf);
		list.add(res);
		return list;
	}
}