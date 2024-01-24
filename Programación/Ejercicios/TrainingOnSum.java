class Solution{
    public static int repeats(int [] arr){
      
        int suma = 0;
        boolean repetidos = false;
        int solo = 0;

        for (int i = 0; i < arr.length; i++) {

            repetidos = false;
            for (int j = 0; j < i; j++) {

                if (arr[i] == arr[j]) {
                    repetidos = true;
                    break;

                }
            }

            if (!repetidos) {
                suma += arr[i];

            } else {
                solo += arr[i];

            }

        }
        int total = suma-solo;
       return total;

    }
}
