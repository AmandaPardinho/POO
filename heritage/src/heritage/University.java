package heritage;

public class University {
    public static void main(String[] args) {

        Person p = new Person("Amanda", "amanda@amanda.com", "123456789");
        p.setName("Amanda");
        p.setEmail("amanda@amanda.com");
        p.setPhone("123456789");

        System.out.println(p.showInfo());

        Student s = new Student();
        s.setName("Rodrigo");
        s.setEmail("rodrigo@rodrigo.com");
        s.setPhone("987654321");
        s.setRegistrationNumber(666);
        s.setCourse("Music");

        System.out.println(s.showInfo());
    }
}