package com.spring_boot.spring_boot2.dao;



import com.spring_boot.spring_boot2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
}

