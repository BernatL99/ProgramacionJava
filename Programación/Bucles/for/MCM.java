public class Javaapplication2 {
    public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.println("Posa un nombre");
        int nombre1 = sc.nextInt();
        System.out.println("Posa el segon nombre");
        int nombre2 = sc.nextInt();
        /** Se usa un operador ternario para seleccionar el numero más alto
         */
        int mayor = nombre1 > nombre2 ? nombre1 : nombre2;
        /**Creamos la variable mcm con valor 0 para poder sacar el resultado del
         * fuera del for
         */
        int mcm =0;
        /**Dentro del For, asignamos la variable (i) que es igual a (mayor)
         * NO ponemos condición para que siga el bucle, ya que pueden ser infinitos
         * (i) al tener el valor del (mayor), para hacer que solo salgan los 
         * multiplos de su valor asignado sumamos (i) por (mayor)
         */
        for(int i = mayor; ; i+=mayor){
            /**El bucle se hará hasta que se nos cumpla la condición que el residuo de (i)
             * entre nombre1 e (i) entre nombre2 sea 0
             */
            if((i%nombre1==0)&&(i%nombre2==0)){
                /**Asignamos el balor (i) a (mcm)
                 */
                mcm = i;
                break;
            }
        }
        System.out.println("El mcm es: " + mcm);
    }           
}