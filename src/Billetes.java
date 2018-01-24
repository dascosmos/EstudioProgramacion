/**
 * Created by david on 20/01/18.
 */
public class Billetes {

    public void RecibirValor(double n){
        double valor = n;
        double suma=0;
        double [] valorBilletes = {100,50,20,10,5,2,1,0.50,0.25,0.10,0.05,0.01};
        double [] valorCambio = {0,0,0,0,0,0,0,0,0,0,0,0};

        for (int i = 0; i<valorBilletes.length;i++){
            if (valor>valorBilletes[i]){
                valorCambio[i]= Math.floor(valor/valorBilletes[i]);

                valor=valor-(valorCambio[i]*valorBilletes[i]);
            }
        }

        for(int i = 0; i<valorBilletes.length;i++){

                if (valorBilletes[i]>1){
                    System.out.println(valorCambio[i]+" Billetes de: "+valorBilletes[i]);
                }else{
                    System.out.println(valorCambio[i]+" Monedas de: "+valorBilletes[i]);
                }

        }

/*
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
        */

    }
}
