public class Ex4{
    public static void main(String[] args) {
    	String rez = "";
        for (int i = 0; i < args.length; i++){
            rez += args[i];
        }
        System.out.println(reverse(rez));
    }
    public static String reverse(String str){
    	if (str.length() < 2)
    		return "Несовместимо.";
    	if (str.charAt(0) == str.charAt(str.length() - 1))
    		return "Два - это пара";
   		
   		char[] chars = str.toCharArray();
    	char x = chars[0];
    	chars[0] = chars[chars.length - 1];
    	chars[chars.length - 1] = x;
    	str = new String(chars);
    	return str;
    }
}