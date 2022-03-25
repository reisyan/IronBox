package com.company;

import java.time.LocalDateTime;

public class Atleta extends Pessoa {

        private String matricula;
        private LocalDateTime datahora;

        public String getMatricula() {
            return matricula;
        }

        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }

        public LocalDateTime getDatahora(LocalDateTime parse) {
            return datahora;
        }

        public void setDatahora(LocalDateTime datahora) {
            this.datahora = datahora;
        }
    }

