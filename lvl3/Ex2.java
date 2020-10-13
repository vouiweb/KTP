public class Ex2{
    public static void main(String[] args) {
        String rez = "";
        for (int i = 0; i < args.length; i++){
            rez += args[i] + " ";
        }
        System.out.println(zip(rez));
    }
    public static int zip(String str){
    	if (str.indexOf("zip") != -1 &&
    	 str.lastIndexOf("zip") != str.indexOf("zip")) {
			return str.lastIndexOf("zip");
		}
		return -1;
    }
}