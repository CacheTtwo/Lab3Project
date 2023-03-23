package PaqComercio;

abstract class Vehículo implements Cloneable
{
    protected String marca;
    protected String modelo;
    protected String matrícula;

    public Vehículo(String marca, String modelo, String matrícula) {
        this.marca = marca;
        this.modelo = modelo;
        this.matrícula = matrícula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatrícula() {
        return matrícula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMatrícula(String matrícula) {
        this.matrícula = matrícula;
    }

    @Override
    public String toString() {
        return "Vehículo{\n" +
                "Marca:'" + marca + '\n' +
                "Modelo:'" + modelo + '\n' +
                "Matrícula:'" + matrícula + '\n' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
