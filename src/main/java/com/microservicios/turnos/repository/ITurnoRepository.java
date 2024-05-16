package com.microservicios.turnos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservicios.turnos.model.Turno;

@Repository
public interface ITurnoRepository extends JpaRepository<Turno, Long>{
    
}
