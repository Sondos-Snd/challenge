package com.example.sender.service;

import lombok.RequiredArgsConstructor;
import com.example.sender.domain.Task;
import com.example.sender.repository.TaskRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final Logger log = LoggerFactory.getLogger(TaskService.class);

    private final TaskRepository taskRepository;

    public DataTablesOutput<Task> findAllDatatable(DataTablesInput input) {
        log.debug("Request to get all Tasks");
        return taskRepository.findAll(input);
    }

}
