package EffectiveMobileTest.TMS.controller;

import EffectiveMobileTest.TMS.service.TaskService;
import EffectiveMobileTest.TMS.dto.TaskDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/tasks")
public class TaskController {

    private final TaskService taskService;

    @PostMapping
    public TaskDto createTask(TaskDto taskDto) {
        return taskService.createTask(taskDto);
    }
}
