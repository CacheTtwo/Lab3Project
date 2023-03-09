package PaqPruebas;
import PaqComercio.*;
public class MainEmpleado {
    public static void main(String[] args)
    {
    Empleado e1= new Empleado("Manuel"," calle libertad",603324432, "manu@it.com","14/02/2000", 321.3,"Proxeneta" );
        System.out.println(""+e1);
        Empleado e2= new Empleado("Manuel"," calle libertad",603324432, "manu@it.com","14/02/2000", 321.3,"Proxeneta" );

        System.out.println(""+e1.equals(e2));


    }
}
