public class Javaapplication2 {
    public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.println("Posa un nombre");
        int nombre = sc.nextInt();
        
        for(int i = 2 ; nombre > 0; nombre = nombre / i){
            /**Se pone la division en la parte del decrecimiento para que vaya 
             * bajando por las divisiones entre 2
             */
            System.out.println(nombre % i);
            
            
        }
    }           
}