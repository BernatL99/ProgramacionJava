public class Capicua {

    public static void main(String[] args) {
        int sfechaTotal, sfechaTotal2;
        Scanner sc = new Scanner(System.in);
        boolean capicua = false;
        System.out.println("Pon un numero no mayor a 9999");
        int num = sc.nextInt();
        /*Para poder fragmentar el capicua, tenemso que guardar el residuo y luego
        dividir num por 10
        */
        int unidades = num %10;
        num /= 10;
        int decenas = num % 10;
        num /= 10;
        int centenas = num % 10;
        num /= 10;
        int unidadesMiler = num;
        
        if((unidades == unidadesMiler) && (decenas == centenas)){
            capicua = true;
        }else if((unidadesMiler == 0) && (unidades == centenas)){
            capicua = true;
        }else if((unidadesMiler == 0) && (centenas == 0) && (unidades == decenas)){
            capicua = true;
        }else if((unidadesMiler == 0) && (centenas == 0) && (decenas == 0)){
            capicua = true;
        }
        
        if(capicua){
            System.out.println("El numero: " + num + " es capicua");
        }else{
            System.out.println("El numero: " + num + " no es capicua");
        }
    }
}