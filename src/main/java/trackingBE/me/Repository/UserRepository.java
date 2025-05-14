package trackingBE.me.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import trackingBE.me.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
