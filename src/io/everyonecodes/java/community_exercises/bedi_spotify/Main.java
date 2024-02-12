package io.everyonecodes.java.community_exercises.bedi_spotify;

public class Main {
    public static void main(String[] args) {
        int daysListened = 365;
        int allMin = 52906;

        System.out.println("You listened to music for "
                + calculateDaysHoursMin(allMin) + "or an average of "
                + calculateAverageMinDay(daysListened, allMin));
    }

    public static String calculateDaysHoursMin(double allMin) {
        double days = (allMin / 60) / 24;
        double remainingHours = (days - (int) days) * 24;
        double remainingMin = (remainingHours - (int) remainingHours) * 60;

        return (int) days + " Days " + (int) remainingHours + " Hours " + (int) remainingMin + " Minutes ";
    }

    public static String calculateAverageMinDay(double daysListened, double allMin) {
        return (int) (allMin / daysListened)  + " Minutes per day.";
    }
}