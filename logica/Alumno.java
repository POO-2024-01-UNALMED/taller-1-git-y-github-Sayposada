/* los metodos son los que realmente realizan las acciones */

package logica;

public class Alumno {

    int id;
    String nombre;
    String apellido;
    /* Estas variables som globales */

/* creo el constructor con el mismo nombre de la clase */
/* no tiene retorno de valor - por eso no se pone nada*/

    public Alumno () {

    }
/* creamos un constructor lleno */
/* dentro de los paréntesis ponemos los valores a ingresar 
los famosos parámetros (parámetros)

con el "this" le asignamos al nombre de la clase el valor del 
parámetro
*/

    public Alumno (int id, String nombre, String apellido) {
        this.id= id;
        this.nombre = nombre;
        this.apellido= apellido;
        /* estas variables son locales */
    } 

/* void no retorna nada, esa es su función */
    public void mostrarNombre() {
        System.out.println("Hola, soy el alumno");
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String setNombre (String nombre) {
        this.nombre = nombre; 
    }

    public String getApellido() {
        return apellido;
    }

    public String setApellido (String nombre) {
        this.apellido = apellido; 
    }

}