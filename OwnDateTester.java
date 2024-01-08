public class OwnDateTester {
    public static void main(String[] args) {
        OwnDate x = new OwnDate();
        x.day = 13;
        x.month = "Oktober";
        x.year = 2006;

        OwnDate y = x;
        y.day = 20;

        System.out.println(x.day);

        OwnDate z = new OwnDate();
        z.day = 20;
        z.month = "Oktober";
        z.year = 2006;
        System.out.println(OwnDate.isEqual(x, z));
    }
}
