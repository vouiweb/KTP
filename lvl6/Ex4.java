import java.util.*;

class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите адрес: ");
        String str = in.nextLine();
        System.out.print("Введите аргумент: ");
        String arg = in.nextLine();
        System.out.println(stripUrlParams(str, arg));
    }

    public static String stripUrlParams(String url, String ...arg) {
        String result = "";
        Map<String, String> map = new HashMap<>();
        String[] temp = url.split("\\?");
        result += temp[0];
        if (temp.length!=1) {
            temp = temp[1].split("&");
            for (int i = 0; i<temp.length; i++) {
                String[] couple = temp[i].split("=");
                if (map.containsKey(couple[0]))
                    map.replace(couple[0], couple[1]);
                else map.put(couple[0], couple[1]);
            }
            result += "?";
        }
        for (String i : arg)
            if (map.containsKey(i)) map.remove(i);
        for (String j : map.keySet())
            result += j + "=" + map.get(j) + "&";
        return result.substring(0,result.length()-1);
    }
}