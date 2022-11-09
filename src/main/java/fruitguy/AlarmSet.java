package fruitguy;

public class AlarmSet {
    public static boolean setAlarm(boolean employed, boolean vacation) {
        if (employed && vacation) {
            return false;
        }
        return employed;
    }
}
