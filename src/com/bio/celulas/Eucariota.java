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
public class Eucariota extends Celula{
    private double tamanyoNucleo;
    private int numeroOrganulos;


    public double getTamanyoNucleo() {
        return tamanyoNucleo;
    }

    public void setTamanyoNucleo(double tamanyoNucleo) {
        this.tamanyoNucleo = tamanyoNucleo;
    }

    public int getNumeroOrganulos() {
        return numeroOrganulos;
    }

    public void setNumeroOrganulos(int numeroOrganulos) {
        this.numeroOrganulos = numeroOrganulos;
    }

    public Eucariota(double tamanyoNucleo, int numeroOrganulos, double mmMembrana, double densidadCitoplasma, double peso, double tamanyo) {
        super(mmMembrana, densidadCitoplasma, peso, tamanyo);
        this.tamanyoNucleo = tamanyoNucleo;
        this.numeroOrganulos = numeroOrganulos;
    }



    @Override
    public String toString() {
        return "Eucariota{" + "tamanyoNucleo=" + tamanyoNucleo + ", numeroOrganulos=" + numeroOrganulos + '}';
    }
    
    
}
