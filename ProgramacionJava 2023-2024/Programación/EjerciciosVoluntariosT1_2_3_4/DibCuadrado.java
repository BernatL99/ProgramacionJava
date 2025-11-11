public class DibCuadrado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon la altura");
        int altura = sc.nextInt();
        System.out.println("Pon la base");
        int base = sc.nextInt();
        for(int i = altura; i > 0; i--){
            for(int j = 0; j < base ; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }     
    }
}