package com.example.excercise15.repository;

 import com.example.excercise15.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;
 import org.springframework.data.jpa.repository.Query;
 import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country,Integer> {
 }
