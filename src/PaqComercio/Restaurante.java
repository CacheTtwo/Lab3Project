package PaqComercio;

public class Restaurante extends Comercio
{
    private String[] menúDiario;
    private int numMesas;
    private int Capacidad;

    public Restaurante(String nombre, String direccion, String cif, int stock, int empleados, String[] menúDiario, int numMesas, int capacidad) {
        super(nombre, direccion, cif, stock, empleados);
        this.menúDiario = menúDiario;
        this.numMesas = numMesas;
        Capacidad = capacidad;
    }

    public Restaurante(Comercio C, String[] menúDiario, int numMesas, int capacidad) {
        super(C);
        this.menúDiario = menúDiario;
        this.numMesas = numMesas;
        Capacidad = capacidad;
    }

    public String[] getMenúDiario() {
        return menúDiario;
    }

    public int getNumMesas() {
        return numMesas;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setMenúDiario(String menúDiario) {
        for (int i = 0; i < this.menúDiario.length ; i++)
        {
            this.menúDiario[i]=menúDiario;
            break;
        };
    }

    public void setNumMesas(int numMesas) {
        this.numMesas = numMesas;
    }

    public void setCapacidad(int capacidad) {
        Capacidad = capacidad;
    }

    public void fijarMenúDelDia(String MenudelDia, String Dia)
    {
        switch (Dia)
        {
        case "Lunes":
            this.menúDiario[0]=MenudelDia;
            break;
            case "Martes":
                this.menúDiario[1]=MenudelDia;
                break;
            case "Miercoles":
                this.menúDiario[2]=MenudelDia;
                break;
            case "Jueves":
                this.menúDiario[3]=MenudelDia;
            case "Viernes":
                this.menúDiario[4]=MenudelDia;
                break;
            case "Sabado":
                this.menúDiario[4]=MenudelDia;
                break;
            case "Domingo":
                this.menúDiario[5]=MenudelDia;
                break;
        }

    }
    public String verMenúDia(int dia)
    {
        String S="";
        S+=this.menúDiario[dia];
        return S;
    }

}
