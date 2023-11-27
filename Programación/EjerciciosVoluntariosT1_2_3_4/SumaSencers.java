public class Javaapplication3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Solicitamos que ponga dos numeros, el primero menor que el segundo*/
        System.out.println("Pon un numero");
        int num = sc.nextInt();
        /*El segundo numero tiene que ser 2 numeros por encima.*/
        System.out.println("Pon otro numero 2 numeros mayor");
        int num2 = sc.nextInt();
        /*Creamos la variable suma donde se guardarán los resultados*/
        int suma = 0;
        /*Comprobamos si se ha cumplido la condición solicitada*/
        if(num2 == num+2){
            /*Creamos un while y definimos que saldra del bucle cuando el primer
            numero alcance al segundo, el primer numero se ira sumando en cada
            bucle.*/
            while(num <= num2){
                suma = suma + num;
                num++;
            }       
            System.out.println(suma);
        }else{
            System.out.println("No cumples la condicion.");
        }
    }
}