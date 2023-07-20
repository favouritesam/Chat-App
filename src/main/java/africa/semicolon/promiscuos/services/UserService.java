package africa.semicolon.promiscuos.services;

import africa.semicolon.promiscuos.dto.request.response.RegisterUserRequest;
import africa.semicolon.promiscuos.dto.request.response.RegisterUserResponse;

public interface UserService {
  RegisterUserResponse register(RegisterUserRequest registerUserRequest);
}
