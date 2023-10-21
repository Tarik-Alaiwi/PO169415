public class Time {
    public int hours;
    public int minutes;

    public void addTime(Time otherTime){
        int zm;
        hours += otherTime.hours;
        minutes += otherTime.minutes;
        if(minutes>59){
            zm = minutes - 60;
            hours++;
            minutes = zm;
        }
        zm=0;
        if(hours>23){
            zm = hours-24;
            hours = zm;
        }
    }
}
