package africa.semicolon.promiscuos.repositories;

import africa.semicolon.promiscuos.models.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification,Long> {
}
