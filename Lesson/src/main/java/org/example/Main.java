package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {

        System.out.println("Hello world!");

        BastonateinFaccia bastonateinFaccia = new BastonateinFaccia();
        int[] numerDiBastonatonateCheVorreiDare = {1,2,3};
        bastonateinFaccia.setNumeroDiBastonateinFaccia(numerDiBastonatonateCheVorreiDare);
        bastonateinFaccia.mostramiIlNumeroDiBastonateInFaccia();
        numerDiBastonatonateCheVorreiDare[0] = 999;
        bastonateinFaccia.mostramiIlNumeroDiBastonateInFaccia();

     //   final int[] ohNoLeBastonateDoveSono = bastonateinFaccia.getNumeroDiBastonateinFaccia();
       // ohNoLeBastonateDoveSono[0] = 0;
        //ohNoLeBastonateDoveSono[1] = 1;
        //ohNoLeBastonateDoveSono[2] = 2;
        //bastonateinFaccia.mostramiIlNumeroDiBastonateInFaccia();



        BastonateinFaccia bastonateinFaccia1 = new BastonateinFaccia();
        Date date = new SimpleDateFormat("yyyyMMdd").parse("211594823");
        bastonateinFaccia1.setDate(date);
        System.out.println(bastonateinFaccia1.getDate());
        Date nuovaDataCattiva = bastonateinFaccia1.getDate();
        nuovaDataCattiva.setTime(199565222);
        System.out.println(bastonateinFaccia1.getDate());
    }
}