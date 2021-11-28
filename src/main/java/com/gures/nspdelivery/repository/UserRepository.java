package com.gures.nspdelivery.repository;

import com.gures.nspdelivery.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
