/*
 * Dieser Code ist identisch zu dem in OwnDate.java und OwnDateTester.java, ausser dass der Testcode direkt in der Klasse steht.
 */

public class OtherDate {
    int day;
    String month;
    int year;

    static boolean isEqual (OtherDate x, OtherDate y) {
        return x.day == y.day && x.month.equals(y.month) && x.year == y.year;
    }

    public static void main(String[] args) {
        OtherDate x = new OtherDate();
        x.day = 13;
        x.month = "Oktober";
        x.year = 2006;

        OtherDate y = x;
        y.day = 20;

        System.out.println(x.day);

        OtherDate z = new OtherDate();
        z.day = 20;
        z.month = "Oktober";
        z.year = 2006;
        System.out.println(isEqual(x, z));
    }
}
