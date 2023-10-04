import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userChoice, hasException;
        String email = "Null", fullName = "Null", gender = "Null", phoneNumber = "Null", address = "Null", course;
        int birthYear = 0;
        person person1 = new person(email, fullName, birthYear, gender, phoneNumber, address);
        teacher teacher1 = new teacher(email, fullName, birthYear, gender, phoneNumber, address);
        student student1 = new student(email, fullName, birthYear, gender, phoneNumber, address);
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
                    System.out.println("5. Teacher");
                    System.out.println("6. Student");
                    System.out.println("7. Exit");
                    System.out.println("-------------------------");
                    System.out.println("Enter your choice: ");
                    userChoice = sc.nextInt();
                    sc.nextLine();
                    switch (userChoice) {
                        case 1:
                            do {
                                hasException = -1;
                                System.out.print("Enter email: ");
                                email = sc.nextLine();
                                if (!email.contains("@") || !email.contains(".") || email.contains(" ")) {
                                    System.out.println("Your email is not valid");
                                    hasException = 0;
                                }
                            } while (hasException == 0);
                            do {
                                hasException = -1;
                                System.out.print("Enter full name: ");
                                fullName = sc.nextLine();
                                for (int i = 0; i < fullName.length(); i++) {
                                    char currentChar = fullName.charAt(i);
                                    if (!Character.isLetter(currentChar) && !Character.isWhitespace(currentChar)) {
                                        System.out.println("Your name is not valid");
                                        hasException = 0;
                                        break;
                                    }
                                }
                            } while (hasException == 0);
                            do {
                                hasException = -1;
                                System.out.print("Enter birth year: ");
                                if (sc.hasNextInt()) {
                                    birthYear = sc.nextInt();
                                    sc.nextLine();
                                    if (birthYear < 0) {
                                        System.out.println("Your birth year must be positive number");
                                        hasException = 0;
                                    }
                                } else {
                                    System.out.println("Your birth year is not valid");
                                    sc.nextLine();
                                    hasException = 0;
                                }
                            } while (hasException == 0);
                            do {
                                hasException = -1;
                                System.out.print("Enter gender: ");
                                gender = sc.nextLine();
                                for (int i = 0; i < gender.length(); i++) {
                                    char currentChar = gender.charAt(i);
                                    if (!Character.isLetter(currentChar)) {
                                        System.out.println("Your gender is not valid");
                                        hasException = 0;
                                        break;
                                    }
                                }
                            } while (hasException == 0);
                            do {
                                hasException = -1;
                                System.out.print("Enter phone number: ");
                                phoneNumber = sc.nextLine();
                                for (int i = 0; i < phoneNumber.length(); i++) {
                                    char currentChar = phoneNumber.charAt(i);
                                    if (Character.isLetter(currentChar)) {
                                        System.out.println("Your phone number is not valid");
                                        hasException = 0;
                                        break;
                                    }
                                }
                                if (phoneNumber.length() != 11 && phoneNumber.length() != 10) {
                                    System.out.println("Phone number must be 10 or 11 number");
                                    hasException = 0;
                                }
                            } while (hasException == 0);
                            System.out.print("Enter address: ");
                            address = sc.nextLine();
                            person1.setEmail(email);
                            person1.setFullName(fullName);
                            person1.setBirthYear(birthYear);
                            person1.setGender(gender);
                            person1.setPhoneNumber(phoneNumber);
                            person1.setAddress(address);
                            do {
                                hasException = -1;
                                try {
                                    System.out.println("The person is:");
                                    System.out.println("1. Teacher");
                                    System.out.println("2. Student");
                                    userChoice = sc.nextInt();
                                    sc.nextLine();
                                    switch (userChoice) {
                                        case 1:
                                            teacher1.setEmail(email);
                                            teacher1.setFullName(fullName);
                                            teacher1.setBirthYear(birthYear);
                                            teacher1.setGender(gender);
                                            teacher1.setPhoneNumber(phoneNumber);
                                            teacher1.setAddress(address);
                                            break;
                                        case 2:
                                            student1.setEmail(email);
                                            student1.setFullName(fullName);
                                            student1.setBirthYear(birthYear);
                                            student1.setGender(gender);
                                            student1.setPhoneNumber(phoneNumber);
                                            student1.setAddress(address);
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Your input is wrong");
                                    hasException = 0;
                                }
                            } while (hasException == 0);
                            System.out.println("Add success");
                            break;
                        case 2:
                            person1.showAllInformation();
                            break;
                        case 3:
                            do {
                                hasException = -1;
                                System.out.print("Enter phone number to change: ");
                                phoneNumber = sc.nextLine();
                                for (int i = 0; i < phoneNumber.length(); i++) {
                                    char currentChar = phoneNumber.charAt(i);
                                    if (Character.isLetter(currentChar)) {
                                        System.out.println("Your phone number is not valid");
                                        hasException = 0;
                                        break;
                                    }
                                }
                                if (phoneNumber.length() != 11 && phoneNumber.length() != 10) {
                                    System.out.println("Phone number must be 10 or 11 number");
                                    hasException = 0;
                                }
                            } while (hasException == 0);
                            person1.setPhoneNumber(phoneNumber);
                            break;
                        case 4:
                            System.out.print("Enter address to change: ");
                            address = sc.nextLine();
                            person1.setAddress(address);
                            System.out.println("Add success");
                            person1.setEmail(email);
                            person1.setFullName(fullName);
                            person1.setBirthYear(birthYear);
                            person1.setGender(gender);
                            person1.setPhoneNumber(phoneNumber);
                            person1.setAddress(address);
                            person1.setAddress(address);
                            break;
                        case 5:
                            do {
                                hasException = -1;
                                do {
                                    try {
                                        System.out.println("-------------------------");
                                        System.out.println("1. Show teacher information");
                                        System.out.println("2. Show all course");
                                        System.out.println("3. Add more course");
                                        System.out.println("4. Go back to menu");
                                        System.out.println("-------------------------");
                                        System.out.println("Enter your choice: ");
                                        userChoice = sc.nextInt();
                                        sc.nextLine();
                                        switch (userChoice) {
                                            case 1:
                                                teacher1.showAllInformation();
                                                break;
                                            case 2:
                                                teacher1.showAllCourse();
                                                break;
                                            case 3:
                                                System.out.println("Enter course to add: ");
                                                course = sc.nextLine();
                                                teacher1.addMoreCourse(course);
                                                break;
                                        }
                                    } catch (InputMismatchException e) {
                                        System.out.println("Your input is wrong");
                                        sc.nextLine();
                                        hasException = 0;
                                    }
                                } while (userChoice != 4);
                            } while (hasException == 0);
                            break;
                        case 6:
                            do {
                                hasException = -1;
                                do {
                                    try {
                                        System.out.println("-------------------------");
                                        System.out.println("1. Show all information");
                                        System.out.println("2. show subject by major");
                                        System.out.println("3. Go back to menu");
                                        System.out.println("-------------------------");
                                        System.out.println("Enter your choice: ");
                                        userChoice = sc.nextInt();
                                        sc.nextLine();
                                        switch (userChoice) {
                                            case 1:
                                                student1.showAllInformation();
                                                break;
                                            case 2:
                                                System.out.println("-------------------------");
                                                System.out.println("Enter Major: ");
                                                System.out.println("1. AI");
                                                System.out.println("2. software engineer");
                                                System.out.println("3. Information security");
                                                System.out.println("4. Digital Art & Design");
                                                System.out.println("-------------------------");
                                                System.out.println("Enter your choice: ");
                                                userChoice = sc.nextInt();
                                                sc.nextLine();
                                                student1.showSubjectByMajor(userChoice);
                                        }
                                    } catch (InputMismatchException e) {
                                        System.out.println("Your input is wrong");
                                        sc.nextLine();
                                        hasException = 0;
                                    }
                                } while (userChoice != 3);
                            } while (hasException == 0);
                            break;
                        case 7:
                            System.out.println("Good bye");
                            break;
                    }
                } while (userChoice != 7);
            } catch (InputMismatchException e) {
                System.out.println("Error: your input is wrong");
                hasException = 0;
                sc.nextLine();
            }
        }
        while (hasException == 0);
    }
}