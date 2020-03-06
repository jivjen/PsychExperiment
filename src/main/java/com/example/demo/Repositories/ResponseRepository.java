package com.example.demo.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.Responses;

@Repository
public interface ResponseRepository extends JpaRepository<Responses, Integer> { 

}
