import java.util.InputMismatchException;
import java.util.Scanner;

// exception cho truong hop nguoi dung nhap string
public class Exception_3_3_1 {
    public static void main(String[] args) {
        int a, b, c;
        float result;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a, b, c (integer): ");
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if (!sc.hasNextInt())
                throw new InputMismatchException();
        }
        catch (InputMismatchException e) {
            System.out.println("Error: input is not an integer");
            return;
        }
        result = (float) (a + b + c) / 3;
        System.out.println("average: "+result);
    }
}
