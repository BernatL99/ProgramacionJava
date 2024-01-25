import java.util.*;
\\ Primer intento del ejercicio https://www.codewars.com/kata/583203e6eb35d7980400002a/train/java
public class SmileFaces {
  
  public static int countSmileys(List<String> arr) {
      if(arr.isEmpty()){
        return 0;
      }
      int contador = 0;
      for(int i = 0;i < arr.size(); i++){
        if((arr.get(i).contains(":)")) || (arr.get(i).contains(":-)")) || (arr.get(i).contains(";)")) ||
           (arr.get(i).contains(";-)")) || (arr.get(i).contains(":~)")) || (arr.get(i).contains(";~)")) ||
           (arr.get(i).contains(":D")) || (arr.get(i).contains(":-D")) || (arr.get(i).contains(";D")) ||
           (arr.get(i).contains(";-D")) || (arr.get(i).contains(":~D")) || (arr.get(i).contains(";~D"))){
          contador++;
        }  
     }
      return contador;    
  }
}
