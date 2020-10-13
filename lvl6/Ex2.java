import java.util.Scanner;

class Ex2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Введите слово: ");
        String str1=in.nextLine();
        System.out.println(translateWord(str1));
        System.out.print("Введите предложение: ");
        String str2=in.nextLine();
        System.out.println(translateSentence(str2));
    }

    public static String translateWord (String string){
        if  (String.valueOf(string.charAt(0)).matches("[aeyuioAEYUIO]")) return string + "yay";
        else {
            while(!String.valueOf(string.charAt(0)).matches("[aeyuioAEYUIO]")) {
                String symma = string.substring(0, 1);
                string = string.substring(1) + symma.toLowerCase();
            }
            return string + "ay";
        }
    }
    public static String translateSentence (String string){
        boolean flag = false;
        String res = "";
        String count = "";

        if  (String.valueOf(string.charAt(string.length()-1)).matches("[.!?]")) {
            count = String.valueOf(string.charAt(string.length()-1));
            string = string.substring(0, string.length()-2);
        }
        String[] helper = string.split(" ");
        for (String word : helper) {
            word = translateWord(word);
            if (!word.toLowerCase().equals(word)) {
                word = word.toLowerCase();
                word = word.substring(0,1).toUpperCase() + word.substring(1);
            }
            if (flag) word+=count;
            res += word + " ";
        }
        return res;
    }
}