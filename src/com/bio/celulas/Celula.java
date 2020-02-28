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
public abstract class Celula  {

private double mmMembrana;
private double densidadCitoplasma;
private double peso;
private double tamanyo;

    public double getMmMembrana() {
        return mmMembrana;
    }

    public void setMmMembrana(double mmMembrana) {
        this.mmMembrana = mmMembrana;
    }

    public double getDensidadCitoplasma() {
        return densidadCitoplasma;
    }

    public void setDensidadCitoplasma(double densidadCitoplasma) {
        this.densidadCitoplasma = densidadCitoplasma;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTamanyo() {
        return tamanyo;
    }

    public void setTamanyo(double tamanyo) {
        this.tamanyo = tamanyo;
    }

    public Celula(double mmMembrana, double densidadCitoplasma, double peso, double tamanyo) {
        this.mmMembrana = mmMembrana;
        this.densidadCitoplasma = densidadCitoplasma;
        this.peso = peso;
        this.tamanyo = tamanyo;
    }

    @Override
    public String toString() {
        return "Celula{" + "mmMembrana=" + mmMembrana + ", densidadCitoplasma=" + densidadCitoplasma + ", peso=" + peso + ", tamanyo=" + tamanyo + '}';
    }


    
}
