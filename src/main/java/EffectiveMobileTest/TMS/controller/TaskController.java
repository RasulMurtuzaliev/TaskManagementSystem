package EffectiveMobileTest.TMS.controller;

import EffectiveMobileTest.TMS.service.TaskService;
import EffectiveMobileTest.TMS.dto.TaskDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/tasks")
@Tag(name = "Tasks", description = "Task management API")
public class TaskController {

    private final TaskService taskService;

    @PostMapping("/")
    @Operation(summary = "Create task")
    public TaskDto createTask(@RequestBody TaskDto taskDto) {
        return taskService.createTask(taskDto);
    }
}
