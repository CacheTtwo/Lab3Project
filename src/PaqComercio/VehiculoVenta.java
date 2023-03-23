package PaqComercio;

public class VehiculoVenta extends Vehículo
{
    private double precio;
    private int descuento;

    public VehiculoVenta(String marca, String modelo, String matrícula, double precio, int descuento) {
        super(marca, modelo, matrícula);
        this.precio = precio;
        this.descuento = descuento;
    }

    public double getPrecio() {
        return precio;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
