package com.exercise;

public class TimeUtil {

    public static Long timeToMilliscenods(int hour, int minute, int seconds) {
        if ((hour >= 0 && hour <= 23) && (minute >= 0 && minute <= 59) && (seconds >= 0 && seconds <= 59)) {
            return Long.valueOf(hour * 3600 * 1000 + minute * 60 * 1000 + seconds * 1000);
        }
        return Long.valueOf(-1);
    }
}
