package academy.devdojo.javaoneforall.introduction;

public class Class05ConditionalStatements {
    public static void main(String[] args) {
        int age = 20;
        boolean isAllowedToBuyAlcohol = age >= 18;

        if(isAllowedToBuyAlcohol){
            System.out.println("Authorized to buy alcohol");
        }

        // ! (NOT)

        if(!isAllowedToBuyAlcohol){
            System.out.println("Sorry, you are not allowed to buy alcohol");
        }



        System.out.println("Outside IF");
    }
}
