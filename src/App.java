public class App {
    public static void main(String[] args) throws Exception {

        MetodosOrdenamiento mO = new MetodosOrdenamiento();
        int[] arreglo = { 75, 24, 2, 64, 2681, 777, 85 };
        int[] arregloR = {};
        arregloR = mO.sortBySeleccion(arreglo, false);
        mO.printAr(arreglo);

    }
}
