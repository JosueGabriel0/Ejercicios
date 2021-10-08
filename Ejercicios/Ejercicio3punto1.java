import java.util.Scanner;
public class Ejercicio3punto1 {
  static Scanner sc = new Scanner(System.in);


  static void votacion (){
  //Definir variables 
  int edad=0; 
  String resultado="";
  //Datos de entrada
  System.out.println("Ingrese su edad:");
  edad=sc.nextInt();
  //Proceso
  if(edad>=18){resultado="Usted Si Puede Votar";
  }else if(edad<18){resultado="Usted No Puede Votar";
  }
  //Datos de Salida
  System.out.println(resultado);

  }

public static void main(String[] args) {
    votacion();}
}