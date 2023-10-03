import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userChoice, hasException, checkException;
        String email = "Null", fullName = "Null", gender = "Null", phoneNumber = "Null", address = "Null";
        int birthYear = 0;
        person person1 = new person(email, fullName, birthYear, gender, phoneNumber, address);
        Scanner sc = new Scanner(System.in);
        do {
            hasException = -1;
            try {
                do {
                    System.out.println("-------------------------");
                    System.out.println("1. Add person information");
                    System.out.println("2. Show all information");
                    System.out.println("3. Change phone number");
                    System.out.println("4. change address");
                    System.out.println("5. Exit");
                    System.out.println("-------------------------");
                    System.out.println("Enter your choice: ");
                    userChoice = sc.nextInt();
                    sc.nextLine();
                    switch (userChoice) {
                        case 1:
                            do {
                                checkException = 0;
                                System.out.print("Enter email: ");
                                email = sc.nextLine();
                                if (!email.contains("@") || !email.contains(".") || email.contains(" ")) {
                                        System.out.println("Your email is not valid");
                                        checkException = -1;
                                }
                            } while (checkException == -1);
                            do {
                                checkException = 0;
                                System.out.print("Enter full name: ");
                                fullName = sc.nextLine();
                                for (int i = 0; i < fullName.length(); i++) {
                                    char currentChar = fullName.charAt(i);
                                    if (!Character.isLetter(currentChar) && !Character.isWhitespace(currentChar)) {
                                        System.out.println("Your name is not valid");
                                        checkException = -1;
                                        break;
                                    }
                                }
                            } while (checkException == -1);
                            do {
                                checkException = 0;
                                    System.out.print("Enter birth year: ");
                                    if (sc.hasNextInt()) {
                                        birthYear = sc.nextInt();
                                        sc.nextLine();
                                        if (birthYear < 0) {
                                            System.out.println("Your birth year must be positive number");
                                            checkException = -1;
                                        }
                                    }
                                    else {
                                        System.out.println("Your birth year is not valid");
                                        sc.nextLine();
                                        checkException = -1;
                                    }
                            } while (checkException == -1);
                            do {
                                checkException = 0;
                                System.out.print("Enter gender: ");
                                gender = sc.nextLine();
                                for (int i = 0; i < gender.length(); i++) {
                                    char currentChar = gender.charAt(i);
                                    if (!Character.isLetter(currentChar)) {
                                        System.out.println("Your gender is not valid");
                                        checkException = -1;
                                        break;
                                    }
                                }
                            } while (checkException == -1);
                            do {
                                checkException = 0;
                                System.out.print("Enter phone number: ");
                                phoneNumber = sc.nextLine();
                                for (int i = 0; i < phoneNumber.length(); i++) {
                                    char currentChar = phoneNumber.charAt(i);
                                    if (Character.isLetter(currentChar)) {
                                        System.out.println("Your phone number is not valid");
                                        checkException = -1;
                                        break;
                                    }
                                }
                                if (phoneNumber.length() != 11 && phoneNumber.length() != 10) {
                                    System.out.println("Phone number must be 10 or 11 number");
                                    checkException = -1;
                                }
                            } while (checkException == -1);
                            do {
                                checkException = 0;
                                System.out.print("Enter address: ");
                                address = sc.nextLine();
                            } while (checkException == -1);
                            System.out.println("Add success");
                            person1.setEmail(email);
                            person1.setFullName(fullName);
                            person1.setBirthYear(birthYear);
                            person1.setGender(gender);
                            person1.changePhoneNumber(phoneNumber);
                            person1.changeAddress(address);
                            break;
                        case 2:
                            person1.showAllInformation();
                            break;
                        case 3:
                            do {
                                checkException = 0;
                                System.out.print("Enter phone number to change: ");
                                phoneNumber = sc.nextLine();
                                for (int i = 0; i < phoneNumber.length(); i++) {
                                    char currentChar = phoneNumber.charAt(i);
                                    if (Character.isLetter(currentChar)) {
                                        System.out.println("Your phone number is not valid");
                                        checkException = -1;
                                        break;
                                    }
                                }
                                if (phoneNumber.length() != 11 && phoneNumber.length() != 10) {
                                    System.out.println("Phone number must be 10 or 11 number");
                                    checkException = -1;
                                }
                            } while (checkException == -1);
                            person1.changePhoneNumber(phoneNumber);
                            break;
                        case 4:
                            do {
                                checkException = 0;
                                System.out.print("Enter address to change: ");
                                address = sc.nextLine();
                            } while (checkException == -1);
                            System.out.println("Add success");
                            person1.setEmail(email);
                            person1.setFullName(fullName);
                            person1.setBirthYear(birthYear);
                            person1.setGender(gender);
                            person1.changePhoneNumber(phoneNumber);
                            person1.changeAddress(address);
                            person1.changeAddress(address);
                            break;
                        default:
                            System.out.println("Invalid choice, try again");
                    }
                } while (userChoice != 5);
                } catch (InputMismatchException e) {
                System.out.println("Error: your input is wrong");
                hasException = 0;
                sc.nextLine();
            }
        }
        while (hasException == 0);
    }
}