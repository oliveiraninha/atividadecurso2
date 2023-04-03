package atividadecurso;

import java.util.Scanner;

public class Exec1 {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("Digite um número inteiro entre 1 e 12:");
int numero = input.nextInt();

if (numero == 1) {
	System.out.println("Janeiro!!\n");
	
}else if (numero == 2) {
	System.out.println("Fevereiro!!\n");
}else if (numero == 3) {
	System.out.println("Março!!\n");
}else if (numero == 4) {
	System.out.println("Abril!!\n");
}else if (numero == 5) {
	System.out.println("Maio!!\n");
}else if (numero == 6) {
	System.out.println("Junho!!\n");
}else if (numero == 7) {
	System.out.println("Julho!!\n");
}else if (numero == 8) {
	System.out.println("Agosto!!\n");
}else if  (numero == 9) {
	System.out.println("Setembro!!\n");
}else if (numero == 10) {
	System.out.println("Outubro!!\n");
}else if (numero == 11) {
	System.out.println("Novembro!!\n");
}else if (numero == 12) {
	System.out.println("Dezembro!!\n");
}else {
	System.out.println("Número inválido!!\n");
}
	
} 

}
