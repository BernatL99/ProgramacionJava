public class Javaapplication2 {
    public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.println("Posa un nombre");
        int n = sc.nextInt();
        /**Creamos el primer for para declarar que (I) tiene el valor de n
         * I se va a ir restando hasta que llegue a 1 y saldrá del bucle
         */
        for(int i = n; i>0 ; i--){
            /**Aplucamos un boolean dentro de for, el boolean es, porque un
             * numero es o no primo, True o False
             * Ponemos el boolean dentro de true, ya que siempre se tiene que 
             * reiniciar como true cada vez que se repita el bucle.
             */
            boolean primo = true;
            /**Creamos un for anidado al anterior for, asignamos la variable j
             * con el valor a 2, para que se cumpla la condicion del bucle, (j)
             * es menor que (i) y (j) siempre se va a sumar.
             */
            for(int j = 2; j < i ; j++){
                if(i % j ==0){
                    /**Si el residuo de i%j es 0, se aplicara que primo es false
                     * y se pasará al break, que pasara al else al ser false
                     * Si es true, pasara directamente a If(primo)
                     */
                    primo = false;
                    break;
                }
            }    
            if(primo){
                System.out.println(i+ " Es primo");
            }else{
                System.out.println(i+ " No es primo");
            }    
        }
    }           
}