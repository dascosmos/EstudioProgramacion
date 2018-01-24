/**
 * Created by david on 20/01/18.
 */
public class SalarioConBonus {

    public void salario(String nombre, double salario, double ventas){
        double porcentaje = ventas * 0.15;
        double salarioF = salario+porcentaje;
        System.out.println(nombre);
        System.out.println(salarioF);
    }
}
