package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modal.Login;

public interface LoginRepository extends JpaRepository<Login, String> {

}
