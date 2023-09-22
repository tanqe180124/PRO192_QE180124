import java.util.Scanner;
// Nhap 2 so tu ban phim in ra ket qua cong tru nhan chia
public class Bai1 {
    public static void main(String[] args) {
        float a, b, result;
        char op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your calculation: ");
        a = sc.nextFloat();
        op = sc.next().charAt(0);
        b = sc.nextFloat();
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
                System.out.println("Errol");
        }
    }
}
