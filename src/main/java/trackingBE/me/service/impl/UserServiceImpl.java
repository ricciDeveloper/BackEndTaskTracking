package trackingBE.me.service.impl;

import trackingBE.me.entity.User;
import trackingBE.me.repository.UserRepository;
import trackingBE.me.service.UserService;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl  implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<User> findById(Long id) {
        return Optional.ofNullable(userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("usuário não localizado pelo ID: " + id)));
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<User> findByUserName(String username) {
        return userRepository.findUsersByTaskContent(username);
    }
}
