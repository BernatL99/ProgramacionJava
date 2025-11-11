import java.util.Scanner;
class for_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Posa una nombre");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++ ){
            System.out.println(i);
        }
    }
}