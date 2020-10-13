import java.util.*;

public class Ex5{
	public static void main(String[] args){
		System.out.println(sameVowelGroup(args));
	}
	public static List<String> sameVowelGroup(String[] args){
		List<String> list = new ArrayList<String>();
		list.add(args[0]);
		String allowed = "aeyuio";
		for (int i = 1; i < args.length; i++){
			boolean flag = true;
			for (char ch: allowed.toCharArray())
				if (args[0].contains(String.valueOf(ch)) != 
					args[i].contains(String.valueOf(ch))) flag = false;
			if (flag) list.add(args[i]);
		}
		return list;
	}
}