public class Javaapplication3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce la cantidad de entradas infantiles quieres");
        int entInf = sc.nextInt();
        System.out.println("Inttroducela cantidad de entradas para adultos");
        int entAdult = sc.nextInt();
        float desc = 10;
        entInf = entInf * 12;
        entAdult = entAdult * 18;
        int ImpTotal = entInf + entAdult;
        System.out.println("Importe total: " + ImpTotal);
        float descApl = ImpTotal < 60 ? ImpTotal : (desc/100) * ImpTotal;
        System.out.println("El precio final es de: " + (ImpTotal - descApl));
    }
}