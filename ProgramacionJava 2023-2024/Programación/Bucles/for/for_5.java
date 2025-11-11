import java.util.Scanner;
class For_5{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Quants alumnes te el grup");
		int alumnes=sc.nextInt();
		int suspesos=0, aprovats=0
		for(int i=0; i < alumnes; i++){
			System.out.println("Nota de l'alumne " + (i+1)+ ":");
			float nota = sc.nextFloat();
			sumaNota += nota;
			if(nota >=5){
				aprovats++;
			}else{
				suspesos++;
			}
		System.out.println("Aprovats: " + aprovats);
		System.out.println("Suspesos: " + suspesos);
		System.out.println("Mitjana: " + 