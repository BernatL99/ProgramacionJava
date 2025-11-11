public class Javaapplication3 {
    /** @param h1 es hora1 
     * @param m1 es min1
     * @param h2 es hora2
     * @param m2 es min2
     * @return devuelve MinRest */
    static int MinRest(int h1, int m1, int h2, int m2){
        /**Creamos un if para asegurarnos que el resultado no pueda dar negativo
         */
       int MinRest = 0;
       if(h1 > h2){
           MinRest = ((h1*60)+ m1)-((h2*60)+m2);
       }else if(h1 < h2){
           MinRest = ((h2*60)+ m2)-((h1*60)+m1); 
       }else if(h1 == h2){
           if(m1 > m2){
               MinRest = m1 - m2;
           }else if(m1 < m2){
               MinRest = m2 - m1;
           }else{
               MinRest = m1 - m2;
           }
        }
       return MinRest;
    }

    public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.println("Posa la hora i els minuts");
        System.out.print("Hora: ");
        int hora1 = sc.nextInt();
        System.out.print("Minuts: ");
        int min1 = sc.nextInt();
        System.out.println("Posa una nova hora i minuts");
        System.out.print("Segona hora: ");
        int hora2 = sc.nextInt();
        System.out.print("Segons minuts: ");
        int min2 = sc.nextInt();
        
        int DifMin = MinRest(hora1, min1, hora2, min2);
        System.out.println("Se diferencia de minuts son: " + DifMin);
         
    }
}