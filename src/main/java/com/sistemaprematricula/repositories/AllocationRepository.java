package com.sistemaprematricula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistemaprematricula.models.Allocation;

@Repository
public interface AllocationRepository extends JpaRepository<Allocation, Long> {

}
