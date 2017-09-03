/* Ejercicio: Ejemplo del carrito
 @author: Rodríguez de la Mora Elizabeth Dayanne
 @version:  1.0 */
package carrito;

import java.util.Scanner;

public class Vehiculo {
    // Creamos las variables 
    private String modelo;
    private String Mazda;
    private String Jeep;
    private String Avanza;
    private String Nombre;
    private String Gasolina;
    private int tipo;
    String velocidad;
    String total;
    boolean seguir = true;

    //Se le pregunta al usuario el tipo de carro a elegir
    public void menu() {
        Scanner Leer = new Scanner(System.in);
        System.out.println(
                "Bienvenido");
        System.out.println(
                "INGRESA TU NOMBRE");
        Nombre = Leer.next();

        System.out.println(
                "1.- Mazda");
        System.out.println(
                "2.- Jeep");
        System.out.println(
                "3.- Avanza");
        System.out.println(
                "4.- Salir");
        System.out.println(
                "¿Que carro deseas?");
        tipo = Leer.nextInt();

    }
    //Asigna el tipo de gasolina y agrega informacion sobre el vehiculo
    public String datos() {
        Scanner Leer = new Scanner(System.in);
        if (tipo > 0 && tipo < 5) {
            switch (tipo) {
                case 1:
                    System.out.println("Gasolina");
                    modelo = "Mazda";
                    Mazda = Leer.next();
                    velocidad = "500km/h";
                    total = modelo + " que utiliza " + Mazda + " Con velocidad de " + velocidad;
                    break;
                case 2:
                    System.out.println("Gasolina");
                    modelo = "Jeep";
                    Jeep = Leer.next();
                    velocidad = "200km/h";
                    total =  modelo + " que utiliza " + Jeep + " Con velocidad de " + velocidad;
                    break;
                case 3:
                    System.out.println("Gasolina");
                    modelo = "Avanza";
                    Avanza = Leer.next();
                    velocidad = "300km/h";
                    total =  modelo + " que utiliza " + Avanza + " Con velocidad de " + velocidad;
                    break;
                case 4:
                    seguir = false;
                    break;
                default:
                    break;
            }

        } else {
            System.out.println("Esa no es una opción valida");
            seguir = false;
        }
        return velocidad;
    }
    
    //Despliega los datos e informacion hecha a lo largo del programa.
    public void desplegar(String regresa) {
        if (seguir) {
            System.out.println(Nombre + ", El carro que elegiste es un " + total );
        } else {
            System.out.println("¡Adios!");
        }
        while (seguir) {
            String reg = "";
            menu();
            regresa = datos();
            desplegar(reg);
        }
    }
}
