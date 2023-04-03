package atividadecurso;

import java.util.Scanner;

public class Exec4 {

public static void main(String[]args) {

Scanner input = new Scanner(System.in);

System.out.println("Informe o plano de trabalho do funcionário (A, B, C):");
String plano = input.nextLine();

System.out.println("Informe o salário atual do funcionário:");
double salarioatual = input.nextDouble();

double aumento = 0;
if (plano.equalsIgnoreCase("A")) {
	aumento = salarioatual * 0.1;
	
}else if(plano.equalsIgnoreCase("B")) {
	aumento = salarioatual * 0.15;
	
}else if(plano.equalsIgnoreCase("C")) {
	aumento = salarioatual * 0.2;
}

double novosalario = salarioatual + aumento;
  System.out.println("O novo salário do funcionário é R$" + novosalario);





}

}
