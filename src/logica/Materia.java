
package logica;

/**
 *
 * @author usuario
 */
public class Materia {
    protected int idMateria;
    protected String nombre;
    protected int anio;

    public Materia(int materia, String nombre, int anio) {
        this.idMateria = materia;
        this.nombre = nombre;
        this.anio = anio;
    }

    public int getMateria() {
        return idMateria;
    }

    public void setMateria(int materia) {
        this.idMateria = materia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        
        return ("ID Materia: "+ idMateria+ " Materia: " + nombre + " Año: " + anio);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.idMateria;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Materia other = (Materia) obj;
        return this.idMateria == other.idMateria;
    }
    
    
    
    
    
}
