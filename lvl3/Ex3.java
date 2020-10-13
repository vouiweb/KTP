public class Ex3{
    public static void main(String[] args) {
    	int n = Integer.parseInt(args[0]);
        System.out.println(isSov(n));
    }
    public static boolean isSov(int n){
    	int sum = 0;
    	for (int i = 1; i < n; i++){
    		if (n % i == 0)
    			sum += i;
    	}
    	if (sum == n)
    		return true;
    	else
    		return false;
    }
}