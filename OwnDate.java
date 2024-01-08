/*
 * Studiere diese Klasse sowie OwnDateTester.java. Vergleiche dann mit OtherDate.java
 */


public class OwnDate {
    int day;
    String month;
    int year;

    static boolean isEqual (OwnDate x, OwnDate y) {
        return x.day == y.day && x.month.equals(y.month) && x.year == y.year;
    }
}
