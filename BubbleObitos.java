public class BubbleObitos extends Escrever{
    public static void bubbleSortObitos(Dados[] vetor){
		long startTime = System.nanoTime();
		boolean troca = true;                            
		Dados aux;                                         
		while (troca) {                                  
		  troca = false;                                 
			for (int i = 0; i < vetor.length - 2; i++) { 
				if (vetor[i].getObitosAcumulados() > vetor[i + 1].getObitosAcumulados()) {            
					aux = vetor[i];                       
					vetor[i] = vetor[i + 1];              
					vetor[i + 1] = aux;                   
					troca = true;                         
				}
			}
		}
		long totalTime = System.nanoTime() - startTime;
        System.out.println("BubbleSort para quantidade de óbitos acumulados para o caso médio: " + (totalTime) + " milisegundos");
		String path = "bSort_ordena_obitos_medio.csv";
        escreverCsv(vetor, path);
		bubbleSortObitosMelhor(vetor);
	}

	public static void bubbleSortObitosMelhor(Dados[] vetor){
		long startTime = System.nanoTime();
		boolean troca = true;                            
		Dados aux;                                         
		while (troca) {                                  
		  troca = false;                                 
			for (int i = 0; i < vetor.length - 2; i++) { 
				if (vetor[i].getObitosAcumulados() > vetor[i + 1].getObitosAcumulados()) {            
					aux = vetor[i];                       
					vetor[i] = vetor[i + 1];              
					vetor[i + 1] = aux;                   
					troca = true;                         
				}
			}
		}
		long totalTime = System.nanoTime() - startTime;
        System.out.println("BubbleSort para quantidade de óbitos acumulados para o melhor caso: " + (totalTime) + " milisegundos");
		String path = "bSort_ordena_obitos_melhor.csv";
        escreverCsv(vetor, path);
		bubbleSortObitosPior(vetor);
	}
	
	public static void bubbleSortObitosPior(Dados[] vetor){
		long startTime = System.nanoTime();
		boolean troca = true;                            
		Dados aux;                                         
		while (troca) {                                  
		  troca = false;                                 
			for (int i = 0; i < vetor.length - 2; i++) { 
				if (vetor[i].getObitosAcumulados() < vetor[i + 1].getObitosAcumulados()) {            
					aux = vetor[i];                       
					vetor[i] = vetor[i + 1];              
					vetor[i + 1] = aux;                   
					troca = true;                         
				}
			}
		}
		long totalTime = System.nanoTime() - startTime;
        System.out.println("BubbleSort para quantidade de óbitos acumulados para o pior caso: " + (totalTime) + " milisegundos");
		String path = "bSort_ordena_obitos_pior.csv";
        escreverCsv(vetor, path);
	}
}
