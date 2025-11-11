import java.util.Scanner;
class For_4{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Posa un nombre");
            int nombre = sc.nextInt();
            int factorial = 0;
			factorial = nombre;
        for(int i = nombre;i>1;i--){
            factorial*=(i-1);
        }
        System.out.println("Su factorial es " + factorial);
    }
}