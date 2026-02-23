package com.taskmanager.controller;
import com.taskmanager.entity.Task;
import com.taskmanager.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/tasks")
@RequiredArgsConstructor
@CrossOrigin("*")
public class TaskController{
 private final TaskService service;
 @PostMapping public Task create(@RequestBody Task t){return service.createTask(t);}
 @GetMapping public List<Task> all(){return service.getAllTasks();}
 @DeleteMapping("/{id}") public void delete(@PathVariable Long id){service.deleteTask(id);}
}