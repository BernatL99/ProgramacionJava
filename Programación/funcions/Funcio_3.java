public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Poa un nombre:");
        int nombre1 = sc.nextInt();
        System.out.println("Posa un altre nombre:");
        int nombre2 = sc.nextInt();
        int intMayor = nombremayor(nombre1, nombre2);
        System.out.println(intMayor);
  
    }
    static int nombremayor (int nombre1, int nombre2 ){
        return nombre1 < nombre2 ? nombre2 : nombre1;
    }
}