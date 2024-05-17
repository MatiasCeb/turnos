package com.microservicios.turnos.dto;

import lombok.Setter;
import lombok.Getter;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class TurnoDTO {

    private LocalDate fecha;
    private String tratamiento;
    private String dniPaciente;

}

