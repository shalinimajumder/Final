package com.example.externalapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.externalapi.model.Countries;

@Repository
public interface CountryRepository extends JpaRepository<Countries, String> {

}
