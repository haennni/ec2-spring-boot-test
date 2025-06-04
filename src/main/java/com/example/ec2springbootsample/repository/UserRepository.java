package com.example.ec2springbootsample.repository;

import com.example.ec2springbootsample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}