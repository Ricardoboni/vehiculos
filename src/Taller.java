import javax.swing.JOptionPane;

public class Taller {

    public static void main(String[] args) {
        // Arreglo para almacenar los vehículos
        Vehiculo[] vehiculos = new Vehiculo[5];
        int contadorVehiculos = 0; // Contador para llevar el seguimiento de los vehículos agregados

        while (true) {
            // Mostrar el menú y obtener la opción seleccionada
            String opcion = JOptionPane.showInputDialog("""
                                                        Seleccione una opción:
                                                        1. Mostrar la lista de vehículos
                                                        2. Agregar un nuevo vehículo
                                                        3. Modificar un vehículo existente
                                                        4. Eliminar un vehículo
                                                        5. Salir""");

            switch (opcion) {
                case "1":
                    // Opción 1: Mostrar la lista de vehículos
                    mostrarVehiculos(vehiculos, contadorVehiculos);
                    break;
                case "2":
                    // Opción 2: Agregar un nuevo vehículo
                    if (contadorVehiculos < vehiculos.length) {
                        vehiculos[contadorVehiculos] = crearVehiculo();
                        contadorVehiculos++;
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pueden agregar más vehículos.");
                    }
                    break;
                case "3":
                    // Opción 3: Modificar un vehículo existente
                    modificarVehiculo(vehiculos);
                    break;
                case "4":
                    // Opción 4: Eliminar un vehículo
                    eliminarVehiculo(vehiculos);
                    contadorVehiculos--;
                    break;
                case "5":
                    // Opción 5: Salir del programa
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    System.exit(0);
                default:
                    // Opción inválida
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        }
    }

    private static Vehiculo crearVehiculo() {
        // Pedir los detalles del vehículo al usuario
        String marca = JOptionPane.showInputDialog("Ingrese la marca del vehículo:");
        String modelo = JOptionPane.showInputDialog("Ingrese la línea del vehículo:");
        int anio = ingresarEntero("Ingrese el año del vehículo:");
        String color = JOptionPane.showInputDialog("Ingrese el color del vehículo:");
        double precio = ingresarDouble("Ingrese el precio del vehículo:");

        // Crear y retornar un objeto Vehiculo con los detalles ingresados
        return new Vehiculo(marca, modelo, anio, color, precio);
    }

    private static void modificarVehiculo(Vehiculo[] vehiculos) {
        // Pedir el número de vehículo a modificar
        int indice = ingresarEntero("Ingrese el número del vehículo a modificar:") - 1;

        if (indice >= 0 && indice < vehiculos.length && vehiculos[indice] != null) {
            // Mostrar las opciones de modificación disponibles
            String opcion = JOptionPane.showInputDialog("""
                                                        Seleccione qué desea modificar:
                                                        1. Marca
                                                        2. Línea
                                                        3. Año
                                                        4. Color
                                                        5. Precio Q""");

            switch (opcion) {
                case "1":
                    // Modificar la marca del vehículo
                    vehiculos[indice].setMarca(JOptionPane.showInputDialog("Ingrese la nueva marca:"));
                    break;
                case "2":
                    // Modificar la línea del vehículo
                    vehiculos[indice].setModelo(JOptionPane.showInputDialog("Ingrese la nueva línea:"));
                    break;
                case "3":
                    // Modificar el año del vehículo
                    vehiculos[indice].setAnio(ingresarEntero("Ingrese el nuevo año:"));
                    break;
                case "4":
                    // Modificar el color del vehículo
                    vehiculos[indice].setColor(JOptionPane.showInputDialog("Ingrese el nuevo color:"));
                    break;
                case "5":
                    // Modificar el precio del vehículo
                    vehiculos[indice].setPrecio(ingresarDouble("Ingrese el nuevo precio:"));
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Número de vehículo inválido.");
        }
    }

    private static void eliminarVehiculo(Vehiculo[] vehiculos) {
        // Pedir el número de vehículo a eliminar
        int indice = ingresarEntero("Ingrese el número del vehículo a eliminar:") - 1;

        if (indice >= 0 && indice < vehiculos.length && vehiculos[indice] != null) {
            // Eliminar el vehículo
            vehiculos[indice] = null;
        } else {
            JOptionPane.showMessageDialog(null, "Número de vehículo inválido.");
        }
    }

    private static void mostrarVehiculos(Vehiculo[] vehiculos, int contadorVehiculos) {
        // Mostrar la lista de vehículos
        StringBuilder mensaje = new StringBuilder("Lista de vehículos:\n");
        for (int i = 0; i < contadorVehiculos; i++) {
            mensaje.append("Vehículo ").append(i + 1).append(":\n").append(vehiculos[i].toString()).append("\n");
        }

        JOptionPane.showMessageDialog(null, mensaje.toString());
    }

    private static int ingresarEntero(String mensaje) {
        // Método para ingresar un entero validado
        while (true) {
            try {
                return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un valor numérico válido.");
            }
        }
    }

    private static double ingresarDouble(String mensaje) {
        // Método para ingresar un double validado
        while (true) {
            try {
                return Double.parseDouble(JOptionPane.showInputDialog(mensaje));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un valor numérico válido.");
            }
        }
    }
}

