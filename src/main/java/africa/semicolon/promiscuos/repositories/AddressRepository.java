package africa.semicolon.promiscuos.repositories;

import africa.semicolon.promiscuos.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {
}
