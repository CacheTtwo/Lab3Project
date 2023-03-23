package PaqComercio;

public class VehículoParaReparar extends Vehículo
{
    private String Avería;
    private boolean reparado;
    private int prioridad;

    public VehículoParaReparar(String marca, String modelo, String matrícula, String avería, boolean reparado, int prioridad) {
        super(marca, modelo, matrícula);
        Avería = avería;
        this.reparado = reparado;
        this.prioridad = prioridad;
    }

    public String getAvería() {
        return Avería;
    }

    public boolean isReparado() {
        return reparado;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setAvería(String avería) {
        Avería = avería;
    }

    public void setReparado(boolean reparado) {
        this.reparado = reparado;
    }

    public void setPrioridad(int prioridad) {
        if (prioridad>0&&prioridad<3){
            this.prioridad = prioridad;}
        else this.prioridad= 1;

    }

}
