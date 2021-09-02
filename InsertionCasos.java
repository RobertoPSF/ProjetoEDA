public class InsertionCasos extends Escrever{
    public static void insertionSortCasos(Dados[] lista) {
        long startTime = System.nanoTime();
		int n = lista.length - 1;  
        for (int j = 1; j < n; j++) {  
            Dados key = lista[j];  
            int i = j-1;  
            while ( (i > -1) && (lista[i].getConfirmados() > key.getConfirmados())) {  
                lista [i+1] = lista [i];  
                i--;  
            }  
            lista[i+1] = key;  
        }
        long totalTime = System.nanoTime() - startTime;
        System.out.println("InsertionSort para quantidade de casos acumulados para caso médio: " + (totalTime) + " milisegundos");
        String path = "iSort_ordena_casos_medio.csv";
        escreverCsv(lista,path);
        insertionSortCasosMelhor(lista);
    }

    public static void insertionSortCasosMelhor(Dados[] lista) {
        long startTime = System.nanoTime();
		int n = lista.length - 1;  
        for (int j = 1; j < n; j++) {  
            Dados key = lista[j];  
            int i = j-1;  
            while ( (i > -1) && (lista[i].getConfirmados() < key.getConfirmados())) {  
                lista [i+1] = lista [i];  
                i--;  
            }  
            lista[i+1] = key;  
        }
        long totalTime = System.nanoTime() - startTime;
        System.out.println("InsertionSort para quantidade de casos acumulados para melhor caso: " + (totalTime) + " milisegundos");
        String path = "iSort_ordena_casos_melhor.csv";
        escreverCsv(lista,path);
        insertionSortCasosPior(lista);
    }

    public static void insertionSortCasosPior(Dados[] lista) {
        long startTime = System.nanoTime();
		int n = lista.length - 1;  
        for (int j = 1; j < n; j++) {  
            Dados key = lista[j];  
            int i = j-1;  
            while ( (i > -1) && (lista[i].getConfirmados() < key.getConfirmados())) {  
                lista [i+1] = lista [i];  
                i--;  
            }  
            lista[i+1] = key;  
        }
        long totalTime = System.nanoTime() - startTime;
        System.out.println("InsertionSort para quantidade de casos acumulados para pior caso: " + (totalTime) + " milisegundos");
        String path = "iSort_ordena_casos_pior.csv";
        escreverCsv(lista,path);
    }
}
