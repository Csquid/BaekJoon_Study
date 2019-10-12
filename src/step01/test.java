package step01;

public class test {
    public static void main(String[] args) {
        int v1 = 472, v2 = 385;

        for(; v2 > 0; v2 /= 10) {
            System.out.println(v1 * v2 - v1 * ((v2 / 10) * 10));
        }

        System.out.println(v1 * v2);
    }
}
