package com.company;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class Main {

    public static void main(String[] args) throws ParseException {
	// write your code here
        // teste

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimento = formato.parse("10/11/1990");


        Atleta a1 = new Atleta();
        a1.setNome("Ramon");
        a1.setIdade(31);
        a1.setDataNascimento(dataNascimento);
        a1.setMatricula("iron102030");
        a1.setDatahora(LocalDateTime.now());

        System.out.println(a1.getNome());
        System.out.println(a1.getIdade());
        System.out.println(formato.format(dataNascimento));
        System.out.println(a1.getMatricula());
        System.out.println(LocalDateTime.now());




    }
}