package trackingBE.me.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import trackingBE.me.entity.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByTaskContainingIgnoreCase(String username);
}
