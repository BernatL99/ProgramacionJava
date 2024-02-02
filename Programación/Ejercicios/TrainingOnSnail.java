public class Snail {

    public static int[] snail(int[][] array) {
      int m = array.length;
      int n = array[0].length;

      int[] resultado = new int[m * n];
      int index = 0;

      int inicioFila = 0, finFila = m - 1;
      int inicioColumna = 0, finColumna = n - 1;

       while (inicioFila <= finFila && inicioColumna <= finColumna) {
          // Recorrer hacia la derecha
          for (int i = inicioColumna; i <= finColumna; i++) {
                resultado[index++] = array[inicioFila][i];
          }
          inicioFila++;

            // Recorrer hacia abajo
          for (int i = inicioFila; i <= finFila; i++) {
                resultado[index++] = array[i][finColumna];
          }
          finColumna--;

          // Recorrer hacia la izquierda
          if (inicioFila <= finFila) {
              for (int i = finColumna; i >= inicioColumna; i--) {
                    resultado[index++] = array[finFila][i];
              }
              finFila--;
          }

          // Recorrer hacia arriba
          if (inicioColumna <= finColumna) {
              for (int i = finFila; i >= inicioFila; i--) {
                    resultado[index++] = array[i][inicioColumna];
              }
              inicioColumna++;
          }
      }

        return resultado;
    }
}
