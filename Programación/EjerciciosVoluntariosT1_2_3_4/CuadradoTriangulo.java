public class CuadradoTriangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Para calcular el area de un triangulo aprieta 1. "
                + "Para calcular el area de un cuadrado aprieta 2");
        int Indice = sc.nextInt();
        int base;
        int altura;
        int div = 2;
        switch (Indice){                                                        /*Creamos un switch para poder elegir la opción*/
            case 1 ->{
                System.out.println("Pon la base");
                base = sc.nextInt();
                System.out.println("Pon la altura");
                altura = sc.nextInt();
                float Atriangulo = triangulo(base, altura, div);
                System.out.println("El area del triangulo es: " + Atriangulo);
            }
            case 2 ->{
                System.out.println("Pon la base");
                base = sc.nextInt();
                System.out.println("Pon la altura");
                altura = sc.nextInt();
                if ( base == altura){
                    int Acuadrado = cuadrado(base, altura);
                    System.out.println("El area del cuadrado es: " + Acuadrado); 
                }else{
                    System.out.println("Lo que has introducido no es un "       /* Validamos que los valores introducidos sean de un cuadrado*/
                            + "cuadrado");
                } 
            }
            default ->{                                                         /*Creamos un default por si no introducen los valores pedidos*/
                System.out.println("Ocion incorrecta");
            }
        }
    }
    
    static float triangulo(int b, int a, int divi){
        float resultado = (b * a) / divi;
        return resultado;
    }
    
    static int cuadrado(int b, int a){                                          
        int resultado = b*a;
        return resultado;
    }
}