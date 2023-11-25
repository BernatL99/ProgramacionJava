public class Javaapplication3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * Cambiamos el main para que solo recoja la funcion con un solo
         * parametro
         */
        System.out.println("Escribe 1 para solo un parametro o 2 para tres parametros");
        int Parametro = sc.nextInt();
        int NombMostra;
        switch (Parametro) {
            case 1 -> {
                System.out.println("Posa la cantidad de nombres que vols que apareguin");
                NombMostra = sc.nextInt();
                NumRandom(NombMostra);
            }
            case 2 -> {
                System.out.println("Posa un nombre");
                int nombre1 = sc.nextInt();
                System.out.println("Posa un altra nombre");
                int nombre2 = sc.nextInt();
                System.out.println("Posa la cantidad de nombres que vols que apareguin");
                NombMostra = sc.nextInt();
                if (nombre1 > nombre2) {
                    NumRandom(nombre1, nombre2, NombMostra);
                } else if (nombre1 < nombre2) {
                    NumRandom(nombre2, nombre1, NombMostra);
                } else {
                    System.out.println("Els nombres no poden ser iguals");
                }
            }
            default -> System.out.println("Opcion incorrecta");
        }
    }

    static void NumRandom(int M, int men, int CantRang) {
        int rang = M - men;
        for (int i = 0; i < CantRang; i++) {
            int NumRand = (int) ((Math.random() * rang)) + men;
            System.out.println(NumRand);
        }
    }

    static void NumRandom(int CantRang) {
        for (int i = 0; i < CantRang; i++) {
            double numRand = Math.random();
            System.out.println(numRand);
        }
    }
}