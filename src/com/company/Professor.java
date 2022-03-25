package com.company;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa implements InterfacSalario {

    private String id;
    private List<Turno>turnos = new ArrayList<>();

    @Override
    public double salario() {
        return 20;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Turno> getTurno() {
        return turnos;
    }

    public void setTurno(List<Turno> turno) {
        this.turnos = turno;
    }
}
