public class MetodosOrdenamiento {

    public int[] sortBySeleccion(int[] arreglo ,boolean opc) {

        int tam = arreglo.length;

        // Recorrer arreglo

        if (opc){
        for (int i = 0; i < tam; i++) {

            int indice = i;
            for (int j = i + 1; j < tam; j++) {
                if (arreglo[j] < arreglo[indice]) {
                    indice = j;
                }
            }
            // intercambio de variables
            int aux = arreglo[indice];
            arreglo[indice] = arreglo[i];
            arreglo[i] = aux;
        }
    }else{
        for (int i = 0; i < tam; i++) {

            int indice = i;
            for (int j = i + 1; j < tam; j++) {
                if (arreglo[j] > arreglo[indice]) {
                    indice = j;
                }
            }
            // intercambio de variables
            int aux = arreglo[indice];
            arreglo[indice] = arreglo[i];
            arreglo[i] = aux;
        }
    }

        return arreglo;
    }

    public void printAr(int[] arreglo) {
        System.out.println();
        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }

    }

}
