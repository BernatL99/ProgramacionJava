public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("posa un nombre");
        int nombre1 = sc.nextInt();
        System.out.println("Posa un altra nombre");
        int nombre2 = sc.nextInt();
        /**Declaramos menor, que es para especificar cual de los 2 nombres 
         * introducidos es menor y hacemos un operador ternario para definir 
         * cual de los dos es menor
         */
        int menor = nombre1 < nombre2 ? nombre1 : nombre2;
        /**Declaramos mcd ya que 1 siempre sera el Minimo comun Divisor
         */
        int mcd = 1;
        /**Si menor es menor que 1 y mcd es diferente a 1 se sale del bucle
         * mcd hace como un break, cuando se cumpla la funcion, se le asignará
         * el valor de menor y ya no será igual a 1
         */
        for(; (menor>1) && (mcd == 1); menor--){
            /**Se hace un operador ternario que declara que mcd es igual al residuo de
             * nombre1%menor==0 Y nombre2%menor==0, si esta condicion se cumple
             * mcd recoje el balor de menor y sale del bucle, si no se cumple
             * mcd se mantiene a 1
             */
            mcd = (nombre1 % menor == 0) && (nombre2 % menor ==0) ? menor: mcd ;
        }
        /**Imprimimos mcd ya que tiene el valor true del ternario.
         */
        System.out.println("El Maxim Comu Divisor es "+mcd);
    } 
}