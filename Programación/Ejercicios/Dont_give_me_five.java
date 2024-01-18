public class Kata
{
  public static int dontGiveMeFive(int start, int end)
  {
    int contador = 0;
    for(int i = start; i<=end; i++){
      contador++;
      if(i%10==5){
        i++;
      }
    }
    return contador;
  }
}
