package io.everyonecodes.java.t2b_functions2.set1.exercise3;

public class hair_growth {
    public static void main(String[] args) {

        double hairGrowthPerMonthInch = 0.5;
        double menHairLengthCm = 10;
        double womenHairLengthCm = 15;
        double hairOnHead = 100000;
        double idealLengthInMeter = 0.5;

        String firstAnswer = totalHairGrowthPerMonth(hairGrowthPerMonthInch, hairOnHead);
        String secondAnswer = calculateTotalLength(menHairLengthCm, womenHairLengthCm, hairOnHead);
        String thirdAnswer = calculateTimeToGrow(hairGrowthPerMonthInch, idealLengthInMeter);
        System.out.println(firstAnswer + '\n' + secondAnswer + '\n' + thirdAnswer);
        //System.out.println(printAnswer(hairGrowthPerMonthInch, hairOnHead,menHairLengthCm, womenHairLengthCm, idealLengthInMeter));
    }
    // Function that puts all of the above functions in a return statement. Not really readable imo.
    /*public static String printAnswer(double inMonth, double hairOnHead, double menLength, double womenLength, double idealLength ) {
        return totalHairGrowthPerMonth(inMonth, hairOnHead) + '\n' + calculateTotalLength(menLength, womenLength, hairOnHead)
                + '\n' + calculateTimeToGrow(inMonth, idealLength);
    }*/
    public static double inchesToCm(double inches) {
        return inches * 2.54;
    }
    public static double centimetersInMeters(double centimeters) {
        return centimeters / 100;
    }
    public static double meterToKilometer(double meter) {
        return meter / 1000;
    }
    public static String totalHairGrowthPerMonth(double growth, double hairOnHead){
        //What's the total hair growth per month (for all individual hairs on the head), in inches and km?

        double totalGrowthInches = growth * hairOnHead;
        double kilometers = meterToKilometer(centimetersInMeters(inchesToCm(totalGrowthInches)));

        // Alternatively we could make all these variables, if this is more readable, or make helper functions like
        // a function that converts inches to kilometers.

        // double centimeters = inchesToCm(totalGrowthInches);
        // double meters = centimetersInMeters(centimeters);
        //double kilometers = meterToKilometer(meters);

        return "The total hair growth per month is: "
                + totalGrowthInches
                + " inches or "
                + kilometers
                + " km.";
    }
    public static String calculateTotalLength(double menHairLengthCm, double womenHairLengthCm, double hairOnHead) {
        // men hair length
        double totalLengthMenCm = menHairLengthCm * hairOnHead;
        double menKilometers = meterToKilometer(centimetersInMeters(totalLengthMenCm));
        // women hair length
        double totalLengthWomen = womenHairLengthCm * hairOnHead;
        double womenKilometers = meterToKilometer(centimetersInMeters(totalLengthWomen));

        return "Total length of hair for men: "
                + menKilometers
                + " km, and for women: "
                + womenKilometers
                + " km.";
    }
    public static String calculateTimeToGrow(double growthPerMonthInch, double idealLengthInMeters) {
        double growthMeters = centimetersInMeters(inchesToCm(growthPerMonthInch));
        double timeToIdeal = idealLengthInMeters / growthMeters;
        return "You'll need "
                + timeToIdeal
                + " months to grow your hair 0.5 m.";
    }
}
