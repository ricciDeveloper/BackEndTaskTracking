package trackingBE.me.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import trackingBE.me.entity.Task;

import java.util.List;

public interface TasksRepository extends JpaRepository<Task, Long> {
    List<Task> findByTaskContainingIgnoreCase(String task);
}
