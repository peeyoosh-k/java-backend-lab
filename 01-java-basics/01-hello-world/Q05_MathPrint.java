//Q05 (E) - Arithmetic in println
//File: Q05_MathPrint.java
//
//Print the results of 10 + 5, 10 - 5, 10 * 5 and 10 / 5 on four lines.
//Print 10 + 5 = 15, where 15 is calculated by Java and not typed.

public class Q05_MathPrint {
    public static void main(String[] args) {
        int add = 10 + 5;
        int sub = 10 - 5;
        int mul = 10 * 5;
        int div = 10 / 5;

        System.out.println("10 + 5 = " + add);
        System.out.println("10 - 5 = " + sub);
        System.out.println("10 * 5 = " + mul);
        System.out.println("10 / 5 = " + div);
    }
}

//Output
//10 + 5 = 15
//10 - 5 = 5
//10 * 5 = 50
//10 / 5 = 2