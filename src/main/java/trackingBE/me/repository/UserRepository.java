package trackingBE.me.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import trackingBE.me.entity.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
   @Query("SELECT DISTINCT t.owner FROM Task t WHERE LOWER(t.task) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    List<User> findUsersByTaskContent(@Param("keyword") String keyword);
}
