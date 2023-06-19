package task2.oop.pr4;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(recursion(17, 7)); // вызов рекурсивной функции
        System.out.println(recursion(7, 17));

        System.out.println(rec(10));
    }

    public static String recursion(int A, int B) {

        if (A > B)
            return A + " " + recursion(A - 1, B);
        if (A == B)
            return Integer.toString(A);

        return  A + " " + recursion(A + 1, B);
    }



    public static String rec(int n) {
        if (n == 1) {
            return "1";
        }
        // Шаг рекурсии / рекурсивное условие
        return rec(n - 1) + " " + n;
    }
}
