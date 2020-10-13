public class Ex3{
	public static void main(String[] args){
		System.out.println(canComplete(args[0], args[1]));
	}

	public static boolean canComplete(String str1, String str2){
		char[] ch = str1.toCharArray();
        int temp=0;

        for (int i = 0; i < ch.length; i++)
        {
            if (str2.indexOf(String.valueOf(ch[i]),temp) != -1)
                temp = str2.indexOf(String.valueOf(ch[i]),temp) + 1;
            else
                return false;
        }
        return true;
    }
}