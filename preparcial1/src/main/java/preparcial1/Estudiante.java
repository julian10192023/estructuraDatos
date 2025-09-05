package preparcial1;

import java.util.Objects;

public class Estudiante {
    String id;
    String nombre;
    
    public Estudiante(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Estudiante that = (Estudiante) obj;
        return Objects.equals(id, that.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
