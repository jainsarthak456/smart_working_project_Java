package com.taskmanager.service;
import com.taskmanager.entity.Task;
import java.util.List;
public interface TaskService{
 Task createTask(Task t);
 List<Task> getAllTasks();
 Task getTaskById(Long id);
 void deleteTask(Long id);
}