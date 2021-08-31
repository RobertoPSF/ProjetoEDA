public class BubbleAlfabetico extends Escrever{
    public static void bubbleSortAlfabetico(Dados[] vetor){
		long startTime = System.nanoTime();
		boolean troca = true;                            
		Dados aux;                                         
		while (troca) {                                  
		  troca = false;                                 
			for (int i = 0; i < vetor.length - 2; i++) { 
				if (deAccent(vetor[i].getCidade()).compareTo(deAccent(vetor[i + 1].getCidade())) > 0) {            
					aux = vetor[i];                       
					vetor[i] = vetor[i + 1];              
					vetor[i + 1] = aux;                   
					troca = true;                         
				}
			}
		}
		long totalTime = System.nanoTime() - startTime;
        System.out.println("BubbleSort para ordem alfabética para o caso médio: " + (totalTime) + " milisegundos");
		String path = "bSort_ordena_cidades_medio.csv";
        escreverCsv(vetor, path);
		bubbleSortAlfabeticoMelhor(vetor);
	}

	public static void bubbleSortAlfabeticoMelhor(Dados[] vetor){
		long startTime = System.nanoTime();
		boolean troca = true;                            
		Dados aux;                                         
		while (troca) {                                  
		  troca = false;                                 
			for (int i = 0; i < vetor.length - 2; i++) { 
				if (deAccent(vetor[i].getCidade()).compareTo(deAccent(vetor[i + 1].getCidade())) > 0) {            
					aux = vetor[i];                       
					vetor[i] = vetor[i + 1];              
					vetor[i + 1] = aux;                   
					troca = true;                         
				}
			}
		}
		long totalTime = System.nanoTime() - startTime;
        System.out.println("BubbleSort para ordem alfabética para o melhor caso: " + (totalTime) + " milisegundos");
		String path = "bSort_ordena_cidades_melhor.csv";
        escreverCsv(vetor, path);
		bubbleSortAlfabeticoPior(vetor);
	}

	public static void bubbleSortAlfabeticoPior(Dados[] vetor){
		long startTime = System.nanoTime();
		boolean troca = true;                            
		Dados aux;                                         
		while (troca) {                                  
		  troca = false;                                 
			for (int i = 0; i < vetor.length - 2; i++) { 
				if (deAccent(vetor[i].getCidade()).compareTo(deAccent(vetor[i + 1].getCidade())) < 0) {            
					aux = vetor[i];                       
					vetor[i] = vetor[i + 1];              
					vetor[i + 1] = aux;                   
					troca = true;                         
				}
			}
		}
		long totalTime = System.nanoTime() - startTime;
        System.out.println("BubbleSort para ordem alfabética para o pior caso: " + (totalTime) + " milisegundos");
		String path = "bSort_ordena_cidades_pior.csv";
        escreverCsv(vetor, path);
	}
}
