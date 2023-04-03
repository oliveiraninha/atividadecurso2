package atividadecurso;

import java.util.Scanner;

public class Exec3 {

public static void main(String[]args) {

Scanner input = new Scanner(System.in);

 System.out.println("Digite um número de 1 a 7:");
 int numero = input.nextInt();
 
 if(numero == 1) {
	System.out.println("Domingo\n"); 
	
	
 }else if(numero == 2) {
	 System.out.println("Segunda\n");
	 
 }else if(numero == 3) {
	 System.out.println("Terça\n");
	 
 }else if(numero == 4) {
	 System.out.println("Quarta\n");
	 
 }else if(numero == 5) {
	 System.out.println("Quinta\n");
	 
 }else if(numero == 6) {
	 System.out.println("Sexta\n");
	 
 }else if(numero == 7) {
	 System.out.println("Sabádo\n");
 }else {
	 System.out.println("número inválido!!\n");
 }
}


}
