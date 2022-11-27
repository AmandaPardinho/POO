package heritage;

public class Student extends Person {
    private int registrationNumber;
    private String course;

    public Student(String name, String email, String phone, int registrationNumber, String course) {
        super(name, email, phone);
        this.registrationNumber = registrationNumber;
        this.course = course;
    }

    public int getRegistrationNumber() {

        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {

        this.registrationNumber = registrationNumber;
    }

    public String getCourse() {

        return course;
    }

    public void setCourse(String course) {

        this.course = course;
    }

    public String showInfo() {
        return "Name: " + super.name + ", " + "E-mail: " + super.email + ", " + "Phone: " + super.phone + ", " +
                "Registration Number: " + this.registrationNumber + ", " + "Course: " + this.course;

    }
}
