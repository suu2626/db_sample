package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Users;

/**
 * ユーザー情報 Repository
 */

public interface UserRepository extends JpaRepository<Users, Long> {}