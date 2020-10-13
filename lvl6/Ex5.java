import java.util.*;

class Ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = in.nextLine();
        System.out.println(Arrays.toString(getHashTags(str)));
    }

    public static int getMaxLenght(String[] word) {
        int result = word[0].length();
        for (int i = 1; i < word.length; i++)
            if (word[i].length() > result)
                result = word[i].length();
        return result;
    }
    public static String[] getHashTags(String string) {
        int size = 0;
        String[] temp;
        for (int i = 0; i < string.length(); i++)
            if (string.charAt(i) == ' ')
                size++;
        int count = 0;
        if (size == 1 || size == 0) {
            temp = new String[size+1];
            Arrays.fill(temp,"#");
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == ' ') count++;
                else if (!(string.charAt(i) == ',')) temp[count] += Character.toLowerCase(string.charAt(i));
            }
            if (size == 1)
                if(temp[0].length() < temp[1].length()) {
                    String e = temp[0];
                    temp[0] = temp[1];
                    temp[1] = e;
                }
            return temp;
        }
        else {
            temp = new String[size+1];
            Arrays.fill(temp,"#");
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == ' ' )
                    count++;
                else if (!(string.charAt(i) == ','))
                    temp[count] += Character.toLowerCase(string.charAt(i));
            }
            String[] temp2 = new String[3];
            Arrays.fill(temp2,"");
            int x = 0;

            for(int j = 0; j < temp.length; j++) {
                for(int i = 0; i < temp.length; i++) {
                    if (x == 3) break;
                    if (temp[i].length() == getMaxLenght(temp)) {
                        temp2[x] += temp[i];
                        temp[i] = "";
                        x++;
                        break;
                    }
                }
            }
            return temp2;
        }
    }
}