package com.gures.nspdelivery.repository;

import com.gures.nspdelivery.model.Customer;
import com.gures.nspdelivery.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

    @Query(value = "select customer_id from customer where customer_id in (select customer_id from project where project_id = :project_id)", nativeQuery = true)

    int findCustomerIdByProjectId(int project_id);

}
