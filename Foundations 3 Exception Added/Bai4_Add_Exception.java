import java.util.InputMismatchException;
import java.util.Scanner;

// nhap ho va ten kiem tra ton tai trong danh sach khoi tao hay khong, neu co tin in 'yes' khong thi in '
public class Bai4_Add_Exception {
    public static void main(String[] args) {
        String[] list = new String[3];
        String user_request;
        int check = 0;
        String[] copyList = new String[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your list (max 3): ");
        try {
            for (int i = 0; i < 3; i++) {
                list[i] = sc.nextLine();
                for (int j = 0; j < list[i].length(); j++) {
                    char currentChar = list[i].charAt(j);
                    if (Character.isDigit(currentChar) || !Character.isLetter(currentChar) && !Character.isWhitespace(currentChar)) {
                        throw new InputMismatchException("Your name is not valid");
                    }
                }
            }
        }
        catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("Enter your name that you want to check: ");
        user_request = sc.nextLine();
        for (int i = 0; i<3; i++) {
            copyList[i] = list[i].toLowerCase();
        }
        for (int j = 0; j < 3; j++){
            if (copyList[j].compareTo(user_request) == 0)
                check++;
        }
        if (check == 0)
            System.out.println("No");
        else
            System.out.println("Yes");
    }
}