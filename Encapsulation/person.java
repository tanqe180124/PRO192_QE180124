public class person {
    private String email;
    private String fullName;
    private int birthYear;
    private String gender;
    private String phoneNumber;
    private String address;

    public person(String email, String fullName, int birthYear, String gender, String phoneNumber, String address) {
        this.email = email;
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    public void showAllInformation () {
        System.out.println("Email: "+email);
        System.out.println("Full name: "+fullName);
        System.out.println("Birth year: "+birthYear);
        System.out.println("Gender: "+gender);
        System.out.println("Phone number: "+phoneNumber);
        System.out.println("Address: "+address);
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void changePhoneNumber (String newPhoneNumber) {
        this.phoneNumber = newPhoneNumber;
    }
    public void changeAddress (String newAddress) {
        this.address = newAddress;
    }
}
