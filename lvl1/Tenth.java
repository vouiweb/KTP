public class Tenth{
    public static void main(String[] args) {
        int[] Arr = new int[args.length];
        for (int i = 0; i < args.length; i++){
            Arr[i] = Integer.parseInt(args[i]);
        }
        for (int i = 0; i < Arr[1]; i++){
            Arr[0] += Arr[0];
            if (i == Arr[1]-1){
                System.out.print(Arr[0] + "=");
            } else {
                System.out.print(Arr[0] + "+");
            }
        }
        System.out.println(Arr[0]);
        boolean c = (Arr[0]%Arr[2])==0 ? true : false;
        System.out.println(c);
    }
}