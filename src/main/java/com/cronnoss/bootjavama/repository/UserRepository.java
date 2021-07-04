package com.cronnoss.bootjavama.repository;

import com.cronnoss.bootjavama.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}