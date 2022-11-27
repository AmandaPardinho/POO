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
        return "Name: " + getName() + ", " + "E-mail: " + getEmail() + ", " + "Phone: " + getPhone() + ", " +
                "Registration Number: " + registrationNumber + ", " + "Course: " + course;

    }
}
