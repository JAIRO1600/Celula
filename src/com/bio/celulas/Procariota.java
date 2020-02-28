/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bio.celulas;

/**
 *
 * @author jairo
 */
public class Procariota extends Celula{
    private int numeroCapasParedCelular;

    public int getNumeroCapasParedCelular() {
        return numeroCapasParedCelular;
    }

    public void setNumeroCapasParedCelular(int numeroCapasParedCelular) {
        this.numeroCapasParedCelular = numeroCapasParedCelular;
    }

    public Procariota(int numeroCapasParedCelular, double mmMembrana, double densidadCitoplasma, double peso, double tamanyo) {
        super(mmMembrana, densidadCitoplasma, peso, tamanyo);
        this.numeroCapasParedCelular = numeroCapasParedCelular;
    }

    


    @Override
    public String toString() {
        return "Procariota{" + "numeroCapasParedCelular=" + numeroCapasParedCelular + '}';
    }
    
    
}
