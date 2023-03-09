package PaqComercio;

abstract class Comercio {
    public String Nombre;
    public String Direccion;
    public String Cif;
    private double[][] VentasDiarias;

    final int fila = 12;
    final int columna = 31;


    private int[] Stock;

    Empleado[] empleados;

    public Comercio(String nombre, String direccion, String cif, int stock, int empleados) {
        Nombre = nombre;
        Direccion = direccion;
        Cif = cif;
        this.VentasDiarias = new double[fila][columna];
        Stock = new int[stock] ;
        this.empleados = new Empleado[empleados];
    }



    public double[][] setVentasDiarias(double dinero, int mes, int dia ) {

        VentasDiarias[mes][dia]=dinero;
        return VentasDiarias;
    }

    public double CalcularTotalVentas() {
        double aux = 0;
        for (int i = 0; i < fila; i++) {
            for (int j = 0; i < columna; j++) {
                aux += this.VentasDiarias[i][j];

            }
        }
        return aux;
    }

    public double CalcularVentasMes(int mes) {

        double aux = 0;
        for (int i = 0; i < this.columna; i++)
        {
            aux=+this.VentasDiarias[mes][i];
        }
        return aux;
    }
    public int mesConmasVentas()
    {
        double[] ventasMes=new double[12];
        int s=0;
        int aux=0;
        double c= CalcularVentasMes(1);
        System.out.println("TOTITOTITOTITOTITOTITOTITOTITOTITOTITOTITOTITOTITOTITOTITOTI");
        for(int i=0; i<fila;i++)
        {
            if(aux<CalcularVentasMes(i))
            {
               //Hacer el condicional
            };

        }
        return s;
    }
}
