package com.gures.nspdelivery.repository;

import com.gures.nspdelivery.model.Customer;
import com.gures.nspdelivery.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProjectRepository extends JpaRepository<Project, Integer> {



    int findCustomerIdByProjectId(int project_id);

}
