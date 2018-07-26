package com.sistemaprematricula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistemaprematricula.models.CurricularComponent;

@Repository
public interface CurricularComponentRepository extends JpaRepository<CurricularComponent, Long>{

}
