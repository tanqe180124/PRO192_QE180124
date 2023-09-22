public class Person {
    private String email, full_name, gender, address;
    private int birth_year;
    private String phone_number;
    public Person (String e, String f, String g, String a, int b, String p) {
        this.email = e;
        this.full_name = f;
        this.gender = g;
        this.address = a;
        this.birth_year = b;
        this.phone_number = p;
    }
    public void Show_info () {
        System.out.println("Student infomation:\n");
        System.out.println("Email: " +this.email+ "\nFull name: "+this.full_name+"");
        System.out.println("Gender: " +this.gender+ "\nAddress: "+this.address+"");
        System.out.println("Birth Year: " +this.birth_year+ "\nPhone number: "+this.phone_number+"");
    }
    public String change_phone_number (String p) {
        this.phone_number = p;
        return this.phone_number;
    }
    public String change_address (String a) {
        this.address = a;
        return this.address;
    }
}
