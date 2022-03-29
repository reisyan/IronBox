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


        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimento = formato.parse("10/11/1990");


        Atleta a1 = new Atleta();
        a1.setNome("Ramon");
        a1.setIdade(30);
        a1.setDataNascimento(dataNascimento);
        a1.setMatricula("iron102030");
        a1.setDatahora(LocalDateTime.now());

        System.out.println(a1.getNome());
        System.out.println(a1.getIdade());
        System.out.println(formato.format(dataNascimento));
        System.out.println(a1.getMatricula());
        System.out.println(LocalDateTime.now());


        SimpleDateFormat formatoa2 = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimentoa2 = formato.parse("14/08/1993");
        Atleta a2 = new Atleta();
        a2.setNome("Yan");
        a2.setIdade(28);
        a2.setDataNascimento(dataNascimentoa2);
        a2.setMatricula("iron202010");
        a2.setDatahora(LocalDateTime.now());

        System.out.println(a2.getNome());
        System.out.println(a2.getIdade());
        System.out.println(formato.format(dataNascimentoa2));
        System.out.println(a2.getMatricula());
        System.out.println(LocalDateTime.now());


        SimpleDateFormat formatoa3 = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimentoa3 = formato.parse("09/09/1989");
        Atleta a3 = new Atleta();
        a3.setNome("Thiago");
        a3.setIdade(29);
        a3.setDataNascimento(dataNascimentoa3);
        a3.setMatricula("iron505060");
        a3.setDatahora(LocalDateTime.now());

        System.out.println(a3.getNome());
        System.out.println(a3.getIdade());
        System.out.println(formato.format(dataNascimentoa3));
        System.out.println(a3.getMatricula());
        System.out.println(LocalDateTime.now());


        SimpleDateFormat formatoa4 = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimentoa4 = formato.parse("02/06/1994");
        Atleta a4 = new Atleta();
        a4.setNome("José");
        a4.setIdade(27);
        a4.setDataNascimento(dataNascimentoa4);
        a4.setMatricula("iron606070");
        a4.setDatahora(LocalDateTime.now());

        System.out.println(a4.getNome());
        System.out.println(a4.getIdade());
        System.out.println(formato.format(dataNascimentoa4));
        System.out.println(a4.getMatricula());
        System.out.println(LocalDateTime.now());



    }
}