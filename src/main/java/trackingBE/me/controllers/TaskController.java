package trackingBE.me.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trackingBE.me.entity.Task;
import trackingBE.me.service.TasksService;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TasksService tasksService;

    public TaskController(TasksService tasksService) {
        this.tasksService = tasksService;
    }

    // Buscar todas as tarefas
    @GetMapping
    public ResponseEntity<List<Task>> listarTarefas() {
        return ResponseEntity.ok(tasksService.buscarTarefas());
    }

    // Buscar tarefa por ID
    @GetMapping("/{id}")
    public ResponseEntity<Task> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(tasksService.buscarPorId(id));
    }

    // Buscar tarefa por nome (parcial)
    @GetMapping("/buscar")
    public ResponseEntity<List<Task>> buscarPorNome(@RequestParam String nome) {
        return ResponseEntity.ok(tasksService.buscarPorNome(nome));
    }

    // Deletar tarefa por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarTarefa(@PathVariable Long id) {
        tasksService.deletarTask(id);
        return ResponseEntity.noContent().build();
    }
}
