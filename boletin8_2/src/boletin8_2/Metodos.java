package boletin8_2;

import java.util.Scanner;

/**
 *
 * @author irodriguezsteuerberg
 */
public class Metodos {
private float prezoUnitario;
private int numeroVentas;
private float desconto;
private float total;

public void pedirDatos(){
Scanner sc = new Scanner(System.in);
    System.out.println("Introduce o numero de ventas:");
    numeroVentas=sc.nextInt();
    System.out.println("Introduce o prezo do artigo vendido:");
    prezoUnitario=sc.nextInt();
}
public void comparar(){
if (numeroVentas<100){
desconto=0;
total=prezoUnitario*numeroVentas;
}
else if (numeroVentas>=100 && numeroVentas<200)
   if (prezoUnitario>4000){
       total=prezoUnitario*numeroVentas*0.95f;  
       desconto=(prezoUnitario*numeroVentas)-total;
   }
   else {
   total=prezoUnitario*numeroVentas*0.98f;
   desconto=(prezoUnitario*numeroVentas)-total;
   }
else  
    if (prezoUnitario>4000){
    total=prezoUnitario*numeroVentas*0.90f;
    desconto=(prezoUnitario*numeroVentas)-total;
    }
    else {
    total=prezoUnitario*numeroVentas*0.92f;
    desconto=(prezoUnitario*numeroVentas)-total;    
    }    
    System.out.println("O prezo unitario é: "+prezoUnitario
    +"\nO numero de ventas é: "+numeroVentas
    +"\nO desconto é de "+desconto+" euros"
    +"\nO total é de "+total+" euros");           

}

}
