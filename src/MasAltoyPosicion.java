/**
 * Created by david on 20/01/18.
 */
public class MasAltoyPosicion {

    public void MasAlto(int[] listaNumeros){
        int max = 0;
        int pos = 0;
        for (int i = 0; i<listaNumeros.length;i++){

            if(listaNumeros[i]>max){
                max = listaNumeros[i];
                pos = i+1;
            }

        }
        System.out.println("\n");
        System.out.println(max);
        System.out.println(pos);
    }
}
