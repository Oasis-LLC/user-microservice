package com.oasis.microservice.user.repository;

import com.oasis.microservice.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public User findById(String id);
    public User findByEmail(String email);
    public boolean existsByEmail(String email);
}
