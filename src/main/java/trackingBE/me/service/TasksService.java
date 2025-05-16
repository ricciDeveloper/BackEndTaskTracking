package trackingBE.me.service;

import trackingBE.me.entity.Task;

import java.util.List;

public interface TasksService {
    List<Task> buscarTarefas();
    Task buscarPorId(Long id);
    void deletarTask(Long id);
    List<Task> buscarPorNome(String nomeTask);
}
