package com.gures.nspdelivery.repository;

import com.gures.nspdelivery.model.Customer;
import com.gures.nspdelivery.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Integer> {



    int findCustomerIdByProjectId(int project_id);

    @Query("select p from Project p where p.customer.customerId = ?1")
    List<Project> findByCustomerId(int customer_id);

}
