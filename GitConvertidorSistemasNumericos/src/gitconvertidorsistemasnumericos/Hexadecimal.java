package gitconvertidorsistemasnumericos;
public class Hexadecimal {
    public String binario_a_octal(String binario){
        int tamanio = binario.length();
        char car[] = binario.toCharArray();
        int arreglo[] = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            switch(car[i]){
                case '1':
                    arreglo[i] = 1;
                    break;
                case '0':
                    arreglo[i] = 0;
                    break;
                }
        }
        int potencia = 0, suma = 0;
        for (int j = 0; j < tamanio; j++) {
            potencia = (j - (tamanio-1)) * -1;
            suma += (int) (arreglo[j] * Math.pow(2, potencia));
        }
        Hexadecimal conv = new Hexadecimal();
        String octal = conv.decimal_a_otro(suma, 8);
        return octal;
    }
    public String binario_a_decimal(String binario){
        int tamanio = binario.length();
        char car[] = binario.toCharArray();
        int arreglo[] = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            switch(car[i]){
                case '1':
                    arreglo[i] = 1;
                    break;
                case '0':
                    arreglo[i] = 0;
                    break;
                }
        }
        int potencia = 0, suma = 0;
        for (int j = 0; j < tamanio; j++) {
            potencia = (j - (tamanio-1)) * -1;
            suma += (int) (arreglo[j] * Math.pow(2, potencia));
        }
        String decimal = suma + "";
        return decimal;
    }
    public String binario_a_hexadecimal(String binario){
        int tamanio = binario.length();
        char car[] = binario.toCharArray();
        int arreglo[] = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            switch(car[i]){
                case '1':
                    arreglo[i] = 1;
                    break;
                case '0':
                    arreglo[i] = 0;
                    break;
                }
        }
        int potencia = 0, suma = 0;
        for (int j = 0; j < tamanio; j++) {
            potencia = (j - (tamanio-1)) * -1;
            suma += (int) (arreglo[j] * Math.pow(2, potencia));
        }
        Hexadecimal conv = new Hexadecimal();
        String hexadecimal = conv.decimal_a_otro(suma, 16);
        return hexadecimal;
    }
    public String decimal_a_otro(int decimal, int base){
        String hex = "";
        int letra;
        while (decimal != 0) {
            letra = decimal % base;
            if(letra >= 0){
                switch(letra){
                    case 15:
                        hex += "F";
                        break;
                    case 14:
                        hex += "E";
                        break;
                    case 13:
                        hex += "D";
                        break;
                    case 12:
                        hex += "C";
                        break;
                    case 11:
                        hex += "B";
                        break;
                    case 10:
                        hex += "A";
                        break;
                    case 9:
                        hex += "9";
                        break;
                    case 8:
                        hex += "8";
                        break;
                    case 7:
                        hex += "7";
                        break;
                    case 6:
                        hex += "6";
                        break;
                    case 5:
                        hex += "5";
                        break;
                    case 4:
                        hex += "4";
                        break;
                    case 3:
                        hex += "3";
                        break;
                    case 2:
                        hex += "2";
                        break;
                    case 1:
                        hex += "1";
                        break;
                    case 0:
                        hex += "0";
                        break;
                }
            }
            decimal = decimal / base;
        }
        StringBuilder aux = new StringBuilder(hex);
        String hexadecimal = aux.reverse().toString();
        return hexadecimal;
    }
    public String octal_a_binario(String octal){
        int tamanio = octal.length();
        char car[] = octal.toCharArray();
        int arreglo[] = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            switch(car[i]){
                case '7':
                    arreglo[i] = 7;
                    break;
                case '6':
                    arreglo[i] = 6;
                    break;
                case '5':
                    arreglo[i] = 5;
                    break;
                case '4':
                    arreglo[i] = 4;
                    break;
                case '3':
                    arreglo[i] = 3;
                    break;
                case '2':
                    arreglo[i] = 2;
                    break;
                case '1':
                    arreglo[i] = 1;
                    break;
                case '0':
                    arreglo[i] = 0;
                    break;
                }
        }
        int potencia = 0, suma = 0;
        for (int j = 0; j < tamanio; j++) {
            potencia = (j - (tamanio-1)) * -1;
            suma += (int) (arreglo[j] * Math.pow(8, potencia));
        }
        Hexadecimal conv = new Hexadecimal();
        String hexadecimal = conv.decimal_a_otro(suma, 2);
        return hexadecimal;
    }
    public String octal_a_decimal(String octal){
        int tamanio = octal.length();
        char car[] = octal.toCharArray();
        int arreglo[] = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            switch(car[i]){
                case '7':
                    arreglo[i] = 7;
                    break;
                case '6':
                    arreglo[i] = 6;
                    break;
                case '5':
                    arreglo[i] = 5;
                    break;
                case '4':
                    arreglo[i] = 4;
                    break;
                case '3':
                    arreglo[i] = 3;
                    break;
                case '2':
                    arreglo[i] = 2;
                    break;
                case '1':
                    arreglo[i] = 1;
                    break;
                case '0':
                    arreglo[i] = 0;
                    break;
                }
        }
        int potencia = 0, suma = 0;
        for (int j = 0; j < tamanio; j++) {
            potencia = (j - (tamanio-1)) * -1;
            suma += (int) (arreglo[j] * Math.pow(8, potencia));
        }
        String decimal = suma + "";
        return decimal;
    }
    public String octal_a_hexadecimal(String octal){
        int tamanio = octal.length();
        char car[] = octal.toCharArray();
        int arreglo[] = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            switch(car[i]){
                case '7':
                    arreglo[i] = 7;
                    break;
                case '6':
                    arreglo[i] = 6;
                    break;
                case '5':
                    arreglo[i] = 5;
                    break;
                case '4':
                    arreglo[i] = 4;
                    break;
                case '3':
                    arreglo[i] = 3;
                    break;
                case '2':
                    arreglo[i] = 2;
                    break;
                case '1':
                    arreglo[i] = 1;
                    break;
                case '0':
                    arreglo[i] = 0;
                    break;
                }
        }
        int potencia = 0, suma = 0;
        for (int j = 0; j < tamanio; j++) {
            potencia = (j - (tamanio-1)) * -1;
            suma += (int) (arreglo[j] * Math.pow(8, potencia));
        }
        Hexadecimal conv = new Hexadecimal();
        String hexadecimal = conv.decimal_a_otro(suma, 16);
        return hexadecimal;
    }
    public String hexadecimal_a_binario(String hexadecimal){
        int tamanio = hexadecimal.length();
        char car[] = hexadecimal.toCharArray();
        int arreglo[] = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            switch(car[i]){
                case 'F':
                    arreglo[i] = 15;
                    break;
                case 'E':
                    arreglo[i] = 14;
                    break;
                case 'D':
                    arreglo[i] = 13;
                    break;
                case 'C':
                    arreglo[i] = 12;
                    break;
                case 'B':
                    arreglo[i] = 11;
                    break;
                case 'A':
                    arreglo[i] = 10;
                    break;
                case '9':
                    arreglo[i] = 9;
                    break;
                case '8':
                    arreglo[i] = 8;
                    break;
                case '7':
                    arreglo[i] = 7;
                    break;
                case '6':
                    arreglo[i] = 6;
                    break;
                case '5':
                    arreglo[i] = 5;
                    break;
                case '4':
                    arreglo[i] = 4;
                    break;
                case '3':
                    arreglo[i] = 3;
                    break;
                case '2':
                    arreglo[i] = 2;
                    break;
                case '1':
                    arreglo[i] = 1;
                    break;
                case '0':
                    arreglo[i] = 0;
                    break;
            }
        }
        int potencia = 0, suma = 0;
        for (int j = 0; j < tamanio; j++) {
            potencia = (j - (tamanio-1)) * -1;
            suma += (int) (arreglo[j] * Math.pow(16, potencia));
        }
        Hexadecimal he = new Hexadecimal();
        String retorno = he.decimal_a_otro(suma, 2);
        return retorno;
    }
    public String hexadecimal_a_decimal(String hexadecimal){
        int tamanio = hexadecimal.length();
        char car[] = hexadecimal.toCharArray();
        int arreglo[] = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            switch(car[i]){
                case 'F':
                    arreglo[i] = 15;
                    break;
                case 'E':
                    arreglo[i] = 14;
                    break;
                case 'D':
                    arreglo[i] = 13;
                    break;
                case 'C':
                    arreglo[i] = 12;
                    break;
                case 'B':
                    arreglo[i] = 11;
                    break;
                case 'A':
                    arreglo[i] = 10;
                    break;
                case '9':
                    arreglo[i] = 9;
                    break;
                case '8':
                    arreglo[i] = 8;
                    break;
                case '7':
                    arreglo[i] = 7;
                    break;
                case '6':
                    arreglo[i] = 6;
                    break;
                case '5':
                    arreglo[i] = 5;
                    break;
                case '4':
                    arreglo[i] = 4;
                    break;
                case '3':
                    arreglo[i] = 3;
                    break;
                case '2':
                    arreglo[i] = 2;
                    break;
                case '1':
                    arreglo[i] = 1;
                    break;
                case '0':
                    arreglo[i] = 0;
                    break;
                }
        }
        int potencia = 0, suma = 0;
        for (int j = 0; j < tamanio; j++) {
            potencia = (j - (tamanio-1)) * -1;
            suma += (int) (arreglo[j] * Math.pow(16, potencia));
        }
        String decimal = suma + "";
        return decimal;
    }
    public String hexadecimal_a_octal(String hexadecimal){
        int tamanio = hexadecimal.length();
        char car[] = hexadecimal.toCharArray();
        int arreglo[] = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            switch(car[i]){
                case 'F':
                    arreglo[i] = 15;
                    break;
                case 'E':
                    arreglo[i] = 14;
                    break;
                case 'D':
                    arreglo[i] = 13;
                    break;
                case 'C':
                    arreglo[i] = 12;
                    break;
                case 'B':
                    arreglo[i] = 11;
                    break;
                case 'A':
                    arreglo[i] = 10;
                    break;
                case '9':
                    arreglo[i] = 9;
                    break;
                case '8':
                    arreglo[i] = 8;
                    break;
                case '7':
                    arreglo[i] = 7;
                    break;
                case '6':
                    arreglo[i] = 6;
                    break;
                case '5':
                    arreglo[i] = 5;
                    break;
                case '4':
                    arreglo[i] = 4;
                    break;
                case '3':
                    arreglo[i] = 3;
                    break;
                case '2':
                    arreglo[i] = 2;
                    break;
                case '1':
                    arreglo[i] = 1;
                    break;
                case '0':
                    arreglo[i] = 0;
                    break;
                }
        }
        int potencia = 0, suma = 0;
        for (int j = 0; j < tamanio; j++) {
            potencia = (j - (tamanio-1)) * -1;
            suma += (int) (arreglo[j] * Math.pow(16, potencia));
        }
        Hexadecimal he = new Hexadecimal();
        String retorno = he.decimal_a_otro(suma, 8);
        return retorno;
    }
    public boolean validarBase1(String num, int base){
        boolean bandera = false;
        if(base == 2){
            if(num.matches("[0-1]+")){
                bandera = true;
            }
        }
        if(base == 8){
            if(num.matches("[0-7]+")){
                bandera = true;
            }
        }
        if(base == 10){
            if(num.matches("[0-9]+")){
                bandera = true;
            }
        }
        if(base == 16){
            if(num.matches("[a-fA-F0-9]+")){
                bandera = true;
            }
        }
        return bandera;
    }
}