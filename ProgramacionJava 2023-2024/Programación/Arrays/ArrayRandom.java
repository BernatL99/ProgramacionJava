public class Javaapplication2 {

    public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
        int array1[];
        int solucio = 0;
        array1 = new int[10];
        int suma = 0;
        /**Creamos un for para rellenar el array, (i) vale 0 e (i) tiene que ser
         * menor que el indice de array */
        for(int i = 0; i < array1.length; i++){
            solucio = (int) ((Math.random() * 100) + 1);
            array1[i]= solucio;
            /**Para sumar los numros random, usamos el valor suma que es 0 y lo 
             * sumamos y lo añadimos en array1[i]*/
            suma += array1[i];
        }
        System.out.println("La suma es: " + suma);
    }
}