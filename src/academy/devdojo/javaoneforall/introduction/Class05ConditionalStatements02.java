package academy.devdojo.javaoneforall.introduction;

public class Class05ConditionalStatements02 {
    public static void main(String[] args) {
        // age < 15 category junior
        // age >= 15 && age < 18 category senior
        // age >= 18 category masters

        int age = 15;
        String category;

        if (age < 15) {
            category = "Category junior";
        } else if (age >= 15 && age < 18) {
            category = "Category senior";
        } else {
            category = "Category master";
        }

        System.out.println(category);

    }
}
