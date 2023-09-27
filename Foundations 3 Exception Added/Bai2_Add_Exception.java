    import java.util.InputMismatchException;
    import java.util.Scanner;

    // nhap ho va ten va in ra day du
    public class Bai2_Add_Exception {
        public static void main(String[] args) {
            String fullName;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your full name: ");
            fullName = sc.nextLine();
            try {
                for (int i = 0; i < fullName.length(); i++) {
                    char currentChar = fullName.charAt(i);
                    if (Character.isDigit(currentChar)) {
                        throw new InputMismatchException("Error: Has number in your name");
                    }
                    if (!Character.isLetter(currentChar) && !Character.isWhitespace(currentChar)) {
                        throw new InputMismatchException("Error: Has special character in your name");
                    }
                }
                System.out.println("Your name: " + fullName);
            }
            catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        }
    }