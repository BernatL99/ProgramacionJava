public class Javaapplication3 {
    static double distanci(double x1, double y1, double x2, double y2){
        /**Creo una variable para guardar el valor de la distancia.
         */
       double distanci = ((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2));
       distanci = Math.sqrt(distanci);
       return distanci;
    }

    public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.println("Posa una distancia");
        double dis1 = sc.nextDouble();
        System.out.println("Posa la segona distancia");
        double dis2 = sc.nextDouble();
        System.out.println("Posa una nova distancia");
        double dis3 = sc.nextDouble();
        System.out.println("Posa la darrera distancia");
        double dis4 = sc.nextDouble();
        /**Declaramos que distancia es igual a la funcion de distanci e
         * imprimimos distancia.*/
        double distancia = distanci(dis1, dis2, dis3, dis4);
        System.out.println("Aquesta es la distancia: " + distancia);
    }
}