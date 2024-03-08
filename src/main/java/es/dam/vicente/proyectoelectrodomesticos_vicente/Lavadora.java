/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.dam.vicente.proyectoelectrodomesticos_vicente;

/**
 *
 * @author vicen
 */
public class Lavadora extends Electrodomestico {
    /*CONSTANTES PRIVADAS*/
    final private int CARGA_DEFAULT = 5;
    
    /*VARIABLES PRIVADAS*/
    private int carga;

    /*FUNCIONES PUBLICAS*/
    public Lavadora(int precioBase, String color, char consumoEnergetico, double peso, int carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Lavadora(int precioBase, double peso) {
        super(precioBase, peso);
    }

    public Lavadora() {
        super();
        this.carga = CARGA_DEFAULT;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public int precioFinal() {
        int precioCarga = 0;
        if(carga>30){
            precioCarga=50;
        }
        return super.precioFinal() + precioCarga;
        
    }
    
    
    
}
