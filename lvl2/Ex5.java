public class Ex5{
	public static void main(String[] args) {
        System.out.println(kol(args[0]));
    }

    public static int kol(String arg){
    	int pos = arg.indexOf('.');
    	if (pos >= 0){
    		return arg.length() - pos - 1;
    	}
    	return 0;
    }

}