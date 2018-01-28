import java.util.ArrayList;

public class LeftArea {

    public void leftArea(char o){
        int filas = 0;
        int columnas = 0;
        double suma = 0;
        double avg = 0;
        ArrayList<Double> numerosAvg = new ArrayList<Double>();
        double [][] matriz = new double[12][12];

        for(filas = 0;filas < matriz.length;filas++){
            for (columnas = 0; columnas < matriz[filas].length;columnas++){
                matriz[filas][columnas]= columnas;
                System.out.print(matriz[filas][columnas]);
            }
            System.out.println();
        }

        for(filas = 0;filas < matriz.length;filas++){
            for (columnas = 0; columnas < matriz[filas].length;columnas++){
                if((filas < columnas)&&(columnas<(matriz[filas].length/2)-1)){
                    switch(o){
                        case 'S':
                            suma += matriz[filas][columnas];
                            break;
                        case 'M':
                            numerosAvg.add(matriz[filas][columnas]);
                            break;
                        default:
                            System.out.println("Error");
                            break;
                    }
                }
            }
        }

        for (int i = 1; i<numerosAvg.size();i++){
            avg = (numerosAvg.get(i)+numerosAvg.get(i-1))/numerosAvg.size();
        }

        System.out.println("Suma: "+suma);
        System.out.println("Avg: "+avg);
    }
}
