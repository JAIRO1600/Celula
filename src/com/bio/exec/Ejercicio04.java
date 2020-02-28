/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bio.exec;

import com.bio.celulas.Celula;
import com.bio.celulas.Eucariota;
import com.bio.celulas.Procariota;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jairo
 */
public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Celula> cel = new ArrayList<Celula>();
        int opcion = 0;
        do {
            opcion = menu(in);
            switch (opcion) {
                case 1:
                    anyadirCelula(in, cel);
                    break;
                case 2:
                    mostrarCelula(in, cel);
                    break;
                case 3:
                    mostrarPeso(in, cel);
                    break;
                case 4:
                    Eucariota.clear();
                    System.out.println("Eucariota borrado");
                    break;
                case 5:
                    Procariota.clear();
                    System.out.println("Procariota borrado");
                    break;
                default:
                    break;

            }
        } while (opcion != 6);
        System.out.println("Hasta Luego");
        
    }

    public static void anyadirCelula(Scanner in,ArrayList<Celula> celula) {
 
        System.out.println("Introduzca el tipo de célula");
        String tipo = in.nextLine();
        System.out.println("Introduzca los milímetros de la membrana: ");
        Double mmMembrana = Double.parseDouble(in.nextLine());
        System.out.println("Dime la densidad de del citoplasma: ");
        Double densidadCitoplasma = Double.parseDouble(in.nextLine());
        System.out.println("Dime el peso: ");
        Double peso = Double.parseDouble(in.nextLine());
        System.out.println("Dime el tamaño: ");
        Double tamanyo = Double.parseDouble(in.nextLine());
        
        if(tipo.equals("Eucariota")){
            System.out.println("Tamaño núcleo");
            Double tamanyoNucleo = Double.parseDouble(in.nextLine());
            System.out.println("Numero de Organulos");
            int numeroOrganulos = Integer.parseInt(in.nextLine());
            Eucariota e = new Eucariota( tamanyoNucleo,  numeroOrganulos,  mmMembrana,  densidadCitoplasma,  peso,  tamanyo);
            
        }else if(tipo.equals("Procariota")){
            System.out.println("Numero de capas de la pared celular: ");
            int numeroCapasParedCelular = Integer.parseInt(in.nextLine());
            Procariota p = new Procariota(  numeroCapasParedCelular,  mmMembrana,  densidadCitoplasma,  peso,  tamanyo);
            celula.add(p);
        }
        

    }

    public static void mostrarCelula(ArrayList<Celula> celula) {

    }

    public static void mostrarPeso(ArrayList<Celula> celula) {

    }
    
    public static int menu(Scanner in) {
        int opcion = 0;
        System.out.println("-------------------------");
        System.out.println("1.- Añadir Célula");
        System.out.println("2.- Mostrar Célula");
        System.out.println("3.- Mostrar peso");
        System.out.println("4.- Borrar Eucariota");
        System.out.println("5.- Borrar Procariota");
        System.out.println("6.- Salir");
        while (!(opcion > 0 && opcion < 7)) {
            System.out.print("Introduzca una opción (del 1 al 6): ");
            opcion = Integer.parseInt(in.nextLine());
        }
        return opcion;
    }
}
