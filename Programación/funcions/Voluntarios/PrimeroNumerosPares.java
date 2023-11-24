public class Javaapplication3 {
    static void nombresParells(int n){
        /** Declaramos que i vale n, n vale la cifra puesta por el usuario en la
         * funcion principal. Queremos que ponga solo los diez primeros pares,
         * Decimos que i es igual a n mas 10.*/
        for(int i = n; i <= n + 10; i++){
            /**Usamos el if para solo enseñar los numeros pares haciendo sabiendo
             * que el residuo es 0 al dividir entre 2.*/
           if(i % 2 == 0){
               System.out.println(i);
           }
        } 
    }
    public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.println("A partir de quin nombre vols comensar?");
        int nombre = sc.nextInt();
        nombresParells(nombre);
        
    }
}