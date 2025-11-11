import java.util.Scanner;
class Bucle_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Posa un nombre");
        int nombre = sc.nextInt();
        while (nombre != 0) {
            System.out.println(nombre % 2 == 0 ? "es parell" : "no es parell");
            System.out.println((nombre > 0) ? "es positiu" : "no es positiu");
            System.out.println(Math.pow(nombre, 2));
            System.out.println("Posa un nombre");
            nombre = sc.nextInt();
        }
    }

}