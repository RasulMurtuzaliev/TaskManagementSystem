package EffectiveMobileTest.TMS.entity;

import EffectiveMobileTest.TMS.model.TaskPriority;
import EffectiveMobileTest.TMS.model.TaskStatus;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "task")
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", length = 128, nullable = false)
    String title;

    @Column(name = "description", length = 4096, nullable = false)
    String description;

    @Enumerated(EnumType.STRING)
    TaskStatus status;

    @Enumerated(EnumType.STRING)
    TaskPriority priority;

    @ManyToOne
    User author;

    User executor;
}
