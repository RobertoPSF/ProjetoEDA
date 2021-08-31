public class BubbleCasos extends Escrever{
    public static void bubbleSortCasos(Dados[] vetor){
		long startTime = System.nanoTime();
		boolean troca = true;                            
		Dados aux;                                         
		while (troca) {                                  
		  troca = false;                                 
			for (int i = 0; i < vetor.length - 2; i++) { 
				if (vetor[i].getConfirmados() > vetor[i + 1].getConfirmados()) {            
					aux = vetor[i];                       
					vetor[i] = vetor[i + 1];              
					vetor[i + 1] = aux;                   
					troca = true;                         
				}
			}
		}
		long totalTime = System.nanoTime() - startTime;
        System.out.println("BubbleSort para quantidade de casos acumulados para o caso médio: " + (totalTime) + " milisegundos");
		String path = "bSort_ordena_casos_medio.csv";
        escreverCsv(vetor, path);
		bubbleSortCasosMelhor(vetor);
	}

	public static void bubbleSortCasosMelhor(Dados[] vetor){
		long startTime = System.nanoTime();
		boolean troca = true;                            
		Dados aux;                                         
		while (troca) {                                  
		  troca = false;                                 
			for (int i = 0; i < vetor.length - 2; i++) { 
				if (vetor[i].getConfirmados() > vetor[i + 1].getConfirmados()) {            
					aux = vetor[i];                       
					vetor[i] = vetor[i + 1];              
					vetor[i + 1] = aux;                   
					troca = true;                         
				}
			}
		}
		long totalTime = System.nanoTime() - startTime;
        System.out.println("BubbleSort para quantidade de casos acumulados para o melhor caso: " + (totalTime) + " milisegundos");
		String path = "bSort_ordena_casos_melhor.csv";
        escreverCsv(vetor, path);
	}

	public static void bubbleSortCasosPior(Dados[] vetor){
		long startTime = System.nanoTime();
		boolean troca = true;                            
		Dados aux;                                         
		while (troca) {                                  
		  troca = false;                                 
			for (int i = 0; i < vetor.length - 2; i++) { 
				if (vetor[i].getConfirmados() < vetor[i + 1].getConfirmados()) {            
					aux = vetor[i];                       
					vetor[i] = vetor[i + 1];              
					vetor[i + 1] = aux;                   
					troca = true;                         
				}
			}
		}
		long totalTime = System.nanoTime() - startTime;
        System.out.println("BubbleSort para quantidade de casos acumulados para o pior caso: " + (totalTime) + " milisegundos");
		String path = "bSort_ordena_casos_pior.csv";
        escreverCsv(vetor, path);
	}
}
