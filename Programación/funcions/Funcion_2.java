public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Posa un nombre sencer:");
        int n1 = sc.nextInt();
        System.out.println("Posa un altre nombre sencer: ");
        int n2 = sc.nextInt();
        if(n1 > n2){
            sencers(n1, n2);
            
        }else if(n1 < n2){
            sencers(n2, n1);
        }else{
            System.out.println("Els nombres son iguals");
        }
        
    }
    static void sencers(int mayor , int menor ){
       for(int i = mayor -1 ; i > menor ; i--){
        System.out.println( i);
        }
    }   
}
