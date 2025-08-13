package LessonCore04.Task06;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>(Arrays.asList(
                new Car("Toyota Corolla", 132, new User("Alice", 28, 5), 18000, 2018),
                new Car("Honda Civic", 158, new User("Bob", 32, 10), 20000, 2019),
                new Car("Tesla Model 3", 283, new User("Charlie", 26, 3), 35000, 2021),
                new Car("Hyundai Elantra", 147, new User("Diana", 29, 6), 19000, 2020),
                new Car("Ford Mustang", 310, new User("Ethan", 35, 12), 30000, 2017),
                new Car("Chevrolet Malibu", 160, new User("Fiona", 27, 4), 22000, 2018),
                new Car("BMW 3 Series", 255, new User("George", 40, 15), 45000, 2019),
                new Car("Mazda 3", 186, new User("Hannah", 23, 2), 21000, 2020),
                new Car("Audi A4", 261, new User("Ian", 31, 8), 40000, 2021),
                new Car("Volkswagen Golf", 147, new User("Jasmine", 26, 4), 23000, 2019)
        ));

        System.out.println(cars);

        cars.stream()
                .filter(car -> car.getPower() < 200)
                .forEach(car -> car.setPower((int) (car.getPower() * 1.1)));

        System.out.println(cars);

        cars.stream()
                .filter(car -> car.getUser().getAge() > 25)
                .filter(car -> car.getUser().getExperience() < 5)
                .forEach(car -> car.getUser().setExperience(car.getUser().getExperience() + 1));

        System.out.println(cars);

        int priceSum = cars.stream()
                .mapToInt(Car::getPrice)
                .sum();

        System.out.println(priceSum);
    }
}