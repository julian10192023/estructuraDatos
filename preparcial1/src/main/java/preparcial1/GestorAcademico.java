package preparcial1;

import java.util.HashMap;
import java.util.Map;

public class GestorAcademico {
    
    /*
     * HashMap es la estructura óptima para almacenar cursos porque:
     * 1. Acceso O(1): Búsqueda por código en tiempo constante promedio
     * 2. Clave-Valor: Mapea directamente codigo -> Curso
     * 3. Eficiencia: Operaciones get(), put(), remove() en O(1) promedio
     * 4. Uso natural: El código del curso es la clave de búsqueda natural
     */
    Map<String, Curso> cursos;
    
    public GestorAcademico() {
        this.cursos = new HashMap<>();
    }

    public void agregarCurso(Curso curso){
        
    }
}