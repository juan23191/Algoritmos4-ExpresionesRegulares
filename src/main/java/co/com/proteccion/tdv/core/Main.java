package co.com.proteccion.tdv.core;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Validations validations = new Validations();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            mostrarMenu();
            try {
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir nueva línea

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese la placa: ");
                        String placa = scanner.nextLine();
                        if (validations.validatePlate(placa)) {
                            System.out.printf("Placa %s válida.%n%n", placa);
                        } else {
                            System.out.printf("Placa %s inválida.%n%n", placa);
                        }
                        break;
                    case 2:
                        System.out.print("Ingrese el código postal: ");
                        String codigoPostal = scanner.nextLine();
                        if (validations.validatePostalCode(codigoPostal)) {
                            System.out.printf("Código postal %s válido.%n%n", codigoPostal);
                        } else {
                            System.out.printf("Código postal %s inválido.%n%n", codigoPostal);
                        }
                        break;
                    case 3:
                        System.out.print("Ingrese el número de teléfono: ");
                        String numeroTelefono = scanner.nextLine();
                        if (validations.validatePhoneNumber(numeroTelefono)) {
                            System.out.printf("Número de teléfono %s válido.%n%n", numeroTelefono);
                        } else {
                            System.out.printf("Número de teléfono %s inválido.%n%n", numeroTelefono);
                        }
                        break;
                    case 4:
                        System.out.print("Ingrese el número de celular: ");
                        String numeroCelular = scanner.nextLine();
                        if (validations.validateMobileNumber(numeroCelular)) {
                            System.out.printf("Número de celular %s válido.%n%n", numeroCelular);
                        } else {
                            System.out.printf("Número de celular %s inválido.%n%n", numeroCelular);
                        }
                        break;
                    case 5:
                        System.out.print("Ingrese la dirección: ");
                        String direccion = scanner.nextLine();
                        if (validations.validateAddress(direccion)) {
                            System.out.printf("Dirección %s válida.%n%n", direccion);
                        } else {
                            System.out.printf("Dirección %s inválida.%n%n", direccion);
                        }
                        break;
                    case 6:
                        System.out.print("Ingrese el correo electrónico: ");
                        String correo = scanner.nextLine();
                        if (validations.validateEmail(correo)) {
                            System.out.printf("Correo electrónico %s válido.%n%n", correo);
                        } else {
                            System.out.printf("Correo electrónico %s inválido.%n%n", correo);
                        }
                        break;
                    case 7:
                        System.out.print("Ingrese la fecha (dd-mm-aaaa): ");
                        String fecha = scanner.nextLine();
                        if (validations.validateDate(fecha)) {
                            System.out.printf("Fecha %s válida.%n%n", fecha);
                        } else {
                            System.out.printf("Fecha %s inválida.%n%n", fecha);
                        }
                        break;
                    case 8:
                        System.out.print("Ingrese la hora (hh:mm:ss): ");
                        String hora = scanner.nextLine();
                        if (validations.validateTime(hora)) {
                            System.out.printf("Hora %s válida.%n%n", hora);
                        } else {
                            System.out.printf("Hora %s inválida.%n%n", hora);
                        }
                        break;
                    case 9:
                        System.out.print("Ingrese la declaración de variable en Java: ");
                        String variableJava = scanner.nextLine();
                        if (validations.validateJavaVariable(variableJava)) {
                            System.out.printf("Declaración de variable %s válida.%n%n", variableJava);
                        } else {
                            System.out.printf("Declaración de variable %s inválida.%n%n", variableJava);
                        }
                        break;
                    case 10:
                        System.out.print("Ingrese la URL: ");
                        String url = scanner.nextLine();
                        if (validations.validateUrl(url)) {
                            System.out.printf("URL %s válida.%n%n", url);
                        } else {
                            System.out.printf("URL %s inválida.%n%n", url);
                        }
                        break;
                    case 11:
                        System.out.print("Ingrese el ISBN: ");
                        String isbn = scanner.nextLine();
                        if (validations.validateIsbn(isbn)) {
                            System.out.printf("ISBN %s válido.%n%n", isbn);
                        } else {
                            System.out.printf("ISBN %s inválido.%n%n", isbn);
                        }
                        break;
                    case 12:
                        System.out.print("Ingrese el código de barras: ");
                        String codigoBarras = scanner.nextLine();
                        if (validations.validateBarcode(codigoBarras)) {
                            System.out.printf("Código de barras %s válido.%n%n", codigoBarras);
                        } else {
                            System.out.printf("Código de barras %s inválido.%n%n", codigoBarras);
                        }
                        break;
                    case 13:
                        System.out.print("Ingrese el pasaporte: ");
                        String pasaporte = scanner.nextLine();
                        if (validations.validatePassport(pasaporte)) {
                            System.out.printf("Pasaporte %s válido.%n%n", pasaporte);
                        } else {
                            System.out.printf("Pasaporte %s inválido.%n%n", pasaporte);
                        }
                        break;
                    case 14:
                        System.out.print("Ingrese el nombre: ");
                        String nombre = scanner.nextLine();
                        if (validations.validateName(nombre)) {
                            System.out.printf("Nombre %s válido.%n%n", nombre);
                        } else {
                            System.out.printf("Nombre %s inválido.%n%n", nombre);
                        }
                        break;
                    case 15:
                        System.out.print("Ingrese la contraseña: ");
                        String contrasena = scanner.nextLine();
                        if (validations.validatePassword(contrasena)) {
                            System.out.printf("Contraseña %s válida.%n%n", contrasena);
                        } else {
                            System.out.printf("Contraseña %s inválida.%n%n", contrasena);
                        }
                        break;
                    case 16:
                        System.out.print("Ingrese el ciclo for: ");
                        String cicloFor = scanner.nextLine();
                        if (validations.validateForLoop(cicloFor)) {
                            System.out.printf("Ciclo for %s válido.%n%n", cicloFor);
                        } else {
                            System.out.printf("Ciclo for %s inválido.%n%n", cicloFor);
                        }
                        break;
                    case 17:
                        System.out.print("Ingrese el número double: ");
                        String numeroDouble = scanner.nextLine();
                        if (validations.validateDouble(numeroDouble)) {
                            System.out.printf("Número double %s válido.%n%n", numeroDouble);
                        } else {
                            System.out.printf("Número double %s inválido.%n%n", numeroDouble);
                        }
                        break;
                    case 0:
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, intente de nuevo.%n%n");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número.%n%n");
                scanner.next(); // Limpiar la entrada no válida
            }
        }

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("Menú de Validación:");
        System.out.println("1. Validar Placa");
        System.out.println("2. Validar Código Postal");
        System.out.println("3. Validar Número de Teléfono");
        System.out.println("4. Validar Número de Celular");
        System.out.println("5. Validar Dirección");
        System.out.println("6. Validar Correo Electrónico");
        System.out.println("7. Validar Fecha");
        System.out.println("8. Validar Hora");
        System.out.println("9. Validar Variable Java");
        System.out.println("10. Validar URL");
        System.out.println("11. Validar ISBN");
        System.out.println("12. Validar Código de Barras");
        System.out.println("13. Validar Pasaporte");
        System.out.println("14. Validar Nombre");
        System.out.println("15. Validar Contraseña");
        System.out.println("16. Validar Ciclo For");
        System.out.println("17. Validar Número Double");
        System.out.println("0. Salir");
        System.out.print("Ingrese su opción: ");
    }
}