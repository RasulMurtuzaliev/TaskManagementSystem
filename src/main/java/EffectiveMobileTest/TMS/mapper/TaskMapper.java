package EffectiveMobileTest.TMS.mapper;

import EffectiveMobileTest.TMS.dto.TaskDto;
import EffectiveMobileTest.TMS.entity.Task;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TaskMapper {

    @Mapping(source = "authorId", target = "author.id")
    @Mapping(source = "executorId", target = "executor.id")
    Task toEntity(TaskDto taskDto);

    @Mapping(source = "author.id", target = "authorId")
    @Mapping(source = "executor.id", target = "executorId")
    TaskDto toDto(Task task);
}
