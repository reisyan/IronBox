package com.company;

import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa implements InterfacSalario {
    private List<Departamento> departamentos = new ArrayList<>();

    @Override
    public double salario() {
        return 10;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }
}

