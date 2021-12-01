package test;

import java.util.Scanner;

public class Restaurante {

    public static void main(String[] args) {
        
        //Inicializacion de variables
        //Inicializacion de Arrays(Arreglos unidimencionales)
        Scanner consola = new Scanner(System.in);
        String nombre[] = new String[10];
        String empleado[] = new String[10];
        String ocupacion[] = new String[10];
        String bebida[] = new String[10];
        double costo[] = new double[10];
        double precio[] = new double[10];
        
        //inicializacion de contadores
        int opcion;
        int contador = 0;
        int contador2 = 0;
        
        //Damos inicio a los arrays intregando datos relacionados con el tipo de dato
        costo[0] = 15;
        costo[1] = 17;
        precio[0] = 120.99;
        precio[1] = 450.58;

        nombre[0] = "Huevos fritos";
        nombre[1] = "Carne Azanda";
        empleado[0] = "Jose Flores";
        empleado[1] = "Karla Aranda";
        ocupacion[0] = "Chef";
        ocupacion[1] = "Pinche";
        bebida[0] = "Coca cola";
        bebida[1] = "Sprite";
        
        //Iniciamos Menu
        System.out.println("BIENVENIDO A LA PAGINA DEL RESTAURANTE \n\n");
        //Utilizamos excepciones para cualquier integer.data
        try {
            //Utilizamos bucle para el menu y se pueda utilizar las vecesa adecuadas, hasta que marque salida
            do {
                if(contador2 >= 1){
                    System.out.println("\n\n\n\n");
                }
                System.out.print("1. REVISAR MENU \n"
                        + "2. INTEGRAR COMIDA \n"
                        + "3. ELIMINAR COMIDA \n"
                        + "4. REVISAR BEBIDAS \n"
                        + "5. INTEGRACION DE BEBIDAS \n"
                        + "6. ELIMINACION DE BEBIDAS \n"
                        + "7. REVISAR EL PERSONAL \n"
                        + "8. ALTA DE PERSONAL \n"
                        + "9. BAJA DE PERSONAL \n"
                        + "10. SALIR \n"
                        + "-> ");
                opcion = consola.nextInt();

                switch (opcion) {
                    //Utilizamos casos para cada uno de las descripciones del menu
                    case 1 -> {
                        System.out.println("\n\n REVISAR MENU");
                        //Algoritmo para revisar
                        for (int i = 0; i < nombre.length; i++) {
                            if (nombre[i] != null) {
                                System.out.println((i + 1) + " comida: " + nombre[i] + " precio: $" + precio[i]);
                            }
                        }
                    }
                    //Algoritmo para integrar comida al array
                    case 2 -> {
                        System.out.println("\n\n INTEGRAR COMIDA");
                        for (int i = 0; i < nombre.length; i++) {
                            if (nombre[i] == null) {
                                contador = i;
                                break;
                            }
                        }
                        System.out.print("""
                                         nueva comida: 
                                         nombre: """);
                        nombre[contador] = consola.next();
                        System.out.print("precio: ");
                        precio[contador] = consola.nextDouble();
                        System.out.println("LA INTEGRACION FUE UN EXITO: " + nombre[contador] + " $" + precio[contador]);
                    }
                    //Algoritmo para eliminar datos del array
                    case 3 -> {
                        System.out.println("\n\n ELIMINAR COMIDA");
                        System.out.print("¿Que comida desea eliminar? \n -> ");
                        int indice = consola.nextInt();
                        precio[indice - 1] = 0;
                        nombre[indice - 1] = null;
                    }
                    case 4 -> {
                        //Algoritmo para revisar
                        System.out.println("\n\n REVISAR BEBIDAS");
                        for (int i = 0; i < bebida.length; i++) {
                            if (bebida[i] != null) {
                                System.out.println((i + 1) + " bebida: " + bebida[i] + " costo: $" + costo[i]);
                            }
                        }
                    }
                    //Algoritmo para integrar datos al array
                    case 5 -> {
                        System.out.println("\n\n INTREGACION DE BEBIDAS");
                        System.out.println("\n\n INTEGRAR COMIDA");
                        for (int i = 0; i < bebida.length; i++) {
                            if (bebida[i] == null) {
                                contador = i;
                                break;
                            }
                        }
                        System.out.print("""
                                         nueva bebida: 
                                         nombre: """);
                        bebida[contador] = consola.next();
                        System.out.print("costo: ");
                        costo[contador] = consola.nextDouble();
                        System.out.println("LA INTEGRACION FUE UN EXITO: " + bebida[contador] + " $" + costo[contador]);
                    }
                    //Algoritmo para eliminar datos del array
                    case 6 -> {
                        System.out.print("¿Que bebida desea eliminar? \n -> ");
                        int indice = consola.nextInt();
                        costo[indice-1] = 0; 
                        bebida[indice-1]= null;
                    }
                    //Algoritmo para revisar
                    case 7 -> {
                        System.out.println("\n\n REVISAR EL PERSONAL");
                        for (int i = 0; i < empleado.length; i++) {
                            if (empleado[i] != null) {
                                System.out.println("cedula " + (i + 1) + " nombre: " + empleado[i] + " ocupacion: " + ocupacion[i]);
                            }
                        }
                    }
                    //Algoritmo para integrar datos al array
                    case 8 -> {
                        System.out.println("\n\n ALTA DE PERSONAL");
                        for (int i = 0; i < empleado.length; i++) {
                            if (empleado[i] == null) {
                                contador = i;
                                break;
                            }
                        }
                        System.out.print("""
                                         nuevo empleado: 
                                         nombre: """);
                        empleado[contador] = consola.next();
                        System.out.print("ocupacion: ");
                        ocupacion[contador] = consola.next();
                        System.out.println("LA ALTA FUE UN EXITO: " + empleado[contador] + " ocupacion: " + ocupacion[contador]);
                    }
                    case 9 -> {
                        //Algoritmo para eliminar datos del array
                        System.out.println("\n\n BAJA DE PERSONAL");
                        System.out.print("¿Que empleado desea eliminar? \n -> ");
                        int indice = consola.nextInt();
                        ocupacion[indice - 1] = null;
                        empleado[indice - 1] = null;
                    }
                    //Salida del sistema
                    case 10 ->
                        System.out.println("\n\n GRACIAS POR VISITARNOS");

                    default ->
                        System.out.println("OPCION INDICADA INCORRECTA");
                }
                contador2 ++;
            } while (opcion != 10);
        } catch (Exception e) {
            //Revision de errores
            System.out.println("Ocurrio un error");
            System.out.println("Informacion: " + e);
        }
    }
}
