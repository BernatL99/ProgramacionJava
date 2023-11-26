public class Javaapplication3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon un numero");
        int num1 = sc.nextInt();
        System.out.println("Pon otro numero");
        int num2 = sc.nextInt();
        System.out.println("Pon otro numero");
        int num3 = sc.nextInt();
        System.out.println("Pon otro numero");
        int num4 = sc.nextInt();
        System.out.println("Pon otro numero");
        int num5 = sc.nextInt();
        /* Examinamos el orden de los numeros con los siguientes if*/
        if((num1 < num2) && (num2 < num3) && (num3 < num4) && (num4 < num5)){
            System.out.println("Los numeros estan en orden");
        }else if((num5 < num4) && (num4 < num3) && (num3 < num2) && (num2 < num1)){
            System.out.println("Los numeros estan invertidos");
        }else{
            System.out.println("Los numeros estan desordenados");
        }
    }
}