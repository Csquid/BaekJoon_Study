package step01;

import java.util.Scanner;

public class Step_11_remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // (A+B) % C
        System.out.println((a + b) % c);

        // (A % C + B % C) % C
        System.out.println((a % c + b % c) % c);

        // (A x B) % C
        System.out.println((a * b) % c);

        // (A % C x B % C) % C
        System.out.println((a % c * b % c) % c);
    }
}
