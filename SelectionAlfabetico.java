public class SelectionAlfabetico extends Escrever{
    public static void selectionSortAlfabetico(Dados[] array) {
		long startTime = System.nanoTime();
		for (int fixo = 0; fixo < array.length - 1; fixo++) {
			int menor = fixo;
		
			for (int i = menor + 1; i < array.length - 1; i++) {
			   if (deAccent(array[i].getCidade()).compareTo(deAccent(array[menor].getCidade())) < 0) {
				  menor = i;
			   }
			}
			if (menor != fixo) {
			  Dados t = array[fixo];
			  array[fixo] = array[menor];
			  array[menor] = t;
			}
		}
		long totalTime = System.nanoTime() - startTime;
        System.out.println("\nSelectionSort para ordem alfabetica para o caso médio: " + (totalTime) + " milisegundos");
		double memoriaUtilizada = ( (double)((double)(Runtime.getRuntime().totalMemory()/1024)/1024))- ((double)((double)(Runtime.getRuntime().freeMemory()/1024)/1024));
        System.out.printf("Memória utlizada: %.2f Mb\n", memoriaUtilizada);
        System.out.printf("Memória utlizada: %.3f Gb\n", memoriaUtilizada/1024);
        String path = "sSort_ordena_cidades_medio.csv";
        escreverCsv(array, path);
		selectionSortAlfabeticoMelhorCaso(array);
	}

	public static void selectionSortAlfabeticoMelhorCaso(Dados[] array) {
		long startTime = System.nanoTime();
		for (int fixo = 0; fixo < array.length - 1; fixo++) {
			int menor = fixo;
		
			for (int i = menor + 1; i < array.length - 1; i++) {
			   if (deAccent(array[i].getCidade()).compareTo(deAccent(array[menor].getCidade())) < 0) {
				  menor = i;
			   }
			}
			if (menor != fixo) {
			  Dados t = array[fixo];
			  array[fixo] = array[menor];
			  array[menor] = t;
			}
		}
		long totalTime = System.nanoTime() - startTime;
        System.out.println("\nSelectionSort para ordem alfabetica para o melhor caso: " + (totalTime) + " milisegundos");
		double memoriaUtilizada = ( (double)((double)(Runtime.getRuntime().totalMemory()/1024)/1024))- ((double)((double)(Runtime.getRuntime().freeMemory()/1024)/1024));
        System.out.printf("Memória utlizada: %.2f Mb\n", memoriaUtilizada);
        System.out.printf("Memória utlizada: %.3f Gb\n", memoriaUtilizada/1024);
        String path = "sSort_ordena_cidades_melhor.csv";
        escreverCsv(array, path);
		selectionSortAlfabeticoPiorCaso(array);
	}

	public static void selectionSortAlfabeticoPiorCaso(Dados[] array) {
		long startTime = System.nanoTime();
		for (int fixo = 0; fixo < array.length - 1; fixo++) {
			int menor = fixo;
		
			for (int i = menor + 1; i < array.length - 1; i++) {
			   if (deAccent(array[i].getCidade()).compareTo(deAccent(array[menor].getCidade())) > 0) {
				  menor = i;
			   }
			}
			if (menor != fixo) {
			  Dados t = array[fixo];
			  array[fixo] = array[menor];
			  array[menor] = t;
			}
		}
		long totalTime = System.nanoTime() - startTime;
        System.out.println("\nSelectionSort para ordem alfabetica para o pior caso: " + (totalTime) + " milisegundos");
		double memoriaUtilizada = ( (double)((double)(Runtime.getRuntime().totalMemory()/1024)/1024))- ((double)((double)(Runtime.getRuntime().freeMemory()/1024)/1024));
        System.out.printf("Memória utlizada: %.2f Mb\n", memoriaUtilizada);
        System.out.printf("Memória utlizada: %.3f Gb\n", memoriaUtilizada/1024);
        String path = "sSort_ordena_cidades_pior.csv";
        escreverCsv(array, path);
	}
}
