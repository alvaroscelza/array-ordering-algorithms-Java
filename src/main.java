/**
 *
 *
 * @author Loaderon
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //En todos los casos queremos ordenar de menor a mayor
        int datos[] = {10, 6, 3, 8, 11, 0, 9, 9, 3, 22, 108, 6, 6, 2, 1, 1, 1, 22, 7};
        datos = bubbleSort(datos);
        for (int i = 0; i < datos.length; i++) {
            System.out.print(datos[i] + " ");
        }

        System.out.println("");

        int datos2[] = {10, 6, 3, 8, 11, 0, 9, 9, 3, 22, 108, 6, 6, 2, 1, 1, 1, 22, 7};
        datos2 = quickSort(datos2, 0, 18);
        for (int i = 0; i < datos2.length; i++) {
            System.out.print(datos2[i] + " ");
        }
    }

    public static int[] bubbleSort(int[] datos) {
        for (int i = 1; i < datos.length; i++) {
            for (int j = 0; j < datos.length - i; j++) {
                if (datos[j] > datos[j + 1]) {
                    int aux = datos[j];
                    datos[j] = datos[j + 1];
                    datos[j + 1] = aux;
                }
            }
        }
        return datos;
    }

    public static int[] quickSort(int A[], int izq, int der) {

        int pivote = A[izq]; // tomamos primer elemento como pivote
        int i = izq; // i realiza la búsqueda de izquierda a derecha
        int j = der; // j realiza la búsqueda de derecha a izquierda
        int aux;

        while (i < j) {            // mientras no se crucen las búsquedas
            while (A[i] <= pivote && i < j) {
                i++; // busca elemento mayor que pivote
            }
            while (A[j] > pivote) {
                j--;         // busca elemento menor que pivote
            }
            if (i < j) {                      // si no se han cruzado                      
                aux = A[i];                  // los intercambia
                A[i] = A[j];
                A[j] = aux;
            }
        }
        A[izq] = A[j]; // se coloca el pivote en su lugar de forma que tendremos
        A[j] = pivote; // los menores a su izquierda y los mayores a su derecha
        if (izq < j - 1) {
            quickSort(A, izq, j - 1); // ordenamos subarray izquierdo
        }
        if (j + 1 < der) {
            quickSort(A, j + 1, der); // ordenamos subarray derecho
        }
        return A;
    }

}
