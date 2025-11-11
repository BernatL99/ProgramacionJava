public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Posa el radi:");
        double radi = sc.nextDouble();
        System.out.println("Posa l'altura ");
        double altura = sc.nextDouble();
        System.out.println("Posa 1 per calcular area o posa 2 per calcular el volumen.");
        int opcio = sc.nextInt();
        RadioAltura(radi, altura , opcio);
    }
    static void RadioAltura(double radi , double altura, int opcio){
        switch(opcio){
        case 1:
            System.out.println();
        }
        
    }
}