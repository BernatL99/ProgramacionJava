public class Javaapplication3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon un numero");
        int num = sc.nextInt();
        enteros(num);
    }
    
    static void enteros(int n){
        if(n % 2 == 0){
            System.out.println("El numero " + n + " no es impar");
        }else{
            System.out.println("El numro " + n + "  es impar");
        }
    }
}