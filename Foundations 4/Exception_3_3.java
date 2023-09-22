import java.util.Scanner;
// Xử lý exception cho trường hợp chia cho số 0
public class Exception_3_3 {
    public static void main(String[] args) {
        float a, b, result;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter your 2 numbers: ");
            a = sc.nextFloat();
            b = sc.nextFloat();
            if (b == 0) {
                throw new ArithmeticException("The number divided must be different from 0");
            }
        }
        catch (ArithmeticException e) {
            System.out.println("Error: "+e.getMessage());
        }
        catch (Exception e) { // exception de xu ly ngoai le chung nen de sau
            System.out.println("string is not allow");
        }
    }
}