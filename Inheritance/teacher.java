public class teacher extends person {
    int courseAdded = 11;
    private String[] listCourse;

    public teacher(String email, String fullName, int birthYear, String gender, String phoneNumber, String address) {
        super(email, fullName, birthYear, gender, phoneNumber, address);
        listCourse = new String[]{"ENT303", "ENT403", "ENT503", "PRF192", "CEA201", "CSI104", "OSG202", "MAE101", "MAD101", "SSG104", "PRO192", "None", "None", "None"};
    }

    public void addMoreCourse(String courseNeedToAdd) {
        if (courseAdded < listCourse.length) {
            listCourse[courseAdded] = courseNeedToAdd;
            courseAdded++;
        } else {
            System.out.println("list course is full");
        }
    }

    public void showAllCourse() {
        System.out.println("List course: ");
        for (int i = 0; i < listCourse.length; i++) {
            if (listCourse[i] != null) {
                System.out.println(listCourse[i]);
            }
        }
    }
}
