import java.util.Scanner;
public class Ejercicio3punto19 {
  static Scanner sc = new Scanner(System.in);


static void tipoDeVacuna (){
  //Declaracion de variables
  int sexo=0, edad=0;
  String tipodevacuna="";
  //Datos de entrada
  System.out.println("Ingrese su sexo (1 si es hombre y 2 si es mujer):");
  sexo=sc.nextInt();
  System.out.println("Ingrese su edad:");
  edad=sc.nextInt();
  //Proceso
   if (edad>=70){switch(sexo) {
   case 1: tipodevacuna="C";break;
   case 2: tipodevacuna="C";break;
   default:
      tipodevacuna="No existente(Asegurese de solo insertar 1 ó 2)";
  }
  }else if (edad>=16 && edad<=69 && sexo==2){switch(sexo) {
   case 2: tipodevacuna="B";break;
   default:
      tipodevacuna="No existente(Asegurese de solo insertar 1 ó 2)";
  }
  }else if (edad>=16 && edad<=69 && sexo==1){switch(sexo) {
   case 1: tipodevacuna="A";break;
   default:
      tipodevacuna="No existente(Asegurese de solo insertar 1 ó 2)";
  }
  }else if (edad<16){switch(sexo) {
   case 1: tipodevacuna="A";break;
   case 2: tipodevacuna="A";break;
   default:
      tipodevacuna="No existente(Asegurese de solo insertar 1 ó 2)";
  }
  }
  //Datos de salida
  System.out.println("Su tipo de vacuna es: "+tipodevacuna);
  }

public static void main(String[] args) {
    tipoDeVacuna();}
}
