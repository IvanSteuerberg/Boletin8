package boletin8_1;
// @author irodriguezsteuerberg

import java.util.Scanner;

public class Cantidade {
private float cantidade;
private float incremento;
private float cantidadeFinal;

public Cantidade(){    
}
public Cantidade(float cantidade){
this.cantidade=cantidade;
}
public void pedirCantidade(){
Scanner sc=new Scanner(System.in);
    System.out.println("Introduce a cantidade");
cantidade=sc.nextFloat();
}
        
public void comparar(){
if (cantidade<=500){
  incremento=cantidade*0.50f;
  cantidadeFinal=cantidade+incremento; 
}   
else if (cantidade>500 && cantidade<=1000){
  incremento=cantidade*0.07f;
  cantidadeFinal=cantidade+incremento; 
}
else if (cantidade>1000 && cantidade<=5000){
  incremento=cantidade*0.15f;
  cantidadeFinal=cantidade+incremento; 
}
else {
incremento=cantidade*-0.03f;
cantidadeFinal=cantidade+incremento; 
}        
}
public void amosar(){
 System.out.println("A cantidade é: "+cantidade+"\nA cantidade final é: "
    +cantidadeFinal+"\n o incremento é: "+incremento);    
}


}
