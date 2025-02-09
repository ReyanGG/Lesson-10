import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter two number");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = x / y;
            System.out.println(x + "/" + y + "=" + z);
        }

        catch (ArithmeticException ex) {
            System.out.println(" catch block");
            System.out.println(ex.toString());
        } finally {
            System.out.println("Finally blocked");
            sc.close();
        }

    }
}