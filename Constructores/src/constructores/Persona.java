/* Ejercicio: Constructores
 @author: Rodríguez de la Mora Elizabeth Dayanne
 @version:  1.0 */
package constructores;
/*
La siguiente clase muestra los tres tipos de constructores
*/

class Persona {

    ////No se declara el constructor
    private String nombre;
    private String apellido;
    //Constructor vacio

    public Persona(String nombre) {
        //Constructor sobrecargado 
        //Constructor con parametro
        //Parametro nombre hace referencia al nombre de la persona

        this.nombre = nombre;
    }

    public Persona(Persona persona) {
        //Constructor sobrecargado
        //Este constructor hace copias
        //Agrgea nueva informacion a la persona anterior por la nueva instancia
        this.nombre = persona.nombre;
        this.apellido = persona.apellido;
    }

    Persona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
