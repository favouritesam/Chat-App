package africa.semicolon.promiscuos.services;

import africa.semicolon.promiscuos.dto.request.response.RegisterUserRequest;
import africa.semicolon.promiscuos.dto.request.response.RegisterUserResponse;
import africa.semicolon.promiscuos.models.User;
import africa.semicolon.promiscuos.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PromiscousUserService implements  UserService {
    private final UserRepository userRepository;

    @Autowired
    public PromiscousUserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public RegisterUserResponse register(RegisterUserRequest registerUserRequest) {
        //1.extract registered details from the registration form(registerUserRequest)
        String email = registerUserRequest.getEmail();
        String password = registerUserRequest.getPassword();

        //2 create a user profile with the registration details
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);

        //3 save that users profile in the Database
        User saveUser = userRepository.save(user);

        //4 send verification token to the users email
        String emailResponse = MockEmailService.sendEmail(saveUser.getEmail());
        log.info("email sending response->{}",emailResponse);

        //5 return a response
        RegisterUserResponse registerUserResponse = new RegisterUserResponse();
        registerUserResponse.setMessage("Registration successful, check your email inbox for verification");
        return registerUserResponse;
    }
}
