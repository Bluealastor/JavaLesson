package org.example;

import java.util.Date;

public class BastonateinFaccia {
    private int[] numeroDiBastonateinFaccia;
    private Date date;

    public Date getDate() {
       /** return data */
       //   creo un BackUP
        return (Date)  date.clone();
    }



    public void setDate(Date date) {
        this.date = (Date) date.clone();
    }

    public int[] getNumeroDiBastonateinFaccia() {
        return numeroDiBastonateinFaccia;
    }

    public void setNumeroDiBastonateinFaccia(int[] punteggioNuovo) {
        /*
        * Creo una copia dei miei dati così se viene modificata avro sempre il backup
        * */
        this.numeroDiBastonateinFaccia = new int[punteggioNuovo.length];

        System.arraycopy(punteggioNuovo,0,this.numeroDiBastonateinFaccia,0,punteggioNuovo.length);
    }

    public void mostramiIlNumeroDiBastonateInFaccia(){
        for(int i=0; i<this.numeroDiBastonateinFaccia.length; i++){
            System.out.print(this.numeroDiBastonateinFaccia[i] + " ");
        }

        System.out.println();

    }
}
