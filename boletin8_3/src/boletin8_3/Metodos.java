package boletin8_3;

import java.util.Scanner;

/**
 *
 * @author irodriguezsteuerberg
 */
public class Metodos {
private int numeroMes;

public void pedirDatos(){
Scanner sc = new Scanner(System.in);
    System.out.println("Introduce o numero do mes");
    numeroMes=sc.nextInt();   
}
public void comparar(){
switch (numeroMes){
    case 1:
        System.out.println("Enero ten 31 días");
        break;
    case 2: 
        System.out.println("Febrero ten 28 días");
        break;
    case 3:
        System.out.println("Marzo ten 31 días");
        break;
    case 4:
        System.out.println("Abril ten 30 días");
        break;    
    case 5:
        System.out.println("Mayo ten 31 días");
        break;   
    case 6:
        System.out.println("Junio ten 30 días");
        break;
    case 7:
        System.out.println("Julio ten 31 días");
        break;    
    case 8:
        System.out.println("Agosto ten 31 días");
        break;
    case 9:
        System.out.println("Septiembre ten 30 días");
        break;    
    case 10:
        System.out.println("Octubre ten 31 días");
        break;
    case 11:
        System.out.println("Novembro ten 30 días");
        break;
    case 12:
        System.out.println("Decembro ten 31 días");
        break;    
}
   
}

}
