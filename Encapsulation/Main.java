import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student email: ");
        String email = sc.nextLine();
        System.out.println("Enter student name: ");
        String full_name = sc.nextLine();
        System.out.println("Enter student gender: ");
        String gender = sc.nextLine();
        System.out.println("Enter student address: ");
        String address = sc.nextLine();
        System.out.println("Enter student phone number: ");
        String phone_number = sc.nextLine();
        System.out.println("Enter student birth year: ");
        int birth_year = sc.nextInt();
        Person student = new Person(email, full_name, gender, address, birth_year, phone_number);
        student.Show_info();
        sc.nextLine(); // tieu thu ky tu xuong dong
        System.out.println("\nEnter phone number that you want to change for student: ");
        String new_phone_number = sc.nextLine();
        student.change_phone_number(new_phone_number);
        System.out.println("\nEnter address that you want to change for student: ");
        String new_address = sc.nextLine();
        student.change_address(new_address);
        student.Show_info();
    }
}