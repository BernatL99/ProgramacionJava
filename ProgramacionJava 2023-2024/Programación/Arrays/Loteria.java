public class Javaapplication3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] apuesta = {20, 33, 65, 73, 55, 77};
        int [] ganadores = {33, 15, 73, 45, 34, 65};
        int ganado = primitiva( apuesta, ganadores); 
        System.out.println(ganado);
    }
    
    static int primitiva(int[] taula1, int[] guanyadors){
        int coincidencia = 0;
        for(int i= 0; (i < taula1.length) ; i++){
            for(int j = 0; j < guanyadors.length; j++){
                if(taula1[i] - guanyadors[j] == 0){
                    coincidencia++;
                    break;
                }
            }
        }
        return coincidencia;
    }
}