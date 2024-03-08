/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ElectrodomesticosTest;

import es.dam.vicente.proyectoelectrodomesticos_vicente.Electrodomestico;
import es.dam.vicente.proyectoelectrodomesticos_vicente.Lavadora;
import es.dam.vicente.proyectoelectrodomesticos_vicente.Television;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alumn
 */
public class ElectrodomesticosTest {

    @BeforeAll
    public static void setUpClass() {
        System.out.println("Configuración de los tests");
    }
    
    @AfterAll
    public static void tearDownClass() {
        System.out.println("Inicialización del test");
    }
    
    @Test
    public void testComprobarColor(){
        System.out.println("Ejecución del test comprobar color");
        Electrodomestico nevera = new Electrodomestico(100, "verde", 'F', 60); /*Color no admitido por el patrón*/
        nevera.comprobarColor();
        Electrodomestico neveraEsperado = new Electrodomestico(100, "blanco", 'F', 60);
        
        Electrodomestico neveraBlanca = new Electrodomestico(100, "blanco", 'F', 60);
        Electrodomestico neveraAzul = new Electrodomestico(100, "azul", 'F', 60);
        Electrodomestico neveraNegra = new Electrodomestico(100, "negro", 'F', 60);
        Electrodomestico neveraRojo = new Electrodomestico(100, "rojo", 'F', 60);
        Electrodomestico neveraGris = new Electrodomestico(100, "gris", 'F', 60);
        assertAll("Verificar el color de los electrodomesticos",
            () -> assertEquals(neveraEsperado.getColor(),nevera.getColor()), //Verificar funcionamiento del metodo comrobarColor()
            () -> assertEquals("blanco",neveraBlanca.getColor()),
            () -> assertEquals("azul",neveraAzul.getColor()),
            () -> assertEquals("negro",neveraNegra.getColor()),
            () -> assertEquals("rojo",neveraRojo.getColor()),
            () -> assertEquals("gris",neveraGris.getColor())
        );
    }
    
    @Test
    public void testComprobarConsumo(){
        System.out.println("Ejecución del test comprobar consumo");
        Lavadora lavadora = new Lavadora(700,"Gris",'J',70,100); /*Consumo no admitido por el patron*/
        lavadora.comprobarConsumoEnergetico();
        Lavadora lavadoraEsperada = new Lavadora(700,"Gris",'F',70,100);
        assertEquals(lavadoraEsperada.getConsumoEnergetico(), lavadora.getConsumoEnergetico());
    }
    
    @Test
    public void testPrecioTotal(){
        System.out.println("Ejecución del test precio total");
        
            Electrodomestico electrodomestico = new Electrodomestico(100, "Rojo", 'F', 60);
            Lavadora lavadora = new Lavadora(100, "Blanco", 'F', 60, 50);
            Television tv = new Television(200, "Negro", 'A', 30, 40, true);
            assertAll("Verificar precio total de los objetos",
                () -> assertEquals(190, electrodomestico.precioFinal()),
                () -> assertEquals(240, lavadora.precioFinal()),
                () -> assertEquals(400, tv.precioFinal())
            );
    }
    
    @BeforeEach
    public void setUp() {
        System.out.println("Finalización del test");
    }
    
    @AfterEach
    public void tearDown() {
        System.out.println("Limpieza de los tests");
    }
    
}
