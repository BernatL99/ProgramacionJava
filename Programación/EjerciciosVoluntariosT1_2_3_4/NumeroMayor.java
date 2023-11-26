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
		int nombremayor = num1 > num2 ? num1 : num2;
		nombremayor = nombremayor > num3 ? nombremayor : num3;
		nombremayor = nombremayor > num4 ? nombremayor : num4;
		nombremayor = nombremayor > num5 ? nombremayor : num5;
		System.out.println("El numero mayor es: " + nombremayor);