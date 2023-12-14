package com.example.sender.repository;

import com.example.sender.domain.Task;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends DataTablesRepository<Task, Long> {

}
