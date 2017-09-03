/* Ejercicio: Ejemplo del carrito
 @author: Rodríguez de la Mora Elizabeth Dayanne
 @version:  1.0 */
package carrito;
public class Carrito { 
    //Main
    public static void main(String[] args) {
        
        //Crea un objeto que hara ejecutar los metodos
        Vehiculo Ejecutar = new Vehiculo();
        String regresa = "";
        //Llama los metodos
        Ejecutar.menu();
        regresa = Ejecutar.datos();
        //Despliega
        Ejecutar.desplegar(regresa);
        
    }
       
    }

