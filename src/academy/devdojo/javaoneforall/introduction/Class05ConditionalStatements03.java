package academy.devdojo.javaoneforall.introduction;

public class Class05ConditionalStatements03 {
    public static void main(String[] args) {
        // if salary > 2000 "buy ps5" "don't buy ps5"
        double salary = 3500D;
        String shouldBuyMessage = "buy PS5";
        String shouldNotBuyMessage = "don't buy PS5";

        // (condition) ? <true> : <false>
        String displayMessage = salary > 2000 ? shouldBuyMessage : shouldNotBuyMessage;

//        if(salary > 2000){
//            displayMessage = shouldBuyMessage;
//        }else{
//            displayMessage = shouldNotBuyMessage;
//        }

        System.out.println(displayMessage);

    }
}
