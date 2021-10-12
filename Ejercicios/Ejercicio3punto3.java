import java.util.Scanner;
public class Ejercicio3punto3 {
  static Scanner sc = new Scanner(System.in);


static void montoYregalo (){
//Declaracion de variables
int montoDispo=0;
String resul="";
//Datos de Entrada
System.out.println("Ingrese el monto Disponible:");
montoDispo=sc.nextInt();
//Proceso
if (montoDispo<1){resul="No hay regalo(s) con ese monto";
}else if (montoDispo<=10 && montoDispo>=1){resul="Tipo de regalo(s) disponible: Tarjeta";
}else if (montoDispo>=11 && montoDispo<=100){resul="Tipo de regalo(s) disponible: Tarjeta/Chocolate";
}else if (montoDispo>=101 && montoDispo<=250){resul="Tipo de regalo(s) disponible: Tarjeta/Chocolate/Flores";
}else if (montoDispo>=251){resul="Tipo de regalo(s) disponible: Tarjeta/Chocolate/Flores/Anillo";
}
//Datos de Salida
System.out.println(resul);

}

public static void main(String[] args) {
    montoYregalo();}
}