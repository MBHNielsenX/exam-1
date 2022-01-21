public class DateAgeCalculator {
    private int yourAge;
    private int yourDatesAge;

    public DateAgeCalculator(int yourAge, int yourDatesAge) {
        this.yourAge = yourAge;
        this.yourDatesAge = yourDatesAge;
    }

    public int getYourAge() {
        return yourAge;
    }

    public int getYourDatesAge() {
        return yourDatesAge;
    }

    public int acceptableDateAge() {
        int ageOfYou = getYourAge();
        int lowestAcceptableAge = ageOfYou / 2 + 7;

        System.out.println("The lowest acceptable age for you to date is: \n");
        return lowestAcceptableAge;
    }

    public boolean isMyDateTooYoung(int acceptableDateAge) {
        int datesAge = getYourDatesAge();
        if (datesAge < acceptableDateAge) {
            return true;
        } else {
            return false;
        }

    }
}
