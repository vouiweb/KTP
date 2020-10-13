public class Sixth{
    public static void main(String[] args) {
        String[] Arr = new String[args.length];
        for (int i = 0; i < args.length; i++){
            String str = args[i];
           for (i = 0; i < str.length(); i++) {
            System.out.println((int) str.charAt(i));
            }
       }
    }
}