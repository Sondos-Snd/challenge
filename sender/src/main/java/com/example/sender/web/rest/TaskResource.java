package com.example.sender.web.rest;

import lombok.RequiredArgsConstructor;
import com.example.sender.domain.Task;
import com.example.sender.service.TaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class TaskResource {

    private final Logger log = LoggerFactory.getLogger(TaskResource.class);
    private final TaskService taskService;

    /**
     * {@code GET  /tasks} : get all the tasks.
     *
     * @return the {@link DataTablesOutput} with status {@code 200 (OK)} and the list of tasks in body.
     */
    @GetMapping("/tasks")
    public DataTablesOutput<Task> findAllDatatable(@Valid DataTablesInput input) {
        log.debug("REST request to get a page of Tasks");
        return taskService.findAllDatatable(input);
    }

}
