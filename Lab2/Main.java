public class Main{
	public static void main(String[] args){
		double[] Arg = new double[9];
		//Заполнение начального списка
		for (int i = 0; i < args.length; i++){
			Arg[i] = Double.parseDouble(args[i]);
		}
		//Создание экземпляров классов
		Point3d first = new Point3d(Arg[0], Arg[1], Arg[2]);
		Point3d second = new Point3d(Arg[3], Arg[4], Arg[5]);
		Point3d third = new Point3d(Arg[6], Arg[7], Arg[8]);
		//Вывод координат точек и площади
		System.out.printf("Первая точка: X:%s, Y:%s, Z:%s\n", first.getX(), first.getY(), first.getZ());
		System.out.printf("Вторая точка: X:%s, Y:%s, Z:%s\n", second.getX(), second.getY(), second.getZ());
		System.out.printf("Третья точка: X:%s, Y:%s, Z:%s\n", third.getX(), third.getY(), third.getZ());
		//Проверка равенства точек
		if (first.getX() == second.getX() && first.getY() == second.getY() && first.getZ() == second.getZ()){
			System.out.printf("Равны первая и вторая точки!\n");
			System.exit(0);
		}
		if (first.getX() == third.getX() && first.getY() == third.getY() && first.getZ() == third.getZ()){
			System.out.printf("Равны первая и третья точки!\n");
			System.exit(0);
		}
		if (second.getX() == third.getX() && second.getY() == third.getY() && second.getZ() == third.getZ()){
			System.out.printf("Равны вторая и третья точки!\n");
			System.exit(0);
		}
		//Вывод площади
		System.out.printf("Площадь фигуры: %.3f\n", computeArea(first, second, third));
	}
	//Метод, вычисляющий площадь пирамиды, образованной точками
	public static double computeArea(Point3d n, Point3d m, Point3d l){
		double a = n.distanceTo(m);	//Первая грань
		double b = n.distanceTo(l);	//Вторая грань
		double c = m.distanceTo(l);	//Третья грань
		double p = (a + b + c)/2;	//Периметр
		return Math.sqrt(p * (p-a) * (p-b) * (p-c)); //Возвращает площадь
	}
}