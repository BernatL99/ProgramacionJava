public class Javaapplication2 {

    public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
        int array2[] = new int[5];
        for(int i = 0; i < array2.length; i++){
            System.out.println("Introdueix un nombre");
            array2[i] = sc.nextInt();
        }
        for(int i = 0 ; i < array2.length; i++){
            System.out.println(array2[i]);
        }         
    }
}