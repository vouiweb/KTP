public class Ex1{
    public static void main(String[] args) {
        int[] Arr = new int[args.length];
        for (int i = 0; i < args.length; i++){
            Arr[i] = Integer.parseInt(args[i]);
        }
        System.out.println(kolresh(Arr[0], Arr[1], Arr[2]));
    }
    public static int kolresh(int a, int b, int c){
        double d = b*b - 4*a*c;
        if (d > 0){
            return 2;
        }
        if (d == 0){
            return 1;
        }
        return 0;
    }
}