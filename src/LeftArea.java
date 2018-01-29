import java.util.ArrayList;

public class LeftArea {

    public void leftArea(char o) {
        int filas = 0;
        int columnas = 0;
        double suma = 0;
        double avg = 0;
        int tamanioA=0;
        boolean flag = true;
        ArrayList<Double> numerosAvg = new ArrayList<Double>();
        double[][] matriz = new double[12][12];
        int mitad = (matriz[filas].length / 2);
        int cont = mitad-1;
        for (filas = 0; filas < matriz.length; filas++) {
            for (columnas = 0; columnas < matriz[filas].length; columnas++) {
                matriz[filas][columnas] = columnas;
                System.out.print("|" + matriz[filas][columnas] + "|");
            }
            System.out.println();
        }

        for (filas = 0; filas < matriz.length; filas++) {
            for (columnas = 0; columnas < matriz[filas].length; columnas++) {
                if (flag) {
                    if ((columnas < filas) && (columnas < (mitad-1))) {
                        suma += matriz[filas][columnas];
                        tamanioA++;

                    }
                    if (filas == mitad) {
                        flag = false;
                    }
                } else {

                    if(columnas == cont) {
                        cont--;
                        System.out.println("contador" + cont);
                    }

                    if (columnas < cont) {
                        suma += matriz[filas][columnas];
                        tamanioA++;
                    }


                }
            }

        }

        avg = suma/tamanioA;

        if(o == 'S'){
            System.out.println("Suma: " + suma);
        }else if(o == 'M'){
            System.out.println("Avg: " + avg);
        }else{
            System.out.println("Abrance");
        }
    }
}
