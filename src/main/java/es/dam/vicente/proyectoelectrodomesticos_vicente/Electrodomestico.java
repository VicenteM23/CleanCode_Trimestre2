/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.dam.vicente.proyectoelectrodomesticos_vicente;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author vicen
 */
public class Electrodomestico {
    /*CONSTANTES PRIVADAS*/
    private final int PRECIO_DEFAULT = 100;
    private final String COLOR_DEFAULT = "blanco";
    private final char CONSUMO_DEFAULT = 'F';
    private final double PESO_DEFAULT = 5;
    
    /*VARIABLES PRIVADAS*/
    private int precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;

    /*FUNCIONES PUBLICAS*/
    public Electrodomestico(int precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }
    
    public Electrodomestico(int precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }
    
    
    public Electrodomestico() {
        this.precioBase = PRECIO_DEFAULT;
        this.color = COLOR_DEFAULT;
        this.consumoEnergetico = CONSUMO_DEFAULT;
        this.peso = PESO_DEFAULT;
    }

    public double getPrecioBase() { return precioBase; }
    public String getColor() { return color; }
    public char getConsumoEnergetico() { return consumoEnergetico; }
    public double getPeso() { return peso; }
    public double getPrecioDefault() { return PRECIO_DEFAULT; }
    public String getColorDefault() { return COLOR_DEFAULT; }
    public char getConsumoDefault() { return CONSUMO_DEFAULT; }
    public double getPesoDefault() { return PESO_DEFAULT; }
    
    public int precioFinal(){
        comprobarConsumoEnergetico();
        int precioConsumo = 0, precioTamanyo = 0, precioExtra = 0, precioFinal = 0;
        if(consumoEnergetico=='A'){
            precioConsumo=100;
        }
            else if(consumoEnergetico=='B'){
                precioConsumo=80;
            }
            else if(consumoEnergetico=='C'){
                precioConsumo=60;
            }
            else if(consumoEnergetico=='D'){
                precioConsumo=50;
            }
            else if(consumoEnergetico=='E'){
                precioConsumo=30;
            }
            else if(consumoEnergetico=='F'){
                precioConsumo=10;
            }
        if(peso<20){
            precioTamanyo=10;
        }
            else if(peso>=20 && peso<50){
                precioTamanyo=50;
            }
            else if(peso>=50 && peso<80){
                    precioTamanyo=80;
                }
            else if(peso>=80){
                    precioTamanyo=100;
                }
        precioExtra=precioConsumo+precioTamanyo;  
        return precioExtra+precioBase;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precioBase=" + precioBase + ", color=" + comprobarColor() + ", consumoEnergetico=" + comprobarConsumoEnergetico() + ", peso=" + peso + ", precioDefault=" + PRECIO_DEFAULT + ", colorDefault=" + COLOR_DEFAULT + ", consumoDefault=" + CONSUMO_DEFAULT + ", pesoDefault=" + PESO_DEFAULT + '}';
    }
    
    public String comprobarColor(){
        String patron = "blanco|negro|azul|rojo|gris";
        String cadena = color;
        Pattern p = Pattern.compile(patron.toUpperCase());
        Matcher m = p.matcher(cadena.toUpperCase());
        if (m.matches()){
            m.reset();
            return color;
        }
        else{
            m.reset();
            return color = COLOR_DEFAULT;
        }
    }
    
    public char comprobarConsumoEnergetico(){
        String patron = "A|B|C|D|E|F";
        String cadena = String.valueOf(consumoEnergetico);
        Pattern p = Pattern.compile(patron.toUpperCase());
        Matcher m = p.matcher(cadena.toUpperCase());
        if (m.matches()){
            m.reset();
            return consumoEnergetico;
        }
        else{
            m.reset();
            return consumoEnergetico = CONSUMO_DEFAULT;
        }
    }
}
