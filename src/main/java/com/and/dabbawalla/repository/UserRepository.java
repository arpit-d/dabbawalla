package com.and.dabbawalla.repository;

import com.and.dabbawalla.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
