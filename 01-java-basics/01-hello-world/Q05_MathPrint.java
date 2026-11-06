//Q05 (E) - Arithmetic in println
//File: Q05_MathPrint.java
//
//Print the results of 10 + 5, 10 - 5, 10 * 5 and 10 / 5 on four lines.
//Print 10 + 5 = 15, where 15 is calculated by Java and not typed.

public class Q05_MathPrint {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double quotient = a / b;

        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " - " + b + " = " + difference);
        System.out.println(a + " * " + " = " + product);
        System.out.println(a + " / " + b + " = " + quotient);
    }
}

//Output
//10 + 5 = 15
//10 - 5 = 5
//10 * 5 = 50
//10 / 5 = 2