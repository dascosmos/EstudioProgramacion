/**
 * Created by david on 20/01/18.
 */
public class PerfectNumber {

    public void IsPerfect(int entrada){
        int resultado = 0;
        for(int i = 1; i<entrada;i++){
            if (entrada%i == 0){
                resultado+=i;
            }
        }

        if (resultado == entrada){
            System.out.println(entrada+" es perfecto");
        }else{
            System.out.println(entrada+" no es perfecto");
        }
    }
}
