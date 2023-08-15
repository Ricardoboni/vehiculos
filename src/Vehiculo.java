class Vehiculo {
    // Atributos privados de la clase Vehiculo
    private String marca;
    private String modelo;
    private int anio;
    private String color;
    private double precio;

    // Constructor de la clase Vehiculo
    public Vehiculo(String marca, String modelo, int anio, String color, double precio) {
        // Inicialización de los atributos con los valores proporcionados
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.precio = precio;
    }

    // Métodos get y set para cada atributo

    // Método para obtener la marca del vehículo
    public String getMarca() {
        return marca;
    }

    // Método para modificar la marca del vehículo
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Método para obtener el modelo del vehículo
    public String getModelo() {
        return modelo;
    }

    // Método para modificar el modelo del vehículo
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Método para obtener el año del vehículo
    public int getAnio() {
        return anio;
    }

    // Método para modificar el año del vehículo
    public void setAnio(int anio) {
        this.anio = anio;
    }

    // Método para obtener el color del vehículo
    public String getColor() {
        return color;
    }

    // Método para modificar el color del vehículo
    public void setColor(String color) {
        this.color = color;
    }

    // Método para obtener el precio del vehículo
    public double getPrecio() {
        return precio;
    }

    // Método para modificar el precio del vehículo
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método toString para representar el objeto en forma de cadena
    @Override
    public String toString() {
        return "Marca: " + marca + "\n" +
               "Linea: " + modelo + "\n" +
               "Año: " + anio + "\n" +
               "Color: " + color + "\n" +
               "Precio: " + precio;
    }
}
