
package ejerciciosdescuento;

/**
 *
 * @author Danny Nicolás Gutiérrez Mejía
 */
public class Incrementos {

    
    public static void main(String[] args) {
        int a = 5;
        int b = a++;
        /*En post incremento o sea (variable++) primero se toma la variable y se le suma uno pero antes de sumarle uno se le entrega la variable tal
        y como se asigno a b, si fuese pre incremento (++variable) primero se suma uno y despues le asigna el resultado
        a c*/
        int c = 5;
        int d = ++c;
        
        System.out.println("a =" + a);
        System.out.println("b =" + b);
        System.out.println("c =" + c);
        System.out.println("d =" + d);
    }
    static{
       int a = 7;
       int b = a++;
       int suma, resta, multiplicacion;
       suma=a+b;
       resta=a-b;
       multiplicacion=a*b;
        System.out.println("suma: "+suma);
        System.out.println("resta: "+resta);
        System.out.println("mutliplicacion: "+multiplicacion);
        /*Como estamos usando postincremento "a" primero le otorga su valor a "b" es decir 7
         justo despues de eso aumenta su valor a 8, por eso los resultados son 15, 1 y 56 respectivamente
         si usaramos el pre incremento "a" primero toma el valor de 8 y despues le asigna ese valor a "b"
         y los resultados cambiarian a 16, 0 y 64 respectivamente*/
             }
    static{
       for(int  a=4, h=a+7; a<10; a++, h=3*a){
           System.out.println("a= "+a+"h= "+h);
           /* la verdad esto no lo entendí profesor, me guié por la parte del for en el archivo que nos mandó
            pero no me quedó claro*/

            
        }
     }
}