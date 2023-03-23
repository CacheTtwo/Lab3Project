package PaqComercio;

abstract class Comercio implements Cloneable {
    private String Nombre;
    private String Direccion;
    private String Cif;
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

    public Comercio(Comercio C)
    {
        this.Nombre=C.Nombre;
        this.Direccion=C.Direccion;
        this.Cif=C.Cif;
        this.Stock=new int[C.Stock.length];
        for (int i = 0; i < this.Stock.length; i++)
        {
            this.Stock[i]=C.Stock[i];
        }
        this.VentasDiarias=new double[fila][columna];
        for (int j = 0; j < fila; j++) {
            for (int k = 0; k < columna; k++)
            {
             this.VentasDiarias[j][k]=C.VentasDiarias[j][k];
            }

        }
        this.empleados=new Empleado[C.empleados.length];
        for (int a = 0; a <C.empleados.length ; a++)
        {
            this.empleados[a]=new Empleado(C.empleados[a]);
        }

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
    public double mesConmasVentas()
    {
        double[] ventasMes=new double[12];
        double aux=0;
        double c= CalcularVentasMes(0);
        for(int i=1; i<fila;i++)
        {
            if(aux<CalcularVentasMes(i))
            {
                aux=CalcularVentasMes(i);
            }
            else aux=aux;

        }
        return aux;
    }

    public void actualizarVenta(int dia, int mes, double dinero)
    {
        this.VentasDiarias[mes][dia]=dinero;
    }

    public String toStringStock()
    {
        String s="Stock \n";
        for (int i = 0; i < Stock.length; i++)
        {
            s+=Stock[i]+"\n";
        }
        return s;
    }
    public String toStringVentasDiarias()
    {
        String s="Ventas diarias: \n";
        for (int i = 0; i <fila; i++) {
            for (int j = 0; j <columna ; j++) {
                s+=j+"/"+i+" "+VentasDiarias[i][j]+"\n";
            }
        }
        return s;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
       Comercio c= (Comercio) super.clone();
       c.Stock=this.Stock.clone();
       c.Nombre=this.Nombre;
       c.Cif=this.Cif;
       c.VentasDiarias=this.VentasDiarias.clone();
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna ; j++) {
            c.VentasDiarias[i][j]=this.VentasDiarias[i][j];
            }
        }
        c.empleados=new Empleado[empleados.length];
        for (int k = 0; k < this.empleados.length; k++) {
            c.empleados[k]= (Empleado) this.empleados[k].clone();
        }
        return c;
    }
}


