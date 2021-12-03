package com.gures.nspdelivery.repository;

import com.gures.nspdelivery.model.Project;
import com.gures.nspdelivery.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ServerRepository extends JpaRepository<Server, Integer> {

    @Query("select s from Server s where s.project.projectId = ?1")
    List<Server> findByProjectId(int customer_id);
}
