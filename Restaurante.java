package test;

import java.util.Scanner;

public class Restaurante {
    public static Scanner consola = new Scanner(System.in);

    public static void main(String[] args) {
        //Inicializacion de variables
        //Inicializacion de Arrays(Arreglos unidimencionales)
        String nombre[] = new String[10];
        String empleado[] = new String[10];
        String ocupacion[] = new String[10];
        String bebida[] = new String[10];
        double costo[] = new double[10];
        double precio[] = new double[10];
        
        //inicializacion de contadores
        int opcion;
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
                System.out.print("""
                                 1. REVISAR MENU 
                                 2. INTEGRAR COMIDA 
                                 3. ELIMINAR COMIDA 
                                 4. REVISAR BEBIDAS 
                                 5. INTEGRACION DE BEBIDAS 
                                 6. ELIMINACION DE BEBIDAS 
                                 7. REVISAR EL PERSONAL 
                                 8. ALTA DE PERSONAL 
                                 9. BAJA DE PERSONAL 
                                 10. SALIR 
                                 ->  """);
                opcion = consola.nextInt();
                switch (opcion) {
                    //Utilizamos casos para cada uno de las descripciones del menu
                    case 1 -> {
                        System.out.println("\n\n REVISAR MENU");
                        verProductos(nombre, precio);
                    }
                    case 2 -> {
                        System.out.println("\n\n INTEGRAR COMIDA");
                        agregarProdutos(nombre, precio);
                    }
                    case 3 -> {
                        System.out.println("\n\n ELIMINAR COMIDA");
                        eliminarProductos(nombre, precio);
                    }
                    case 4 -> {
                        System.out.println("\n\n REVISAR BEBIDAS");
                        verProductos(bebida, costo);
                    }
                    case 5 -> {
                        System.out.println("\n\n INTREGACION DE BEBIDAS");
                        agregarProdutos(bebida, costo);
                    }
                    case 6 -> {
                        eliminarProductos(bebida, costo);
                    }
                    case 7 -> {
                        System.out.println("\n\n REVISAR EL PERSONAL");
                        verPersonal(empleado, ocupacion);
                    }
                    //Algoritmo para integrar datos al array
                    case 8 -> {
                        System.out.println("\n\n ALTA DE PERSONAL");
                        agregarPersonal(empleado, ocupacion);
                    }
                    case 9 -> {
                        System.out.println("\n\n BAJA DE PERSONAL");
                        System.out.print("¿Que indice desea eliminar? \n -> ");
                        int indice = consola.nextInt();
                        nombre[indice - 1] = null;
                        ocupacion[indice - 1] = null;
                    }
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
    //Creación de funciones para implementacion en el menú
    public static void verPersonal(String var[], String var2[]){
        for (int i = 0; i < var.length; i++) {
            if (var[i] != null) {
                System.out.println("cedula " + (i + 1) + " nombre: " + var[i] + " ocupacion: " + var2[i]);
            }
        }
    }
    //Listar productos
    public static void verProductos(String name[], double precio[]){
        for (int i = 0; i < name.length; i++) {
            if (name[i] != null) {
                System.out.println("["+(i + 1)+"] "+ name[i] + " precio: $" + precio[i]);
            }
        }
    }
    //Utilizar contador
    public static int contador(String var[]){
        int contador  =0;
        for (int i = 0; i < var.length; i++) {
            if (var[i] == null) {
                contador = i;
                break;
            }
        }
        return  contador;
    }
    //Agregar productos
    public static void agregarProdutos(String var[], double var2[]){
        int contador = contador(var);
        System.out.print("nombre: ");
        var[contador] = consola.next();
        System.out.print("costo: ");
        var2[contador] = consola.nextDouble();
        System.out.println("LA INTEGRACION FUE UN EXITO: " + var[contador] + " $" + var2[contador]);
    }
    //Agregar personal
    public static void agregarPersonal(String var[], String var2[]){
        int contador = contador(var);
        System.out.print("nuevo empleado:\n" + "nombre: ");
       var[contador] = consola.next();
       System.out.print("ocupacion: ");
       var2[contador] = consola.next();
       System.out.println("LA ALTA FUE UN EXITO: " + var[contador] + " ocupacion: " + var2[contador]);
    }
    //Eliminar productos
    public static void eliminarProductos(String nombre[], double precio[]){
        System.out.print("¿Que indice desea eliminar? \n -> ");
        int indice = consola.nextInt();
        nombre[indice - 1] = null;
        precio[indice - 1] = 0;
    }
}
