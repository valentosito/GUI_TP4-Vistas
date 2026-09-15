
package logica;

import java.util.HashSet;
import java.util.Objects;

public class Alumno {
    
    protected int legajo;
    protected String apellido;
    protected String nombre;
    protected HashSet <Materia> materias; // aca vamos a guardar las materias
    
    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.materias= new HashSet<>();
       
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public void agregarMateria( Materia m){  // agrego las materias al hashset a traves de este método
        materias.add(m);
    }
    
    public int cantidadMaterias(){
        return materias.size(); // me devuelve la cantidad de materias con size. 
    }
    
    @Override 
    public String toString() {
     
        return ("Numero de legajo: " + legajo + " Apellido: "
                + apellido+ "Nombre: " + nombre + "Materia: " + materias );
    }

   
    
    
    
}
