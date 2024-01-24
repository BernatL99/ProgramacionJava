class Solution{
    public static int repeats(int [] arr){
      int suma = 0;
      int unico = 0;
      for(int i = 0; i < arr.length  ; i++){
        boolean esUnico = false;
        for(int j = 0 ; j > arr.length ; j++){
          if((i != j) && (arr[j] == arr[i])){
            suma = 0;
            break;
          }else if(i != j && (arr[j] != arr[i])){
            unico = unico + arr[i];
          }
        }
          
      }
      suma = unico + suma;
      return suma;
    }
}
