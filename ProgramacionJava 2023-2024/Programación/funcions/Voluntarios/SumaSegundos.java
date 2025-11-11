public class Javaapplication3 {
    /**
     * @param d es igual a dias
     * @param h es igual a horas
     * @param m es igual a minutos
     * @return  devuelve los segundos totales
     */
    static long segons(long d, long h, long m){
        long ds = (((d *24)*60)*60);
        long hs = ((h*60)*60);
        long ms = (m*60);
        long SegFin = (ms + hs + ds);
        return SegFin;
    }

    public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.println("Posa els dies");
        long dies = sc.nextInt();
        System.out.println("Posa les hores");
        long hores = sc.nextInt();
        System.out.println("Posa els minuts");
        long min = sc.nextInt();
        /**Creamos un if para verificar que las horas y los minutos sean correctos
         * En el else llamamos a la función segons.
         */
        if(min > 59 || min < 0){
            System.out.println("Els minuts han de ser entre 0 y 50 ");
        }else if(hores > 23 || hores < 0){
            System.out.println("Les hores han de ser entre 0 y 23");
        }else{
            long segRet = segons(dies, hores, min);
            System.out.println("Els segons total de tot son: " + segRet);
        }  
    }
}