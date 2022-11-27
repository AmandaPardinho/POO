package heritage;

public class Student extends Person {
    private String registrationNumber;
    private String course;

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
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
