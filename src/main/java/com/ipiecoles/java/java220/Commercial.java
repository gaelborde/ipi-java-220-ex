package com.ipiecoles.java.java220;

public class Commercial extends Employe {
    private Double caAnnuel = 0d;

    @Override
    public Double getPrimeAnnuelle(){
        return Math.max(Math.ceil(this.getCaAnnuel() * 0.05), 500);
    }

    public Double getCaAnnuel() {
        return caAnnuel;
    }

    public void setCaAnnuel(Double caAnnuel) {
        this.caAnnuel = caAnnuel;
    }

    public Commercial ()

}
