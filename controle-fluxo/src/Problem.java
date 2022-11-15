import java.util.Scanner; 
public class Problem {
    /**
     * @param args
     */
    public static void main(String[] args) {
      	Scanner leitor = new Scanner(System.in);
		do {
				System.out.println("Entre com o número da rodada:");
				int N = leitor.nextInt();

				System.out.println("Jogador1, escolha sua opção:");
			  	System.out.println("ataque, pedra ou papel?");	
			  	String jogador1 = leitor.next();
				System.out.println("Jogador2, escolha sua opção:");
				System.out.println("ataque, pedra ou papel?");
				String jogador2 = leitor.next();
			
				if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("ataque")) {
					System.out.println("Aniquilacao mutua");
				}
				else if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("papel")) {
				System.out.println("Ambos venceram");
					}
					else if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("papel")){
				System.out.println("Jogador 1 venceu");
						}
						else if (jogador1.equalsIgnoreCase("pedra") && jogador2.equalsIgnoreCase("papel")){
				System.out.println("Jogador 1 venceu");
							}
							else if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("pedra")){
				System.out.println("Jogador 1 venceu");
								}	
								else if (jogador2.equalsIgnoreCase("ataque") && jogador1.equalsIgnoreCase("papel")){
				System.out.println("Jogador 2 venceu");
									}
									else if (jogador2.equalsIgnoreCase("ataque") && jogador1.equalsIgnoreCase("pedra")){
				System.out.println("Jogador 2 venceu");
										}
										else if (jogador2.equalsIgnoreCase("pedra") && jogador1.equalsIgnoreCase("papel")){
				System.out.println("Jogador 2 venceu");
											}
											else {
				System.out.println("Não houve vencedor");
				System.out.println("");
												}
		}
			while(int i = 0; (i <= N) && (N <= 1000); i++);
		
		
	}
	 
}