public class Javaapplication3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Posa un nombre");
        int nombre1 = sc.nextInt();
        System.out.println("Posa un altra nombre");
        int nombre2 = sc.nextInt();
        System.out.println("Posa la cantidad de nombres que vols que apareguin");
        int NombMostra = sc.nextInt();
        if(nombre1 > nombre2){
            NumRandom(nombre1, nombre2, NombMostra);
        }else if(nombre1 < nombre2){
            NumRandom(nombre2, nombre1, NombMostra);
        }else{
            System.out.println("Els nombres no poden ser iguals");
        }
    }
    /**
     * @param M es igual al numero mayor
     * @param men es igual al numero menor
     * @param CantRang es igual NombMostra*/
    static void NumRandom(int M, int men, int CantRang){
        /*Calculamos el rango que hay entre em mayor y el menor*/
        int rang = M - men;
        for(int i = 0; i < CantRang; i++){
            /*Establecemos el rango del numero random, multiplicando Math.random
            por el rango mas el menor de los numeros, para que los numeros random
            sean entre el numero menor y mayor.
            */
            int NumRand = (int) ((Math.random()*rang))+ men;
            System.out.println(NumRand);
        } 
    }
}