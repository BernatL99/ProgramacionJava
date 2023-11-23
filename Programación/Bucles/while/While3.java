import java.util.Scanner;
class Bucle_2 {

	public static void main(String[] args) {
		int numSecret = (int) (Math.random() * 100 + 1);
		System.out.println("Introdueix un nombre");
        int nombre1 = sc.nextInt();
        
		while(nombre1 != numSecret){
            if(nombre1 < numSecret){
            System.out.println("El nombre es mes gros");
            }else if(nombre1 > numSecret){
               System.out.println("El nombre es menor");
            }
			System.out.println("torna a posar un nombre");
            nombre1 = sc.nextInt();
        }
        System.out.println("El nombre es correcta");
    }
}