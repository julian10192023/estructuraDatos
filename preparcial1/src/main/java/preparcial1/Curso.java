package preparcial1;

import java.util.HashSet;
import java.util.Set;

public class Curso {
    String codigo;
    String nombre;
    
    /*
     * HashSet es la implementación óptima para estudiantesInscritos porque:
     * 1. Unicidad: Garantiza automáticamente que no haya duplicados
     * 2. Eficiencia: Operaciones add() y remove() en O(1) promedio
     * 3. Orden irrelevante: No mantiene orden, cumpliendo el requisito
     * 4. Aprovecha el contrato equals()/hashCode() de Estudiante basado en id
     */
    Set<Estudiante> estudiantesInscritos;

    public Curso(String codigo, String nombre){
        this.codigo = codigo;
        this.nombre = nombre;
        this.estudiantesInscritos = new HashSet<>();
    }
    
    public void inscribirEstudiante(Estudiante estudiante) {
        estudiantesInscritos.add(estudiante);
    }

    public void darDeBajaEstudiante(Estudiante estudiante){
        estudiantesInscritos.remove(estudiante);
    }

    public Set<Estudiante> getEstudiantesInscritos() {
        return estudiantesInscritos;
    }
}
