package com.cristhyangoes.todosimple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cristhyangoes.todosimple.models.Task;
import java.util.List;


@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{
    
    List<Task> findByUser_Id (Long id);
}
