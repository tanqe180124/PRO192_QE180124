public class student extends person {
    private String[] major = {"AI", "Software engineer", "Information security", "Digital Art & Design"};

    public student(String email, String fullName, int birthYear, String gender, String phoneNumber, String address) {
        super(email, fullName, birthYear, gender, phoneNumber, address);
    }

    public void showSubjectByMajor(int major) {
        switch (major) {
            case 1:
                System.out.println("1. AI subject1");
                System.out.println("2. AI subject2");
                System.out.println("3. AI subject3");
                break;
            case 2:
                System.out.println("1. Software engineer subject1");
                System.out.println("2. Software engineer subject2");
                System.out.println("3. Software engineer subject3");
                break;
            case 3:
                System.out.println("1. Information security subject1");
                System.out.println("2. Information security subject2");
                System.out.println("3. Information security subject3");
                break;
            case 4:
                System.out.println("1. Digital Art & Design subject1");
                System.out.println("2. Digital Art & Design subject2");
                System.out.println("3. Digital Art & Design subject3");
                break;
        }
    }
}
