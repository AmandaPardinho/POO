package time;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
        this.second = 0;
    }

    public Time(int hour) {
        this.hour = hour;
        this.minute = 0;
        this.second = 0;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void  setTime(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
        this.second = 0;
    }

    public void setTime(int hour){
        this.hour = hour;
        this.minute = 0;
        this.second = 0;
    }

    public String showUniversalHour(){
        return formatNumber(this.hour) + " : " + formatNumber(this.minute) + " : " + formatNumber(this.second);
    }

    public String showStandardTime(){
        /* four cases:
            -0h - 12AM
            -12h - 12PM
            -01-11 - hourAM
            -13-23 -(hour - 12)PM
        * */
        String suffix;
        String standardHour;

        if(hour == 0){
            standardHour = "12";
            suffix = "AM";
        }else if(hour == 12){
            standardHour = "12";
            suffix = "PM";
        }else if(hour > 0 && hour < 12){
            standardHour = String.valueOf(formatNumber(hour));
            suffix = "AM";
        }else{
            standardHour = String.valueOf(formatNumber(hour - 12));
            suffix = "PM";
        }
        return standardHour + " : " + formatNumber(this.minute) + " : " + formatNumber(this.second) + suffix;
    }

    private String formatNumber(int number){
        if(number < 10){
            return "0" + number;
        }
        return String.valueOf(number);
    }
}
