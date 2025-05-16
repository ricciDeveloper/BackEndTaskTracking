package trackingBE.me.service.impl;

import org.springframework.stereotype.Service;
import trackingBE.me.entity.Task;
import trackingBE.me.repository.TasksRepository;
import trackingBE.me.service.TasksService;

import java.util.List;

@Service
public class TasksServiceImpl implements TasksService {

    private final TasksRepository tasksRepository;

    public TasksServiceImpl(TasksRepository tasksRepository) {
        this.tasksRepository = tasksRepository;
    }

    @Override
    public List<Task> buscarTarefas() {
        return tasksRepository.findAll();
    }

    @Override
    public Task buscarPorId(Long id) {
        return tasksRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task não encontrada com ID: " + id));
    }

    @Override
    public void deletarTask(Long id) {
        if (!tasksRepository.existsById(id)) {
            throw new RuntimeException("Task não encontrada com ID: " + id);
        }
        tasksRepository.deleteById(id);
    }

    @Override
    public List<Task> buscarPorNome(String Task) {
        return tasksRepository.findByTaskContainingIgnoreCase(Task);
    }

}
