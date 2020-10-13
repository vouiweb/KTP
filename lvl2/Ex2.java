public class Ex2{
	public static void main(String[] args) {
		int[] Arr = new int[args.length];
		for (int i = 0; i < args.length; i++){
            Arr[i] = Integer.parseInt(args[i]);
          }
    System.out.println("Разность: " + razn(Arr));
	}

  public static Integer razn(int[] Arr){
    int min = 999;
    int max = 0;
        for (int i = 0; i < Arr.length; i++){
            if (Arr[i] < min){
              min = Arr[i];
            }
            if (Arr[i] > max){
              max = Arr[i];
            }
        }
        System.out.println("Минимальное: " + min);
        System.out.println("Максимальное: " + max);
        return max - min;
  }
}