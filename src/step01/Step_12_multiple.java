package step01;

import java.util.Scanner;

public class Step_12_multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        String n2 = sc.next();

        for(int i = 3; i > 0; i--) {
            System.out.println(n1 * Character.getNumericValue(n2.charAt(i - 1)));
        }
        System.out.println(n1 * Integer.parseInt(n2));
    }
}
