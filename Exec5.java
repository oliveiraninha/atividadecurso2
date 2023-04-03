package atividadecurso;

import java.util.Scanner;

public class Exec5 {

public static void main(String[]args) {

Scanner input = new Scanner(System.in);

int numb1, numb2, numb3, temp;

System.out.println("Digite o primeiro número:");
numb1 = input.nextInt();

System.out.println("Digite o segundo número:");
numb2 = input.nextInt();

System.out.println("Digite o terceiro número:");
numb3 = input.nextInt();

if(numb1 > numb2) {
temp = numb1;
numb1 = numb2;
numb2 = temp;

}

if(numb1 > numb3) {
temp = numb1;
numb1 = numb3;
numb3 = temp;
}

if(numb2 > numb3) {
temp = numb2;
numb2 = numb3;
numb3 = temp;
	
}

System.out.println("Os números  em ordem crescente são:" + numb1 + "," + numb2 + "," +numb3);
}

}
