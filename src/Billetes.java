/**
 * Created by david on 20/01/18.
 */
public class Billetes {

    public void RecibirValor(double n){
        double valor = n;
        double suma=0;
        int billetes1000 = 0;
        int billetes100 = 0;
        int billetes50 = 0;
        int billetes20 = 0;
        int billetes10 = 0;
        int billetes5 = 0;
        int billetes2 = 0;
        int monedas1 = 0;
        int miles = 0;
        int centenas = 0;
        int decenas = 0;
        int unidades = 0;
        double decimales = 0;

        if(n > 1000){
            miles = (int)(n/1000)*1000;
            centenas =(int)((n%1000)/100)*100;
            decenas = (int)(((n%1000)%100)/10)*10;
            unidades = (int)((((n%1000)%100)%10)/1)*1;
            decimales = ((((n%1000)%100)%10)%1);
        }else if(n > 100){
            centenas = (int)n/100*100;
            decenas = (int)((n%100)/10)*10;
            unidades = (int)((n%100)%10)/1;
            decimales = (((n%100)%10)%1);
        }else if (n > 10){
            decenas = (int)(n/10)*10;
            unidades = (int)(n%10)/1;
            decimales = ((n%10)%1);
        }else if (n>1){
            unidades = (int)n/1;
            decimales = n%1;
        }

        if(miles!=0){
            for (int i = 0; i<miles;i++){
                if(billetes1000*1000 < miles){
                    billetes1000 +=1;
                }
            }
        }

        System.out.println(miles+" "+centenas+" "+decenas+" "+unidades+" "+decimales);

    }
}
