package co.com.proteccion.tdv.core;

import java.util.regex.Pattern;

public class Regex {

    // Placas de carros en Colombia (formato: ABC123 o ABC12D)
    public static final Pattern PLATE_PATTERN = Pattern.compile("^[A-Z]{3}\\d{3}$|^[A-Z]{3}\\d{2}[A-Z]$");
    // Códigos postales de Medellín (formato: 050XXX)
    public static final Pattern POSTAL_CODE_PATTERN = Pattern.compile("^050\\d{3}$");
    // Números telefónicos de Medellín (formato: 604XXXXXXX)
    public static final Pattern PHONE_NUMBER_PATTERN = Pattern.compile("^604[2-9]\\d{6}$");
    // Números de celular de Colombia (formato: 3XXXXXXXXX)
    public static final Pattern MOBILE_NUMBER_PATTERN = Pattern.compile("^(30[0-5]|31\\d|32[0-4]|35[0-1])\\d{7}$");
    // Direcciones residenciales en Medellín (formato: Calle|Carrera|Avenida XX[letra opcional] [dirección opcional] # XX[letra opcional]-XX)
    public static final Pattern ADDRESS_PATTERN = Pattern.compile("^(Calle|Carrera|Avenida)\\s\\d+[A-Za-z]?\\s?(sur|norte|este|oeste)?\\s?#\\s?\\d+[A-Za-z]?\\-\\d+$", Pattern.CASE_INSENSITIVE);
    // Direcciones de correos electrónicos
    public static final Pattern EMAIL_PATTERN = Pattern.compile("^[\\w\\.-]+@[\\w\\.-]+\\.[a-zA-Z]{2,6}$");
    // Fecha en formato dd-mm-aaaa
    public static final Pattern DATE_PATTERN = Pattern.compile("^\\d{2}-\\d{2}-\\d{4}$");
    // Hora en formato hh-mm-ss
    public static final Pattern TIME_PATTERN = Pattern.compile("^\\d{2}:\\d{2}:\\d{2}$");
    // Declaración de una variable en Java
    public static final Pattern JAVA_VARIABLE_PATTERN = Pattern.compile("^(int|float|double|char|String|boolean)\\s+\\w+\\s*=\\s*[^;]+;$");
    // URL
    public static final Pattern URL_PATTERN = Pattern.compile("^(https?|ftp)://[\\w\\.-]+(:\\d+)?(/[\\w\\.-]*)*/?$");
    // Código ISBN (10 o 13 dígitos)
    public static final Pattern ISBN_PATTERN = Pattern.compile("^(97(8|9))?\\d{9}(\\d|X)$");
    // Código de barras en Colombia (formato: 13 dígitos)
    public static final Pattern BARCODE_PATTERN = Pattern.compile("^\\d{13}$");
    // Pasaporte de Colombia (formato: letras y números, longitud entre 6 y 9 caracteres)
    public static final Pattern PASSPORT_PATTERN = Pattern.compile("^[A-Z0-9]{6,9}$");
    // Nombres y apellidos con tildes y ñ
    public static final Pattern NAME_PATTERN = Pattern.compile("^[A-Za-zÁÉÍÓÚáéíóúÑñ]+(\\s[A-Za-zÁÉÍÓÚáéíóúÑñ]+)*$");
    // Contraseña segura (mínimo 8 caracteres, al menos una letra mayúscula, una letra minúscula, un número y un carácter especial)
    public static final Pattern PASSWORD_PATTERN = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");
    // Estructura de un ciclo for en Java
    public static final Pattern FOR_LOOP_PATTERN = Pattern.compile("^for\\s*\\(\\s*\\w+\\s*=\\s*\\d+\\s*;\\s*\\w+\\s*<\\s*\\w+\\s*;\\s*\\w+\\+\\+\\s*\\)$");
    // Formato de un número double
    public static final Pattern DOUBLE_PATTERN = Pattern.compile("^[+-]?\\d*\\.\\d+$");
}


