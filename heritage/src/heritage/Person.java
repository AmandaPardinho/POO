package heritage;

public class Person {
    protected String name;
    protected String email;
    protected String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String showInfo(){
        return "Name: " + getName() + ", " + "E-mail: " + getEmail() + ", " + "Phone: " + getPhone();
    }
}
