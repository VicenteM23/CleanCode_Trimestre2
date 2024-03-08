/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package es.dam.vicente.proyectoelectrodomesticos_vicente;

/**
 *
 * @author vicen
 */
public class ProyectoElectrodomesticos_Vicente {

    public static void main(String[] args) {
        
        try {
            Electrodomestico arrayElectrodomesticos[] = new Electrodomestico[10];
            arrayElectrodomesticos[0] = new Electrodomestico(100, "Rojo", 'F', 60);
            arrayElectrodomesticos[1] = new Lavadora(100, "Blanco", 'F', 60, 50);
            arrayElectrodomesticos[2] = new Television(200, "Negro", 'A', 30, 40, true);
            arrayElectrodomesticos[3] = new Electrodomestico(500, "Blanco", 'B', 50);

            int totalPrecioElectrodomesticos = 0;
            int totalPrecioLavadoras = 0;
            int totalPrecioTelevisiones = 0;

            for (Electrodomestico electrodomestico : arrayElectrodomesticos) {
                if (electrodomestico != null) {
                    int precioFinal = electrodomestico.precioFinal();
                    System.out.println(electrodomestico.getClass().getSimpleName() + ": " + precioFinal + "€");

                    totalPrecioElectrodomesticos += precioFinal;

                    if (electrodomestico instanceof Lavadora) {
                        totalPrecioLavadoras += precioFinal;
                    } else if (electrodomestico instanceof Television) {
                        totalPrecioTelevisiones += precioFinal;
                    }
                }
            }

            System.out.println("\nPrecio total de los electrodomesticos: " + totalPrecioElectrodomesticos);
            System.out.println("Precio total de las lavadoras: " + totalPrecioLavadoras);
            System.out.println("Precio total de las televisiones: " + totalPrecioTelevisiones);
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    }
}
