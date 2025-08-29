package ejerciciosRecursividad;

public class Ejercicio1 {

    //FUNCION RECURSIVA QUE ELIMINA UN CARACTER DE UNA CADENA
    static String eliminarCaracter(String cadena, char caracter){
        if (cadena.isEmpty()){
            return "";
        }

        char caracter1 = cadena.charAt(0);

        if (caracter1 == caracter){
            return eliminarCaracter(cadena.substring(1), caracter);
        } else {
            return caracter1 + eliminarCaracter(cadena.substring(1), caracter);
        }
    }

    public static void main(String[] args) {
        String texto = "recursividad";
        char caracter = 'r';

        String resultado = eliminarCaracter(texto, caracter);
        System.out.println("cadena original: " + texto);
        System.out.println("caracter eliminado '" + caracter + "': " + resultado);
    }
}
