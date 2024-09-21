import java.util.Scanner;

public class Persona {
    static Scanner sc = new Scanner(System.in);
    public String nombre;
    public int edad;
    public char sexo;
    public int peso;
    public int iD;

    //constructor
    public Persona(String nombre, int edad,int peso, char sexo,int iD) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.iD=iD;
    }

    //metodo get que retorna el valor de la id en un tipo int
    public int getId() {
        return iD;
    }
    public int setiD(int iD){
        this.iD = iD;
        return iD;
    }
    //setters y getters de Sexo
    public char getSexo() {// obtiene
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }//modifica
    //setters y getters de Edad
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    //setters y getters de Nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //setters y getters de Peso
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    //
}
