import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Ex8{
	public static void main(String[] args) throws NoSuchAlgorithmException{
		System.out.println(getSha256Hash(args[0]));
	}
	public static String getSha256Hash (String str) throws NoSuchAlgorithmException{
		MessageDigest message = MessageDigest.getInstance("SHA-256");
        byte[] hash = message.digest(str.getBytes(StandardCharsets.UTF_8));
        StringBuilder newString = new StringBuilder();
        for(byte temp : hash)
            newString.append(str.format("%02x",temp));
        return newString.toString();
	}
}
