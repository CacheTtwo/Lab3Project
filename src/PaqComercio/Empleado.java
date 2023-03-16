package PaqComercio;

import java.util.Objects;
import java.util.SplittableRandom;

public class Empleado {
    private String Nombre;
    private String dirección;
    private int Telefono;
    private String email;
    private String fechaincio;
    private double salario;
    private String cargo;

    public Empleado(String nombre, String dirección, int telefono, String email,String fechaincio, double salario, String cargo) {
        Nombre = nombre;
        this.dirección = dirección;
        this.Telefono = telefono;
        this.email = email;
        this.fechaincio=fechaincio;
        this.salario=salario;
        this.cargo=cargo;

    }
    public String getNombre() {
        return Nombre;
    }

    public String getDirección() {
        return dirección;
    }

    public int getTelefono() {
        return Telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getFechaincio() {
        return fechaincio;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFechaincio(String fechaincio) {
        this.fechaincio = fechaincio;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        String S= new String();
        S+="Nombre: "+this.Nombre+"\nDireccion"+this.dirección+"\nTelefono: "+this.Telefono+"\nEmail:"+this.email
        +"\nFecha de Inicio: "+this.fechaincio+"\nSalario: "+this.salario+"\nCargo: "+this.cargo;
        return S;
    }

    @Override
    public boolean equals(Object o) {
      if (this==o) return true;
      if(o==null || getClass()!=o.getClass()) return false;
      Empleado aux=(Empleado) o;
      return this.Nombre==aux.Nombre && this.salario==aux.salario && this.fechaincio==aux.fechaincio && this.cargo==aux.cargo;

    }

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        //Deep copy

        return super.clone();
    }

}
 /* if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Telefono == empleado.Telefono && Double.compare(empleado.salario, salario) == 0 && Objects.equals(Nombre, empleado.Nombre) && Objects.equals(dirección, empleado.dirección) && Objects.equals(email, empleado.email) && Objects.equals(fechaincio, empleado.fechaincio) && Objects.equals(cargo, empleado.cargo);*/
