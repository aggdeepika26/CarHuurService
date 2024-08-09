package be.intecbrussel.car_rental_spring.dto;

import be.intecbrussel.car_rental_spring.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;

    private UserRole userRole;
}
