package atividadecurso;

import java.util.Scanner;

public class Exec6 {

public static void main(String[]args) {

Scanner scanner = new Scanner(System.in);

System.out.println("digite umm número de 1 a 5:");
int numb = scanner.nextInt();

scanner.close();

switch(numb) {

case 1:
	System.out.println("UM\n");
	break;
	
case 2:
	System.out.println("DOIS\n");
	break;
	
case 3:
	System.out.println("TRÊS\n");
	break;
	
case 4:
	System.out.println("QUATRO\n");
	break;
	
case 5:
	System.out.println("CINCO\n");
	break;
	
	default:
		System.out.println("NÚMERO INVÁLIDO\n");

}
}

}
