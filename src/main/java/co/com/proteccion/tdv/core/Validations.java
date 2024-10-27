package co.com.proteccion.tdv.core;

public class Validations {

    public boolean validatePlate(String plate) {
        return Regex.PLATE_PATTERN.matcher(plate).matches();
    }

    public boolean validatePostalCode(String postalCode) {
        return Regex.POSTAL_CODE_PATTERN.matcher(postalCode).matches();
    }

    public boolean validatePhoneNumber(String phoneNumber) {
        return Regex.PHONE_NUMBER_PATTERN.matcher(phoneNumber).matches();
    }

    public boolean validateMobileNumber(String mobileNumber) {
        return Regex.MOBILE_NUMBER_PATTERN.matcher(mobileNumber).matches();
    }

    public boolean validateAddress(String address) {
        return Regex.ADDRESS_PATTERN.matcher(address).matches();
    }

    public boolean validateEmail(String email) {
        return Regex.EMAIL_PATTERN.matcher(email).matches();
    }

    public boolean validateDate(String date) {
        return Regex.DATE_PATTERN.matcher(date).matches();
    }

    public boolean validateTime(String time) {
        return Regex.TIME_PATTERN.matcher(time).matches();
    }

    public boolean validateJavaVariable(String javaVariable) {
        return Regex.JAVA_VARIABLE_PATTERN.matcher(javaVariable).matches();
    }

    public boolean validateUrl(String url) {
        return Regex.URL_PATTERN.matcher(url).matches();
    }

    public boolean validateIsbn(String isbn) {
        return Regex.ISBN_PATTERN.matcher(isbn).matches();
    }

    public boolean validateBarcode(String barcode) {
        return Regex.BARCODE_PATTERN.matcher(barcode).matches();
    }

    public boolean validatePassport(String passport) {
        return Regex.PASSPORT_PATTERN.matcher(passport).matches();
    }

    public boolean validateName(String name) {
        return Regex.NAME_PATTERN.matcher(name).matches();
    }

    public boolean validatePassword(String password) {
        return Regex.PASSWORD_PATTERN.matcher(password).matches();
    }

    public boolean validateForLoop(String forLoop) {
        return Regex.FOR_LOOP_PATTERN.matcher(forLoop).matches();
    }

    public boolean validateDouble(String doubleNumber) {
        return Regex.DOUBLE_PATTERN.matcher(doubleNumber).matches();
    }

}
