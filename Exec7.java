package atividadecurso;

import java.util.Scanner;

public class Exec7 {

public static void main(String[]args) {

Scanner scanner = new Scanner(System.in);

System.out.println("digite o valor do veículo:");
double valorveiculo = scanner.nextDouble();

System.out.println("digite o tipo de combustível (álcool, gasolina ou diesel) ");
String combustivel = scanner.next();

double desconto  = 0;

switch (combustivel) {

case "álcool":
	desconto = valorveiculo * 0.25;
	break;
	
case "gasolina":
	desconto = valorveiculo *0.21;
	break;
	
case "diesel":
	desconto = valorveiculo *0.14;
	break;
	default:
		System.out.println("Combustível Inválido!");
}

double valorfinal = valorveiculo - desconto;

System.out.println("Desconto: R$" + desconto);

System.out.println("Valor a ser pago: R$" + valorfinal );

}

}
