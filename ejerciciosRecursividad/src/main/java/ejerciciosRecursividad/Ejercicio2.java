package ejerciciosRecursividad;

public class Ejercicio2 {

    //FUNCION RECURSIVA QUE SUMA LOS ELEMENTOS DE FORMA RECURSIVA
    public static int sumar(int[] numeros, int indice){

        if (indice == numeros.length){
            return 0;
        }
        return numeros[indice] + sumar(numeros, indice + 1);
    }
    public static void main (String[] args){
        int[] lista1 = {5,7,9,3,2,4};
        int resultado = sumar(lista1, 0);

        System.out.println("la suma de los elementos de la lista es: " + resultado);
    }
}
