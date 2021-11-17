package com.gures.nspdelivery.repository;

import com.gures.nspdelivery.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
