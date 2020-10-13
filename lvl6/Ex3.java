import java.util.Scanner;

class Ex3 {
    public static void main(String[] args) {
        System.out.println(validColor(args[0]));
        
    }

    public static boolean validColor(String string) {
        String[] temp = string.substring(string.indexOf('(')+1, string.indexOf(')')).split(",");
        if (string.contains("rgba") && temp.length != 4 || (string.contains(",,")))
            return false;
        for (int i = 0; i < temp.length ; i++)
        {
            double n = Double.parseDouble(temp[i]);
            if (i==3)
                if (!(n >= 0 && n <= 1.0))
                    return false;
            else if (!(n >= 0 && n <= 255))
                return false;
        }
        return true;
    }
}