package step01;

import java.util.Scanner;

public class Step_12_multiple_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println(n1 * (n2 % 10));
        System.out.println(n1 * ((n2 / 10) % 10));
        System.out.println(n1 * (n2 / 100));
        System.out.println(n1 * n2);
    }
}