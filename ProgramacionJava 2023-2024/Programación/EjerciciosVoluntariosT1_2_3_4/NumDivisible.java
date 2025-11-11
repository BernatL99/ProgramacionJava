public class Javaapplication3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon el numero que quieras dividir");
        int NumDiv = sc.nextInt();
        for(int i = 0 ; i < 3; i++){                                            /*Creamos un bucle que se cumpla 3 veces*/
            System.out.println("Pon un numero que le sea divisible");         	/*Cada vez que se repita el bucle pediremso el numero*/
            int num = sc.nextInt();
            if (NumDiv < num){                                                  /*Comprobamos que el numero que vamos a dividir sea menor*/
                System.out.println("El numero introducido debe de ser mayor a "
                        + NumDiv); 
            }else{
                if(NumDiv % num == 0){                                          
                    System.out.println("El numero es divisible");
                }else{
                    System.out.println("El numero no es divisible");
                }
            }
        }
    }
}
