public class Javaapplication3 {

    public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos numeros quieres introducir?");
        int n = sc.nextInt();
        int array3[] = new int[n];
        
        for(int i = 0; i < array3.length ; i++){
            System.out.println("Introdueix un nombre");
            array3[i] = sc.nextInt();
        }
        int mayor = 0;
        for(int i = 0; i < n; i++){
			/**Creamos if para declarar que mayor con valor 0 solo tiene que 
             * guardar el numero mayor del array
             */
            if(array3[i] > mayor){
            mayor = array3[i];
            }
        }
        System.out.println("El nombre mayor es: " + mayor);
    }
}