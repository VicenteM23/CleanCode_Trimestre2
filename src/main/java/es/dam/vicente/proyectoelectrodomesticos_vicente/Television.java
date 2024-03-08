/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.dam.vicente.proyectoelectrodomesticos_vicente;

/**
 *
 * @author vicen
 */
public class Television extends Electrodomestico {
    /*CONSTANTES PRIVADAS*/
    final double RESOLUCION_DEFAULT = 20;
    final boolean SINTONIZADOR_DEFAULT = false;
    
    /*VARIABLES PUBLICAS*/
    double resolucion;
    boolean sintonizadorTDT;
    
    /*FUNCIONES PUBLICAS*/
    public Television(int precioBase, String color, char consumoEnergetico, double peso, double resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Television(int precioBase, double peso) {
        super(precioBase, peso);
    }

    public Television() {
        super();
        this.resolucion = RESOLUCION_DEFAULT;
        this.sintonizadorTDT = SINTONIZADOR_DEFAULT;
    }

    @Override
    public int precioFinal() {
        double precioResolucion = 0;
        int precioSintonizador = 0;
        if(resolucion>40)
            precioResolucion=super.precioFinal()*0.3;
        if (sintonizadorTDT==true){
            precioSintonizador=50;
        }
        return super.precioFinal() + (int) precioResolucion +precioSintonizador ;
    }
    
    
    
    
}
