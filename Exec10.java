package atividadecurso;

import java.util.Scanner;

public class Exec10 {

public static void main(String[]args) {

Scanner scanner = new Scanner(System.in);

System.out.println("Digite a quantidade de passos:");

int qtdpassos = scanner.nextInt();

for(int i = 1; i <= qtdpassos; i++) {
	
if(i%5 == 1 || i%5 == 2) {
	
System.out.println("Pra lá");	


		
}

else if (i%5 == 3 || i%5 == 4) {

System.out.println("Pra cá");	
}


else {

System.out.println("Dá uma giradinha");	


}


}

scanner.close();

}

}
