package academy.devdojo.javaoneforall.javacore.Aintroductionclasses.test;

import academy.devdojo.javaoneforall.javacore.Aintroductionclasses.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.name = "Car1";
        car1.model = "Car1 model";
        car1.year = 2024;

        car2.name = "Car2";
        car2.model = "Car2 model";
        car2.year = 2024;


        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.name);


        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.name);
    }
}
