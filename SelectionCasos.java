public class SelectionCasos extends Escrever{
    public static void selectionSortCasos(Dados[] array) {
		long startTime = System.nanoTime();
		for (int fixo = 0; fixo < array.length - 1; fixo++) {
			int menor = fixo;
		
			for (int i = menor + 1; i < array.length - 1; i++) {
			   if (array[i].getConfirmados() < array[menor].getConfirmados()) {
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
        System.out.println("SelectionSort para quantidade de casos acumulados para o caso médio: " + (totalTime) + " milisegundos");
		String path = "sSort_ordena_casos_medio.csv";
        escreverCsv(array, path);
		selectionSortCasosMelhorCaso(array);
	}

	public static void selectionSortCasosMelhorCaso(Dados[] array) {
		long startTime = System.nanoTime();
		for (int fixo = 0; fixo < array.length - 1; fixo++) {
			int menor = fixo;
		
			for (int i = menor + 1; i < array.length - 1; i++) {
			   if (array[i].getConfirmados() < array[menor].getConfirmados()) {
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
        System.out.println("SelectionSort para quantidade de casos acumulados para o melhor caso: " + (totalTime) + " milisegundos");
		String path = "sSort_ordena_casos_melhor.csv";
        escreverCsv(array, path);
		selectionSortCasosPiorCaso(array);
	}

	public static void selectionSortCasosPiorCaso(Dados[] array) {
		long startTime = System.nanoTime();
		for (int fixo = 0; fixo < array.length - 1; fixo++) {
			int menor = fixo;
		
			for (int i = menor + 1; i < array.length - 1; i++) {
			   if (array[i].getConfirmados() > array[menor].getConfirmados()) {
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
        System.out.println("SelectionSort para quantidade de casos acumulados parao pior caso: " + (totalTime) + " milisegundos");
		String path = "sSort_ordena_casos_pior.csv";
        escreverCsv(array, path);
	}
}