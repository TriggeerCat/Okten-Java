package LessonCore02.Task02;

import LessonCore02.Task01.Company;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Car {
    private int id;
    private String brand;
    private String name;
    private int price;
    private int year;
    private Company company;
}
