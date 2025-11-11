public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Posa un nombre: ");
        int n = sc.nextInt();
        eco(n);
    }
    static void eco(int n){
        for(int i = 0; i < n ; i++){
        System.out.println("Hola a todos");
        }
    }   
}