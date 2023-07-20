package africa.semicolon.promiscuos.repositories;

import africa.semicolon.promiscuos.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
