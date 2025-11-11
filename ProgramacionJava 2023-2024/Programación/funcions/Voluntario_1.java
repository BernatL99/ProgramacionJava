public class Javaapplication2 {
        /**
         * 
         * @param ra es radi
         * @param s es superficie
         * @param v es volumen
         * Uso una funcion void ya que no es necesario volver a la funcion princioal
         */
        static void SupVol(double ra, double s, double v){
            s = (4*3.14) * Math.pow(ra, 2);
            v = (4*3.14/3) * Math.pow(ra, 3);
            System.out.println("La superficie de una esfera con el radio:" + ra
            + " es: " + s);
            System.out.println("El volumen de una esfera con el radio:" + ra
            + " es: " + v);
    }
    public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.println("Posa el radi");
        /**Usamos un double para asegurarnos no perder datos, ya que con un float
         * el programa me daba error.*/
        double radi = sc.nextFloat();
        double superficie = 0;
        double volum = 0;
        SupVol(radi, superficie, volum);
        
    }
}