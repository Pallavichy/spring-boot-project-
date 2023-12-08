package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Salesman_details;
@Repository
public interface SalesMan extends JpaRepository<Salesman_details , Integer> {

}
