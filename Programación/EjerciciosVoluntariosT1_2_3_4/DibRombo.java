public class Javaapplication3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon la altura");
        int altura = sc.nextInt();
        for (int i = 1; i <= altura; i++){
			/* Para poder sumar la primera parte i valdra 1 y llegara hasta altura*/
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int i = altura; i >0; i--){
            /*Para poder crear el triangulo, definiremos que j tiene que hacer 
            los bucles que valga i*/
            for(int j = 1; j < i ; j++){                                        
                System.out.print("*");
            }
            System.out.print("\n");
        }     
    }
