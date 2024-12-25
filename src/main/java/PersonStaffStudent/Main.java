package PersonStaffStudent;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Dev", "123 Illampillai Salem");
        System.out.println(person);

        Student student = new Student("Dev R B", "Salem", "Computer Science", 2, 12000.50);
        System.out.println(student);

        student.setProgram("Data Science");
        student.setYear(3);
        student.setFee(14000.75);
        System.out.println("Updated Student Details: " + student);

        Staff staff = new Staff("Dev R B", "Erode", "ARB International", 45000.00);
        System.out.println(staff);

        staff.setSchool("Springfield High");
        staff.setPay(47000.00);
        System.out.println("Updated Staff Details: " + staff);
    }
}
