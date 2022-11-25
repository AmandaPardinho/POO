package time;

public class TimeTest {
    public static void main(String[] args) {

        Time time = new Time(22, 15,45);

        System.out.println(time.showUniversalHour());
        System.out.println(time.showStandardTime());

        time.setTime(8,36);
        System.out.println(time.showUniversalHour());
        System.out.println(time.showStandardTime());

        time.setTime(17);
        System.out.println(time.showUniversalHour());
        System.out.println(time.showStandardTime());
    }
}