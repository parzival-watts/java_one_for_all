package academy.devdojo.javaoneforall.introduction;

public class Class04Operators {
    public static void main(String[] args) {
        // + -  / *
        int number01 = 10;
        int number02 = 20;
        double result = number01 * (double) number02;

        System.out.println(result);

        // %
        int modulo = 20 % 2;
        System.out.println(modulo);

        // < > <= >= != ==
        boolean isTenLowerThanTwenty = 10 < 20;
        System.out.println("isTenLowerThanTwenty " + isTenLowerThanTwenty);

        boolean isTenGreaterThanTwenty = 10 > 20;
        System.out.println("isTenGreaterThanTwenty " + isTenGreaterThanTwenty);

        boolean isTenLowerOrEqualsThanTwenty = 10 <= 20;
        System.out.println("isTenLowerOrEqualsThanTwenty " + isTenLowerOrEqualsThanTwenty);

        boolean isTenGreaterOrEqualsThanTwenty = 10 >= 20;
        System.out.println("isTenGreaterOrEqualsThanTwenty " + isTenGreaterOrEqualsThanTwenty);

        boolean isTenDifferentThanTwenty = 10 != 20;
        System.out.println("isTenDifferentThanTwenty " + isTenDifferentThanTwenty);

        boolean isTenEqualsThanTwenty = 10 == 20;
        System.out.println("isTenEqualsThanTwenty " + isTenEqualsThanTwenty);

        // && (AND) || (OR) ! (NOT)

        int age = 35;
        float salary = 3500F;
        boolean isLegalOlderThanThirty = age >= 30 && salary >= 4612;
        boolean isLegalYoungerThanThirty = age < 30 && salary >= 3381;

        System.out.println("isLegalOlderThanThirty " + isLegalOlderThanThirty);
        System.out.println("isLegalYoungerThanThirty " + isLegalYoungerThanThirty);

    }
}
