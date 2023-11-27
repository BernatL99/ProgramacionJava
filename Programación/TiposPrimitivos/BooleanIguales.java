public class Javaapplication3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon un numero");
        int num = sc.nextInt();
        System.out.println("Pon un segundo numero");
        int num2 = sc.nextInt();
        boolean iguales = num == num2 ? true : false;
        System.out.println(num + " " + num2 + " " + iguales );
    }
}