package be.intecbrussel.car_rental_spring.dto;

import lombok.Data;

@Data
public class SignupRequest {
    private String email;
    private String firstName;
    private String lastName;
    private String password;
}
