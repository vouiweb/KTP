public class Ex10{
	public static void main(String[] args){
		System.out.println(triangle(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2])));
	}
	public static boolean triangle(int x, int y, int z){
		return (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) == z);
	}
}