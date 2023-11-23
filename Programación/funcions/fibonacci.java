public class Fibonacci {
    public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.println("Posa un nombre");
        long n = sc.nextLong();
        long resultat = fibonacci(n);
        System.out.println(resultat);
    }
    
    static long fibonacci(long i){
        long resultat;
        /**Caso base es que i ni es 1 o 0 el resultado es 1 o 0.
         * Si no se cumple la funcion anterior, pasará hacer la Recursividad.
         */
        if(i == 1){
            resultat = 1;
        }else if(i == 0){
            resultat = 0;
        }else{
            /**Empieza el resultado factorial y hacemos que a funcion se llame a 
             * si misma 2 veces: fbonacci(1-1) + fibonacci(i-2).
             */
            resultat = fibonacci(i -1) + fibonacci(i-2);
        }
        return resultat;
        
    }
            
}