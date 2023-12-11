package EffectiveMobileTest.TMS.service;

import EffectiveMobileTest.TMS.dto.TaskDto;
import EffectiveMobileTest.TMS.mapper.TaskMapper;
import EffectiveMobileTest.TMS.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;
    private final TaskMapper taskMapper;

    public TaskDto createTask(TaskDto taskDto) {
        return taskMapper.toDto(taskRepository.save(taskMapper.toEntity(taskDto)));
    }
}
