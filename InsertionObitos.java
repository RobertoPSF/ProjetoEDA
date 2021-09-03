public class InsertionObitos extends Escrever{
    public static void insertionSortObitos(Dados[] lista) {
        long startTime = System.nanoTime();
		int n = lista.length - 1;  
        for (int j = 1; j < n; j++) {  
            Dados key = lista[j];  
            int i = j-1;  
            while ( (i > -1) && ( lista[i].getObitosAcumulados() > key.getObitosAcumulados())) {  
                lista [i+1] = lista [i];  
                i--;  
            }  
            lista[i+1] = key;  
        }
        long totalTime = System.nanoTime() - startTime;
        System.out.println("\nInsertionSort para quantidade de obitos acumuladas para caso médio: " + (totalTime) + " milisegundos");
        double memoriaUtilizada = ( (double)((double)(Runtime.getRuntime().totalMemory()/1024)/1024))- ((double)((double)(Runtime.getRuntime().freeMemory()/1024)/1024));
        System.out.printf("Memória utlizada: %.2f Mb\n", memoriaUtilizada);
        System.out.printf("Memória utlizada: %.3f Gb\n", memoriaUtilizada/1024);
        String path = "iSort_ordena_obitos_medio.csv";
        escreverCsv(lista,path);
        insertionSortObitosMelhor(lista);
	}

    public static void insertionSortObitosMelhor(Dados[] lista) {
        long startTime = System.nanoTime();
		int n = lista.length - 1;  
        for (int j = 1; j < n; j++) {  
            Dados key = lista[j];  
            int i = j-1;  
            while ( (i > -1) && ( lista[i].getObitosAcumulados() > key.getObitosAcumulados())) {  
                lista [i+1] = lista [i];  
                i--;  
            }  
            lista[i+1] = key;  
        }
        long totalTime = System.nanoTime() - startTime;
        System.out.println("\nInsertionSort para quantidade de obitos acumuladas para o melhor caso: " + (totalTime) + " milisegundos");
        double memoriaUtilizada = ( (double)((double)(Runtime.getRuntime().totalMemory()/1024)/1024))- ((double)((double)(Runtime.getRuntime().freeMemory()/1024)/1024));
        System.out.printf("Memória utlizada: %.2f Mb\n", memoriaUtilizada);
        System.out.printf("Memória utlizada: %.3f Gb\n", memoriaUtilizada/1024);
        String path = "iSort_ordena_obitos_melhor.csv";
        escreverCsv(lista,path);
        insertionSortObitosPior(lista);
	}

    public static void insertionSortObitosPior(Dados[] lista) {
        long startTime = System.nanoTime();
		int n = lista.length - 1;  
        for (int j = 1; j < n; j++) {  
            Dados key = lista[j];  
            int i = j-1;  
            while ( (i > -1) && ( lista[i].getObitosAcumulados() < key.getObitosAcumulados())) {  
                lista [i+1] = lista [i];  
                i--;  
            }  
            lista[i+1] = key;   
        }
        long totalTime = System.nanoTime() - startTime;
        System.out.println("\nInsertionSort para quantidade de obitos acumuladas para o pior caso: " + (totalTime) + " milisegundos");
        double memoriaUtilizada = ( (double)((double)(Runtime.getRuntime().totalMemory()/1024)/1024))- ((double)((double)(Runtime.getRuntime().freeMemory()/1024)/1024));
        System.out.printf("Memória utlizada: %.2f Mb\n", memoriaUtilizada);
        System.out.printf("Memória utlizada: %.3f Gb\n", memoriaUtilizada/1024);
        String path = "iSort_ordena_obitos_pior.csv";
        escreverCsv(lista,path);
	}
}
