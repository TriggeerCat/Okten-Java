package LessonCore02.Task01;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Address {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;
}


