package org.example;

public class Busqueda {

    public void sort(int[] arr) {
        int n = arr.length;
        boolean huboIntercambio;

        for (int i = 0; i < n - 1; i++) {
            huboIntercambio = false;

            // El último elemento i ya está ordenado, no hace falta evaluarlo
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambiar arr[j] y arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    huboIntercambio = true;
                }
            }

            // Si no hubo intercambios en esta pasada, el arreglo ya está ordenado
            if (!huboIntercambio) {
                break;
            }
        }
    }
}
