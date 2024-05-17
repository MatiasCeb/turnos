package com.microservicios.turnos.service;

import java.time.LocalDate;
import java.util.List;

import com.microservicios.turnos.model.Turno;


public interface ITurnoService {
    public List<Turno> getTurnos();
    
    public void saveTurno(LocalDate fecha, String tratamiento, String dniPaciente);

    public void deleteTurno(Long id);
    
    public Turno findTurno(Long id);

    public void editTurno(Long id, Turno turno);
}
