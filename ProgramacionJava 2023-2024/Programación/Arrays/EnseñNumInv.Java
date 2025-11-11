public class Javaapplication2 {

    public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos numeros quieres introducir?");
        int n = sc.nextInt();
        int array3[] = new int[n];
        for(int i = 0; i < array3.length ; i++){
            System.out.println("Introdueix un nombre");
            array3[i] = sc.nextInt();
        }
        for(int i = n-1; i >= 0; i--){
            System.out.println("Aquets son els nombres " + array3[i]);
        }
    }
}