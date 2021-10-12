import java.util.Scanner;
public class Ejercicio3punto14{
  static Scanner sc = new Scanner(System.in); 


static void NotaEnLetras (){
  //Definir variables
  int calif=0;
  String Enletra="";
  //Datos de entrada
  System.out.println("Ingrese su calificación de 0 a 10:");
  calif=sc.nextInt();
  //Proceso
  if (calif==10){Enletra="A";
  }else if(calif==9){Enletra="B";
  }else if(calif==8){Enletra="C";
  }else if(calif==7 || calif==6){Enletra="D";
  }else if(calif<=5 && calif>=0){Enletra="F";
  }else if(calif>=11 || calif<0){System.out.println("La nota no esta dentro del rango de calificación..Intente de nuevo");
  }
  
  //Datos de Salida
  System.out.println("Su calificación correspondiente es:"+Enletra);
  
}

public static void main(String[] args) {
    NotaEnLetras();}
}