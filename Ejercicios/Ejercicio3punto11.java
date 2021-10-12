import java.util.Scanner;
public class Ejercicio3punto11{
  static Scanner sc = new Scanner(System.in); 


static void bonoporAntiguedad (){
  //Definir variables
  int cantidadaños=0, resultado=0;
  //Datos de entrada
  System.out.println("Ingrese los años de trabajo en números:");
  cantidadaños=sc.nextInt();
  //Proceso
  if(cantidadaños==1){resultado=100;
  }else if(cantidadaños==2){resultado=200;
  }else if(cantidadaños==3){resultado=300;  
  }else if(cantidadaños==4){resultado=400;  
  }else if(cantidadaños==5){resultado=500;  
  }else if(cantidadaños>5){resultado=1000;  
  }else {System.out.println("Los años son incompatibles..intente de nuevo");
  }
  //Datos de salida
  System.out.println("El bono que le corresponde es de:"+resultado+"$");
}
  public static void main(String[] args) {
    bonoporAntiguedad();}
}