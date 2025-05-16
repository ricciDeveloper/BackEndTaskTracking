package trackingBE.me.service;

import trackingBE.me.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User save(User user);
    Optional<User> findById(Long id);
    List<User> findAll();
    void deleteById(Long id);
    List<User> findByUserName(String username);
}
