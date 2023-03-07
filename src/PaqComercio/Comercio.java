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

    public Comercio() {
        this.VentasDiarias=new double[fila][columna];
    }


}
