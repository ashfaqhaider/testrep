package exercise2._3;

/**
 * Created by Elev1 on 2016-05-31.
 */
public enum WeekDay {
    SUNDAY("SUNDAY", "Andreas"),
    MONDAY("MONDAY", "Johan"),
    TUESDAY("TUESDAY", "Lars"),
    WEDNESDAY("WEDNESDAY", "Youkie"),
    THURSDAY("THURSDAY", "Ashfaq"),
    FRIDAY("FRIDAY", "Dan"),
    SATURDAY("SATURDAY", "Jonas");

    private String day;
    private String person;

    WeekDay(String day, String person) {
        this.day = day;
        this.person=person;
    }

    public static String getPersonOfTheDay(String day) {
        switch (day){
            case "MONDAY":
                return MONDAY.person;
            case "TUESDAY":
                return TUESDAY.person;
            case "WEDNESDAY":
                return WEDNESDAY.person;
            case "THURSDAY":
                return THURSDAY.person;
            case "FRIDAY":
                return FRIDAY.person;
            case "SATURDAY":
                return SATURDAY.person;
            case "SUNDAY":
                return SUNDAY.person;
            default:
                return "Even 5 years old knows days names !";
        }

    }
}
