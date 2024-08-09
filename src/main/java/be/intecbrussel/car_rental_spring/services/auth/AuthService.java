package be.intecbrussel.car_rental_spring.services.auth;

import be.intecbrussel.car_rental_spring.dto.SignupRequest;
import be.intecbrussel.car_rental_spring.dto.UserDto;

public interface AuthService {
    UserDto createCustomer(SignupRequest signupRequest);

    boolean hasCustomerWithEmail(String Email);
}
