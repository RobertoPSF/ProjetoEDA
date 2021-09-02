public class InsertionAlfabetico extends Escrever{
    public static void insertionSortAlfabetica(Dados[] lista) {
        long startTime = System.nanoTime();
		int n = lista.length - 1;  
        for (int j = 1; j < n; j++) {  
            Dados key = lista[j];  
            int i = j-1;  
            while ( (i > -1) && (deAccent(lista[i].getCidade()).compareTo(deAccent(key.getCidade())) > 0 ) ){    
                lista [i+1] = lista [i];  
                i--;  
            }  
            lista[i+1] = key;  
        }
        long totalTime = System.nanoTime() - startTime;
        System.out.println("InsertionSort para ordem alfabetica para o caso médio: " + (totalTime) + " milisegundos");
        String path = "iSort_ordena_cidades_medio.csv";
        escreverCsv(lista, path);
        insertionSortAlfabeticaMelhor(lista);
	}

    public static void insertionSortAlfabeticaMelhor(Dados[] lista) {
        long startTime = System.nanoTime();
		int n = lista.length - 1;  
        for (int j = 1; j < n; j++) {  
            Dados key = lista[j];  
            int i = j-1;  
            while ( (i > -1) && (deAccent(lista[i].getCidade()).compareTo(deAccent(key.getCidade())) > 0 ) ){    
                lista [i+1] = lista [i];  
                i--;  
            }  
            lista[i+1] = key;  
        }
        long totalTime = System.nanoTime() - startTime;
        System.out.println("InsertionSort para ordem alfabetica para o melhor caso: " + (totalTime) + " milisegundos");
        String path = "iSort_ordena_cidades_melhor.csv";
        escreverCsv(lista, path);
        insertionSortAlfabeticaPior(lista);
	}

    public static void insertionSortAlfabeticaPior(Dados[] lista) {
        long startTime = System.nanoTime();
		int n = lista.length - 1;  
        for (int j = 1; j < n; j++) {  
            Dados key = lista[j];  
            int i = j-1;  
            while ( (i > -1) && (deAccent(lista[i].getCidade()).compareTo(deAccent(key.getCidade())) < 0 ) ){    
                lista [i+1] = lista [i];  
                i--;  
            }  
            lista[i+1] = key;  
        }
        long totalTime = System.nanoTime() - startTime;
        System.out.println("InsertionSort para ordem alfabetica para o pior caso: " + (totalTime) + " milisegundos");
        String path = "iSort_ordena_cidades_pior.csv";
        escreverCsv(lista, path);
	}
}
