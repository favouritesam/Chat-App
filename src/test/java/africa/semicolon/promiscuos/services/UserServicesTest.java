package africa.semicolon.promiscuos.services;

import africa.semicolon.promiscuos.dto.request.response.RegisterUserRequest;
import africa.semicolon.promiscuos.dto.request.response.RegisterUserResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class UserServicesTest {
    @Autowired
    private UserService userService;


    @Test
    public void testThatUserCanRegister(){
        //user fills registration form
        RegisterUserRequest registerUserRequest = new RegisterUserRequest();
        registerUserRequest.setEmail("test@yahoo.com");
        registerUserRequest.setPassword("password");

        //user submits from by calling register method
        RegisterUserResponse registerUserResponse = userService.register(registerUserRequest);
        assertNotNull(registerUserResponse);
        assertNotNull(registerUserResponse.getMessage());


    }
}
