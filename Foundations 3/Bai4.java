import java.util.Scanner;

// nhap ho va ten kiem tra ton tai trong danh sach khoi tao hay khong, neu co tin in 'yes' khong thi in '
public class Bai4 {
    public static void main(String[] args) {
        String[] list = new String[3];
        String user_request;
        int check = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your list (max 3): ");
        for (int i = 0; i < 3; i++) {
            list[i] = sc.nextLine();
        }
        System.out.println("Enter your name that you want to check: ");
        user_request = sc.nextLine();
        for (int j = 0; j < 3; j++){
            if (list[j].compareTo(user_request) == 0)
                check++;
        }
        if (check == 0)
            System.out.println("no");
        else
            System.out.println("yes");
    }
}
