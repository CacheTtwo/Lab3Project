package PaqComercio;

abstract class Comercio {
    public String Nombre;
    public String Direccion;
    public String Cif;
    private double[][] VentasDiarias;

    final int fila=12;
    final int columna=31;


    private int[] Stock;

    Empleado[] empleados;

    public Comercio(String nombre, String direccion, String cif) {
        Nombre = nombre;
        Direccion = direccion;
        Cif = cif;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getCif() {
        return Cif;
    }

    public double[][] getVentasDiarias() {
        return VentasDiarias;
    }

    public void setStock(int[] stock) {
        Stock = stock;
    }
}
