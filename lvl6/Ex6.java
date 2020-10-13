import java.util.*;

class Ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = in.nextInt();
        System.out.println(ulam(n));
    }
    public static int ulam(int n) {
        Vector<Integer> vector = new Vector<Integer>();
        vector.add(1);
        vector.add(2);
        for (int i = 3; i < 2000; i++) {
            int count = 0;
            for (int j = 0; j < vector.size()-1; j++) {
                for (int k = j + 1; k < vector.size(); k++) {
                    if (vector.get(j) + vector.get(k) == i) count++;
                    if (count > 1) break;
                }
                if (count > 1) break;
            }
            if (count == 1) vector.add(i);
        }
        return vector.get(n-1);
    }

}