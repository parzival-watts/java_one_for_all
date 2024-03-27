package academy.devdojo.javaoneforall.introduction;

public class Class07Arrays02 {
    public static void main(String[] args) {
        // byte, short, double, float, long, int = 0
        // char '\u0000' ''
        // boolean false
        // String null
        int[] ages = new int[3];
        ages[0] = 23;
        ages[1] = 24;
        ages[2] = 25;

        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }
    }
}
