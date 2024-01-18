public class Kata{
  public static int dontGiveMeFive(int start, int end){
    //ans es el contador
    int ans = 0;
    for (int i = start; i <= end; i++) {
      if (!("" + i).contains("5")) ans++;
    }
    return ans;
  }
}
