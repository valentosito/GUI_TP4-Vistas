
package logica;


public class Colegio {

    public static void main(String[] args) {
        
       Materia materia1  = new Materia ( 1, "Web 2", 2);
       Materia materia2 = new Materia (2, " Matemáticas", 1 );
       Materia materia3 = new Materia ( 3, " Laboratorio 1", 1);
       
       Alumno alum1 = new Alumno (1001, "Lopez", "Martín");
       Alumno alum2 = new Alumno (1002, " Martínez", "Brenda"); 
       
       
       alum1.agregarMateria(materia1);
       alum1.agregarMateria(materia2);
       alum1.agregarMateria(materia3);
       
       alum2.agregarMateria(materia1);
       alum2.agregarMateria(materia2);
       alum2.agregarMateria(materia3);
       alum2.agregarMateria(materia3);
       
       
        System.out.println(" Cantidad de materias en las que se inscribio Lopez: "+ 
                alum1.cantidadMaterias());
        System.out.println(" Cantidad de materias a las que se inscribio Martinez: " 
                + alum2.cantidadMaterias());
        
        
        
    }
    
}
