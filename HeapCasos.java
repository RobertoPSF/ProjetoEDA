public class HeapCasos extends Escrever{
    public static void heapSort(Dados[] vetor){
        long startTime = System.nanoTime();
        int tamanho = vetor.length - 1;
        int i = tamanho / 2, pai, filho;
        Dados t;
        int sair = 0;
        while (sair == 0){
            if (i > 0){
                i--; 
                t = vetor[i];
            }else{
                tamanho--;
                if (tamanho <= 0) {
                    sair = 1;
                }
                t = vetor[tamanho];
                vetor[tamanho] = vetor[0];
            }
            pai = i;
            filho = ((i * 2) + 1);
            while (filho < tamanho){
                if ((filho + 1 < tamanho) && (vetor[filho + 1].getConfirmados() > vetor[filho].getConfirmados())) {
                    filho++;
                }
                if (vetor[filho].getConfirmados() > t.getConfirmados()){
                    vetor[pai] = vetor[filho];
                    pai = filho;
                    filho = pai * 2 + 1;
                }else {
                    break;
                }
            }
            vetor[pai] = t;
        }
        long totalTime = System.nanoTime() - startTime;
        System.out.println("\nHeapSort para quantidade de casos acumulados para o caso médio: " + (totalTime) + " milisegundos");
		double memoriaUtilizada = ( (double)((double)(Runtime.getRuntime().totalMemory()/1024)/1024))- ((double)((double)(Runtime.getRuntime().freeMemory()/1024)/1024));
        System.out.printf("Memória utlizada: %.2f Mb\n", memoriaUtilizada);
        System.out.printf("Memória utlizada: %.3f Gb\n", memoriaUtilizada/1024);
        String path = "hSort_ordena_casos_medio.csv";
        escreverCsv(vetor, path);
        heapSortMelhor(vetor);
    }

    public static void heapSortMelhor(Dados[] vetor){
        long startTime = System.nanoTime();
        int tamanho = vetor.length - 1;
        int i = tamanho / 2, pai, filho;
        Dados t;
        int sair = 0;
        while (sair == 0){
            if (i > 0){
                i--; 
                t = vetor[i];
            }else{
                tamanho--;
                if (tamanho <= 0) {
                    sair = 1;
                }
                t = vetor[tamanho];
                vetor[tamanho] = vetor[0];
            }
            pai = i;
            filho = ((i * 2) + 1);
            while (filho < tamanho){
                if ((filho + 1 < tamanho) && (vetor[filho + 1].getConfirmados() > vetor[filho].getConfirmados())) {
                    filho++;
                }
                if (vetor[filho].getConfirmados() > t.getConfirmados()){
                    vetor[pai] = vetor[filho];
                    pai = filho;
                    filho = pai * 2 + 1;
                }else {
                    break;
                }
            }
            vetor[pai] = t;
        }
        long totalTime = System.nanoTime() - startTime;
        System.out.println("\nHeapSort para quantidade de casos acumulados para o melhor caso: " + (totalTime) + " milisegundos");
		double memoriaUtilizada = ( (double)((double)(Runtime.getRuntime().totalMemory()/1024)/1024))- ((double)((double)(Runtime.getRuntime().freeMemory()/1024)/1024));
        System.out.printf("Memória utlizada: %.2f Mb\n", memoriaUtilizada);
        System.out.printf("Memória utlizada: %.3f Gb\n", memoriaUtilizada/1024);
        String path = "hSort_ordena_casos_melhor.csv";
        escreverCsv(vetor, path);
        heapSortPior(vetor);
    }

    public static void heapSortPior(Dados[] vetor){
        long startTime = System.nanoTime();
        int tamanho = vetor.length - 1;
        int i = tamanho / 2, pai, filho;
        Dados t;
        int sair = 0;
        while (sair == 0){
            if (i > 0){
                i--; 
                t = vetor[i];
            }else{
                tamanho--;
                if (tamanho <= 0) {
                    sair = 1;
                }
                t = vetor[tamanho];
                vetor[tamanho] = vetor[0];
            }
            pai = i;
            filho = ((i * 2) + 1);
            while (filho < tamanho){
                if ((filho + 1 < tamanho) && (vetor[filho + 1].getConfirmados() < vetor[filho].getConfirmados())) {
                    filho++;
                }
                if (vetor[filho].getConfirmados() < t.getConfirmados()){
                    vetor[pai] = vetor[filho];
                    pai = filho;
                    filho = pai * 2 + 1;
                }else {
                    break;
                }
            }
            vetor[pai] = t;
        }
        long totalTime = System.nanoTime() - startTime;
        System.out.println("\nHeapSort para quantidade de casos acumulados para o pior caso: " + (totalTime) + " milisegundos");
		double memoriaUtilizada = ( (double)((double)(Runtime.getRuntime().totalMemory()/1024)/1024))- ((double)((double)(Runtime.getRuntime().freeMemory()/1024)/1024));
        System.out.printf("Memória utlizada: %.2f Mb\n", memoriaUtilizada);
        System.out.printf("Memória utlizada: %.3f Gb\n", memoriaUtilizada/1024);
        String path = "hSort_ordena_casos_pior.csv";
        escreverCsv(vetor, path);
    }
}
