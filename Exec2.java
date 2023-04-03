package atividadecurso;

import java.util.Scanner;

public class Exec2 {

public static void main(String[] args) {

Scanner leitor = new Scanner(System.in);

System.out.println("Digite o primeiro número:");
double numb1 = leitor.nextDouble();

System.out.println("Digite o segundo número:");
double numb2 = leitor.nextDouble();

System.out.println("Escolha uma operação: (M)édia, (S)oma, (P)roduto, (D)ivisão\n");
char operacao = leitor.next().charAt(0);

double resultado = 0;

switch (operacao) {

case 'M':
 resultado = (numb1 + numb2) / 2;
  System.out.println("A média entre numb1 e numb2 é:" + resultado);
  break;
  
case 'S':
if (numb1 > numb2) {
resultado = numb1 - numb2;
  
}else {
 resultado = numb2 -  numb1;
 
}
 System.out.println("A diferença entre o numb1 e o numb2 é:" + resultado);
 break;
 
case 'P':
	resultado = numb2 * numb2;
	 System.out.println("O produto entre o numb1 e numb2 é:" + resultado);
	 break;
	 
case 'D':
 if( numb2 !=0 ) {
  resultado = numb1 / numb2;
   System.out.println("A divisão entre numb1 e  numb2 é:" + resultado);
 }else {
	 System.out.println("Divisão por zero não é possível!!\n");
 }
 break;
 default:
	 System.out.println("Operação inválida!!\n");
	
	
	
}

leitor.close();



  



}


}






