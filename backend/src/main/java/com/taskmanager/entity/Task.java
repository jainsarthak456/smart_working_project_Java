package com.taskmanager.entity;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
@Entity @Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Task{
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
 private Long id;
 private String title;
 private String description;
 private boolean isCompleted=false;
 private LocalDateTime dueDate;
}