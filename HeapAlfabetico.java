public class HeapAlfabetico extends Escrever{
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
                if ((filho + 1 < tamanho) && (deAccent(vetor[filho + 1].getCidade()).compareTo(deAccent(vetor[filho].getCidade()))) > 0) {
                    filho++;
                }
                if (deAccent(vetor[filho].getCidade()).compareTo(deAccent(t.getCidade())) > 0){
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
        System.out.println("HeapSort para cidades para o caso médio: " + (totalTime) + " milisegundos");
		String path = "hSort_ordena_cidades_medio.csv";
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
                if ((filho + 1 < tamanho) && (deAccent(vetor[filho + 1].getCidade()).compareTo(deAccent(vetor[filho].getCidade()))) > 0) {
                    filho++;
                }
                if (deAccent(vetor[filho].getCidade()).compareTo(deAccent(t.getCidade())) > 0){
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
        System.out.println("HeapSort para cidades para o melhor caso: " + (totalTime) + " milisegundos");
		String path = "hSort_ordena_cidades_melhor.csv";
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
                if ((filho + 1 < tamanho) && (deAccent(vetor[filho + 1].getCidade()).compareTo(deAccent(vetor[filho].getCidade()))) < 0) {
                    filho++;
                }
                if (deAccent(vetor[filho].getCidade()).compareTo(deAccent(t.getCidade())) < 0){
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
        System.out.println("HeapSort para cidades para o pior caso: " + (totalTime) + " milisegundos");
		String path = "hSort_ordena_cidades_pior.csv";
        escreverCsv(vetor, path);
    }
}