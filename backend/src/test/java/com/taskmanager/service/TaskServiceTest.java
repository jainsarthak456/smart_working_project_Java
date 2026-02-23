package com.taskmanager.service;

import com.taskmanager.entity.Task;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TaskServiceTest {

    @Autowired
    private TaskService service;

    @Test
    void shouldCreateTask(){
        Task task = Task.builder()
                .title("Test Task")
                .build();

        Task saved = service.createTask(task);

        assertNotNull(saved.getId());
        assertEquals("Test Task", saved.getTitle());
    }

    @Test
    void shouldFetchTasks(){
        assertNotNull(service.getAllTasks());
    }
}
