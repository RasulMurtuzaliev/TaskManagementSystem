package EffectiveMobileTest.TMS.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TaskDto {

    private Long id;
    private String title;
    private String description;
    private String status;
    private String priority;
    private Long authorId;
    private Long executorId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
