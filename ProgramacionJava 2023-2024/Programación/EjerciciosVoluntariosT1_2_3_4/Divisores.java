public class Javaapplication3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon un numero");
        int num = sc.nextInt();
        System.out.println("Los divisores de " + num + " son:");
        for(int i = 1; i <= num; i++){
            if (num % i == 0)
                System.out.print(" " + i + " ");
        }
    }
}