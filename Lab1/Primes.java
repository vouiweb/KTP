public class Primes {
	public static void main(String[] args){
		int n = 100;
		for (int i=2; i<n; i++)
		{
			boolean rez = isPrime(i);
			if (rez == true){
				System.out.println(i);
			}
		}

	}
	public static boolean isPrime(int n){
		for (int i=2; i<n; i++){
			if (n % i == 0 && i!=n ){
				return false;
			}
		}
		return true;
	}
}