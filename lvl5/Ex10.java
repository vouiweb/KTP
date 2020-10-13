public class Ex10{
	public static void main(String[] args){
		System.out.println(hexLattice(Integer.parseInt(args[0])));
	}
	public static String hexLattice(int num){
		String first = "";
        String second = "";
        int count = 1;
        int i = 0; int j = 0;
        for (i = 1; count < num; i++)
            count += i*6;
        if (num != count) return "Invalid";
        for (j = 0; j < i*2-1; j++)
            second += "o ";
        first = second;
        for (j = 1; j < i; j++){
            first = " " + first.substring(0, first.length()-2);
            second = first  + "\n" +  second + "\n" + first;
        }
        return second;
	}
}