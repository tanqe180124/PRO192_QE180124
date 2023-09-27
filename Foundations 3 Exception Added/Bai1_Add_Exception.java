// Nhap 2 so tu ban phim in ra ket qua cong tru nhan chia
import java.util.InputMismatchException;
import java.util.Scanner;
public class Bai1_Add_Exception {
    public static void main(String[] args) {
        float a, b, result;
        char op;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter your calculation: ");
            System.out.println("Enter a: ");
            a = sc.nextFloat();
            System.out.println("Enter b:");
            b = sc.nextFloat();
            System.out.println("Enter operation (+,-,*,/): ");
            op = sc.next().charAt(0);
            switch (op) {
                case '+':
                    result = a + b;
                    System.out.println(result);
                    break;
                case '-':
                    result = a - b;
                    System.out.println(result);
                    break;
                case '*':
                    result = a * b;
                    System.out.println(result);
                    break;
                case '/':
                    if (b == 0) {
                        System.out.println("Error");
                        break;
                    } else {
                        result = a / b;
                        System.out.println(result);
                        break;
                    }
                default:
                    System.out.println("Your calculation is not valid");
            }
        } catch (InputMismatchException e) {
            System.out.println("Your input is not a valid number");
        }
    }
}