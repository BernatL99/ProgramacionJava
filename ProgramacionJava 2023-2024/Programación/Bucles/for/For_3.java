import java.util.Scanner;
class For_3{
	
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float sumaNombres = 0;
        for(int bucle = 1;bucle<=10;bucle++){
            System.out.println("Posa un nombre sencer");
            int nombre = sc.nextInt();
            sumaNombres = sumaNombres + nombre;
        }
        System.out.println("La media es " + sumaNombres/10);
    }
}