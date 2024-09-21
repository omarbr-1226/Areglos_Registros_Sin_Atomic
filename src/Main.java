import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static ArrayList<Persona> personas = new ArrayList<>();
    public static void main(String[] args) {
        int opcion;
        /*NUEVO MENU INCORPORANDO METODOS*/
        char resp='s';
        do {
            System.out.println("---Menu---");
            System.out.println(" 1.- Añadir\n 2.- Eliminar\n 3.- Consulta\n 4.- Editar\n 5.- Informe\n 6.- Salir\n");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    Añadir();
                    break;
                case 2:
                    Eliminar();
                    break;
                case 3:
                    Consulta();
                    break;
                case 4:
                    Editar();
                    break;
                case 5:
                    Informe();
                    break;
                case 6:
                    //fin
                    break;
            }
        }while (resp == 's' || resp == 'S');

    }
    //Método para Añadir
    public static void Añadir(){
        System.out.println("ingresa tu ID, Sugerencia: 247001xx");
        int ID=sc.nextInt();
        System.out.println("Ingrese el nombre: ");
        String nombre = sc.next();
        System.out.println("Ingresar el edad: ");
        int edad = sc.nextInt();
        System.out.println("Ingresar el peso: ");
        int pesos = sc.nextInt();
        System.out.println("Ingresar el sexo: ");
        char sexo = sc.next().charAt(0);
        System.out.println();
        personas.add( new Persona(nombre, edad, pesos, sexo,ID));//añade al objeto a continuacion del ultimmoelemento
    }
    //Método de Eliminación yaaaaa sirveeeeee noooo tocaarr!!!! traiganme a una mini pekka y curandera y una yare que no es yare :D
    public static void Eliminar(){
        System.out.println("Ingresa el ID: ");
        int Id = sc.nextInt();
        Persona personaEncontrada = buscarPersonaPorID(Id);

        if ( personaEncontrada!= null){
            personas.remove(personaEncontrada);
            System.out.println("Datos eliminados");
        }else {
            System.out.println("Dato no encontrado");
        }
    }
    //Método de Consulta
    public static void Consulta() {
        System.out.println("Ingresa el ID a buscar");//creo que con este se buscara
        int ID =sc.nextInt();
        Persona personaEncontrada   = buscarPersonaPorID(ID); //nos da lo posicion del vector: apoko si
        if (personaEncontrada != null){
            System.out.println(
                    personaEncontrada.getEdad()+" "+
                    personaEncontrada.getNombre() +"\n"+
                    personaEncontrada.getEdad()+"\n"+
                    personaEncontrada.getPeso()+"\n"+
                    personaEncontrada.getSexo());
        }else {
            System.out.println("No se encontro el ID");
        }
    }
    //Método para Editar
    public static void Editar() {
        String nombre;
        int edad,pesos,id;
        char sexo;

        System.out.println("Ingresa el ID: ");
        id = sc.nextInt();
        Persona personaEncontrada = buscarPersonaPorID(id);
        if (personaEncontrada!=null){

            System.out.println("---Que deseas editar---");
            System.out.println(" 1.- Nombre\n 2.- Edad\n 3.- Peso\n 4.- Sexo\n 5.- Todo\n");
            int opcion = sc.nextInt();
            switch(opcion){
                case 1: {
                    System.out.println("Ingresa el nuevo nombre");
                    nombre = sc.next();
                    personaEncontrada.setNombre(nombre);
                    break;
                }
                case 2:{
                    System.out.println("Ingresa la nueva edad");
                    edad = sc.nextInt();
                    personaEncontrada.setEdad(edad);
                    break;
                }
                case 3: {
                    System.out.println("Ingresa el nuevo peso");
                    pesos = sc.nextInt();
                    personaEncontrada.setPeso(pesos);
                    break;
                }
                case 4:{
                    System.out.println("Ingresa el nuevo sexo");
                    sexo = sc.next().charAt(0);
                    personaEncontrada.setSexo(sexo);
                    break;
                }
                case 5:{
                    System.out.println("Ingresa el nuevo nombre");
                    nombre = sc.next();
                    System.out.println("Ingresa la nueva edad");
                    edad = sc.nextInt();
                    System.out.println("Ingresa el nuevo peso");
                    pesos = sc.nextInt();
                    System.out.println("Ingresa el nuevo sexo");
                    sexo = sc.next().charAt(0);
                    personaEncontrada.setNombre(nombre);
                    personaEncontrada.setEdad(edad);
                    personaEncontrada.setPeso(pesos);
                    personaEncontrada.setSexo(sexo);
                    break;
                }
                default:{
                    System.out.println("No se encontro la opcion");
                }
            }
        }else {
            System.out.println("No se encontro el ID");
        }
    }
    //Método para Informe
    public static void Informe(){
        for (Persona persona : personas) {
            System.out.print(persona.getNombre()+" ");
            System.out.print(persona.getEdad()+" ");
            System.out.print(persona.getPeso()+" ");
            System.out.print(persona.getSexo()+"\n");
            System.out.println(persona.getId());
        }
    }
    // Método personalizado para buscar persona por ID
    public static Persona buscarPersonaPorID(int id) {
        for (Persona persona : personas) {
            if (persona.getId() == id) {
                return persona;
            }
        }
       return null;
    }
    //
}