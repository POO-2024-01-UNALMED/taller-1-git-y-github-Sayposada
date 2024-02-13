package logica;

public class General{

    public static void main(String[] args) {

        Alumno alu1 = new Alumno ();
        /* creo un constructor vacio */

        Alumno alu2 = new Alumno (6, "Simon", "Posada");
        /* creo un constructor con datos */

        /* llenamos los datos que pediamos antes en el cosntructor */
        /* new es una palabra reservada para llamar al constructor */

        /* MOSTRAR DATOS GETTERS - SETTER 
        get: Obtener datos - verlos 
        set: color/ establecer datos o valores (
        */

        /*¨usamos el GEt para la info 

        otra opción:
        int id= alu2.getId();
        System.out.println("La id del alumno 2 es: " * id;
        */

        System.out.println("La id del alumno 2 es: " + alu2.getId());
        System.out.println("EL nombre de ese man es: " + alu2.getNombre() + alu2.getApellido() );
    }
}