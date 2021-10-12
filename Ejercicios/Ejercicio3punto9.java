import java.util.Scanner;
public class Ejercicio3punto9 {
  static Scanner sc = new Scanner(System.in);


static void segurosparaAutos(){
//Declaracion de Variables
String plan="", alcohol="", lentes="", enfermedad="";
int costofinal=0, edad=0;
//Datos de Entrada
System.out.println("Ingrese el tipo de plan que desee (A,B):");
plan=sc.next().toUpperCase();
System.out.println("¿Usted tiene por habito beber alcohol? responda con SI ó NO (EN MAYUSCULAS):");
alcohol=sc.next().toUpperCase();
System.out.println("¿Usted usa lentes? responda con SI ó NO (EN MAYUSCULAS):");
lentes=sc.next().toUpperCase();
System.out.println("¿Usted sufre de alguna enfermedad? responda con SI ó NO (EN MAYUSCULAS):");
enfermedad=sc.next().toUpperCase();
System.out.println("Ingrese su edad:");
edad=sc.nextInt();
//Proceso
if (plan.equals("A") || alcohol.equals("SI") || lentes.equals("SI") || enfermedad.equals("SI") || edad>40) {costofinal= 1200+(1200*10)/100+(1200*5)/100+(1200*5)/100+(1200*20)/100;

}else if (plan.equals("A") || alcohol.equals("SI") || lentes.equals("SI") || enfermedad.equals("SI") || edad<40) {costofinal= 1200+(1200*10)/100+(1200*5)/100+(1200*5)/100+(1200*10)/100;

}else if (plan.equals("A") || alcohol.equals("NO") || lentes.equals("NO") || enfermedad.equals("NO") || edad>40) {costofinal= 1200+(1200*20)/100; 

}else if (plan.equals("A") || alcohol.equals("NO") || lentes.equals("NO") || enfermedad.equals("NO") || edad<40) {costofinal= 1200+(1200*10)/100;

}else if (plan.equals("A") || alcohol.equals("SI") || lentes.equals("NO") || enfermedad.equals("SI") || edad<40) {costofinal= 1200+(1200*10)/100+(1200*5)/100+(1200*10)/100;

}else if (plan.equals("A") || alcohol.equals("SI") || lentes.equals("NO") || enfermedad.equals("SI") || edad>40) {costofinal= 1200+(1200*10)/100+(1200*5)/100+(1200*20)/100; 

}else if (plan.equals("A") || alcohol.equals("SI") || lentes.equals("NO") || enfermedad.equals("NO") || edad<40) {costofinal= 1200+(1200*10)/100+(1200*10)/100;

}else if (plan.equals("A") || alcohol.equals("SI") || lentes.equals("NO") || enfermedad.equals("NO") || edad>40) {costofinal= 1200+(1200*10)/100+(1200*20)/100; 

}else if (plan.equals("A") || alcohol.equals("NO") || lentes.equals("SI") || enfermedad.equals("SI") || edad<40) {costofinal= 1200+(1200*5)/100+(1200*5)/100+(1200*10)/100;

}else if (plan.equals("A") || alcohol.equals("NO") || lentes.equals("SI") || enfermedad.equals("SI") || edad>40) {costofinal= 1200+(1200*5)/100+(1200*5)/100+(1200*20)/100; 

}else if (plan.equals("A") || alcohol.equals("NO") || lentes.equals("SI") || enfermedad.equals("NO") || edad<40) {costofinal= 1200+(1200*5)/100+(1200*10)/100;

}else if (plan.equals("A") || alcohol.equals("NO") || lentes.equals("SI") || enfermedad.equals("NO") || edad>40) {costofinal= 1200+(1200*5)/100+(1200*20)/100; 

}else if (plan.equals("B") || alcohol.equals("SI") || lentes.equals("SI") || enfermedad.equals("SI") || edad>40) {costofinal= 950+(950*10)/100+(950*5)/100+(950*5)/100+(950*20)/100;

}else if (plan.equals("B") || alcohol.equals("SI") || lentes.equals("SI") || enfermedad.equals("SI") || edad<40) {costofinal= 950+(950*10)/100+(950*5)/100+(950*5)/100+(950*10)/100;

}else if (plan.equals("B") || alcohol.equals("NO") || lentes.equals("NO") || enfermedad.equals("NO") || edad>40) {costofinal= 950+(950*20)/100; 

}else if (plan.equals("B") || alcohol.equals("NO") || lentes.equals("NO") || enfermedad.equals("NO") || edad<40) {costofinal= 950+(950*10)/100;

}else if (plan.equals("B") || alcohol.equals("SI") || lentes.equals("NO") || enfermedad.equals("SI") || edad<40) {costofinal= 950+(950*10)/100+(950*5)/100+(950*10)/100;

}else if (plan.equals("B") || alcohol.equals("SI") || lentes.equals("NO") || enfermedad.equals("SI") || edad>40) {costofinal= 950+(950*10)/100+(950*5)/100+(950*20)/100; 

}else if (plan.equals("B") || alcohol.equals("SI") || lentes.equals("NO") || enfermedad.equals("NO") || edad<40) {costofinal= 950+(950*10)/100+(950*10)/100;

}else if (plan.equals("B") || alcohol.equals("SI") || lentes.equals("NO") || enfermedad.equals("NO") || edad>40) {costofinal= 950+(950*10)/100+(950*20)/100; 

}else if (plan.equals("B") || alcohol.equals("NO") || lentes.equals("SI") || enfermedad.equals("SI") || edad<40) {costofinal= 950+(950*5)/100+(950*5)/100+(950*10)/100;

}else if (plan.equals("B") || alcohol.equals("NO") || lentes.equals("SI") || enfermedad.equals("SI") || edad>40) {costofinal= 950+(950*5)/100+(950*5)/100+(950*20)/100; 

}else if (plan.equals("B") || alcohol.equals("NO") || lentes.equals("SI") || enfermedad.equals("NO") || edad<40) {costofinal= 950+(950*5)/100+(950*10)/100;

}else if (plan.equals("B") || alcohol.equals("NO") || lentes.equals("SI") || enfermedad.equals("NO") || edad>40) {costofinal= 950+(950*5)/100+(950*20)/100; 

}
//Datos de salida
System.out.println("El costo que deberá pagar por contratar una póliza es de:"+costofinal);



}


public static void main(String[] args){
  segurosparaAutos();}

}