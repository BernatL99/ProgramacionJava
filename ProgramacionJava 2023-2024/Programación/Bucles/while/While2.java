import java.util.Scanner;
class Bucle_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Posa una edat");
        int edat = sc.nextInt();
		int nombreAlumnes = 0;
		int sumaEdats = 0;
		int MajorEdat = 0;
        while(edat >= 0){
            nombreAlumnes++;
            sumaEdats = sumaEdats+edat;
            if(edat >= 18){
                MajorEdat++;
            }
            System.out.println("Posa una edat");
            edat = sc.nextInt();
        }
        System.out.println("La mitjana es: " + (sumaEdats/nombreAlumnes) + "Cantidad de alumnes: " + nombreAlumnes + "la cantidad de majors de edat son " + MajorEdat + "cantidad de edats introduides " + sumaEdats );
        
    }
}
