public class Ex1{
    public static void main(String[] args) {
	String str = args[0];
        int n = Integer.parseInt(args[1]);
        System.out.println(repeat(str, n));
}

     public static String repeat(String str, int n){
        String rez = "";
        for (int i = 0; i < str.length(); i++){
                for (int j = 0; j < n; j++){
                        rez = rez + str.charAt(i);
                }
        }
        return rez;
    }

}