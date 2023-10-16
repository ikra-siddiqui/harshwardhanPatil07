import java.util.Scanner;

class Factorial {

    int fact(int a) {
        int i, f = 1;

        for (i = 1; i <= a; i++) {
            f = f * i;
        }

        return f;
    }

    public static void main(String args[]) {
        int a, f;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        a = sc.nextInt();

        Factorial fact = new Factorial();
        f = fact.fact(a);

        System.out.println("Factorial is:" + f);
    }
}
