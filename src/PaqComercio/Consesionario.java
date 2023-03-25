package PaqComercio;
import java.util.Arrays;

public class Consesionario {
    private VehiculoVenta[] V;
    private VehículoParaReparar[] R;

    public Consesionario(int vehiculosdeventa, int VehículoParaReparar) {
        this.V=new VehiculoVenta[vehiculosdeventa];
        this.R=new VehículoParaReparar[VehículoParaReparar];
    }

    public VehiculoVenta getV(int vehiculo) {
        return this.V[vehiculo];
    }

    public VehículoParaReparar getR(int Vehiculo) {
        return R[Vehiculo];
    }
    public void setV(VehiculoVenta aux)
    {
        for (int i = 0; i < V.length; i++) {
            if (V[i]==null)
                V[i]=aux;
        }
    }
    //public void setR(VehículoParaReparar aux)
    //{
    //    for (int i = 0; i < R.length; i++) {
    //        if (R[i]==null)
    //            R[i]=aux;
    //    }
    //}
    public void añadirReparar(VehículoParaReparar aux) //Le pasamos un vehiculo a reparar que ya contiene la variable de prio
    {
        for (int i = 0; i < R.length; i++)
        {
            if(R==null)
            {R[i]=aux;break;}
        }
            Arrays.sort(R);
    }
    public void RepararVehiculo(int vehiculorep)
    {
        R[vehiculorep].setReparado(true);
    }
    public void recogerVehículo(String matricula)
    {
        for (int i = 0; i < R.length; i++)
        {
            if (R[i].getMatrícula().equals(matricula)&&R[i].isReparado()==true)
                R[i]=null;
        }
    }

    public void añadirVenta(VehiculoVenta aux)
    {
        for (int i = 0; i < V.length; i++)
        {
            if(V==null)
            {V[i]=aux;break;}

        }
    }


}
