import java.util.Scanner;
/**
 *
 * @author Danny Nicolás Gutiérrez Mejía
 */
public class EjerciciosDescuento {

    public static void main(String[] args) {
        
        //Ejercicio Sistema de Descuentos para un Supermercado
         Scanner sc = new Scanner(System.in);
         System.out.println("Ingrese el precio a pagar: ");
         double valorAPagar = sc.nextDouble();
         double valorDescontado, valorTotal;
         if (valorAPagar<100000) valorDescontado=0;
         else if(valorAPagar<=300000) valorDescontado=valorAPagar*0.10;
         else if(valorAPagar<=500000) valorDescontado=valorAPagar*0.15;
         else  valorDescontado=valorAPagar*0.20;
                 valorTotal=valorAPagar-valorDescontado;
                 System.out.println("Valor descontado es= "+valorDescontado);
                 System.out.println("Total a pagar es= "+valorTotal);
                 
        //Ejercicio Control Inteligente de Acceso a un Conjunto Residencial         
        sc.nextLine();
        /* profe acá tuve un error donde se salteaba todo el codigo de abajo y se arregló solo agregando el
           sc.nextLine de la parte de arriba, esa parte la hice con IA (la linea de codigo 20 nada mas) pero cuando le pregunté porque no entendí
           su explicación, me gustaría que usted me dijera por qué pasa esto*/
        System.out.println("Tiene Tarjeta?: ");
        String tieneTarjeta = sc.nextLine();
        System.out.println("Tiene Tarjeta Activa?: ");
        String tarjetaActiva = sc.nextLine();
        System.out.println("Tiene deudas?: ");
        String deudas = sc.nextLine();
        if (tieneTarjeta.equalsIgnoreCase("si")){
           if (tarjetaActiva.equalsIgnoreCase("si")){
               if (deudas.equalsIgnoreCase("si")){
                System.out.println("No tiene permitida la entrada por deudas");
        }
        }else System.out.println("No tiene permitida la entrada por tarjeta inactiva");
    }else System.out.println("No tiene permitida la entrada por ausencia de tarjetas");
        if(tarjetaActiva.equalsIgnoreCase("si"))
            System.out.println("Tiene el acceso permitido por tener todo en norma");
        
        //Ejercicio Plataforma de Transporte Compartido
        System.out.println("Ingrese calificación: ");
        double calificación = sc.nextDouble();
        System.out.println("Ingrese cantidad de viajes: ");
        int cantidadDeViajes = sc.nextInt();
        System.out.println("Ingrese si tiene disponibilidad: ");
        String disponibilidad = sc.next();
        if (calificación>=4.8&&cantidadDeViajes>500&&disponibilidad.equalsIgnoreCase("si") ){
        System.out.println("Es usted un conductor premium"); 
        }
        else if (calificación>=4.8&&cantidadDeViajes>500||cantidadDeViajes>500&&disponibilidad.equalsIgnoreCase("si")||calificación>=4.8&&disponibilidad.equalsIgnoreCase("si")){
            System.out.println("Usted fue asignado como conductor estandar");
    }
        else System.out.println("No pudo ser asignado por incumplir con los requisitos");           
        
        
        
        //Ejercicio Sistema de Aprobación de Crédito Bancario    
         System.out.println("Digite sus ingresos: ");        
         int ingresos = sc.nextInt();
         System.out.println("Digite el puntaje de credito: ");
         int puntajeDeCredito = sc.nextInt();
         System.out.println("Ingrese cuantos años lleva laborando");
         int añosLaborados = sc.nextInt();
         if (ingresos>5000000&&puntajeDeCredito>750&&añosLaborados>2) {
            System.out.println("Su credito fue aprobado");
    }
        else if ( (ingresos>5000000&&puntajeDeCredito>750) || (puntajeDeCredito>750&&añosLaborados>2) || (ingresos>5000000&&añosLaborados>2) ){
           System.out.println("Su credito está condicionado");  
        }  
        else System.out.println("Su credito no fue aprobado"); 
         
                   
         //Ejercicio Sistema de Viajes de una Aerolínea
         boolean accesoVIP=false;
         System.out.println("Ingrese la cantidad de vuelo hechos: ");
         int cantidadDeVuelos = sc.nextInt();
         System.out.println("Posee una membresia activa?: ");
         String membresía = sc.next();
         String categoría;
         if (cantidadDeVuelos>50&&membresía.equalsIgnoreCase("si")){
          categoría="Oro"; 
         }
         else if(cantidadDeVuelos>=20&&cantidadDeVuelos<=50&&membresía.equalsIgnoreCase("si")){
           categoría="Plata"; 
         }
         else categoría="Basica";
        if(categoría.equalsIgnoreCase("Oro")&&(cantidadDeVuelos>70)){ //profe acá no entiendo por qué tenía que poner tantos parentesis
        accesoVIP=true;
        System.out.println("Tiene acceso VIP: " + (accesoVIP ? "si" : "no"));
        System.out.println("Su categoría es: "+categoría);
         }    
        
}
}