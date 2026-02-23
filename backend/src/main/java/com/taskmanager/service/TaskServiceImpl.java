package com.taskmanager.service;
import com.taskmanager.entity.Task;
import com.taskmanager.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
@Service @RequiredArgsConstructor
public class TaskServiceImpl implements TaskService{
 private final TaskRepository repo;
 public Task createTask(Task t){return repo.save(t);}
 public List<Task> getAllTasks(){return repo.findAll();}
 public Task getTaskById(Long id){return repo.findById(id).orElseThrow();}
 public void deleteTask(Long id){repo.deleteById(id);}
}