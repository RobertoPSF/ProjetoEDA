public class Quick3Obitos extends Escrever{
    //Facilita a vida: só pede o array como argumento
    public static void quicksortMedianaDeTres(Dados[] A){
        long startTime = System.nanoTime();        
        quicksortMedianaDeTres(A, 0, A.length - 2);
        long totalTime = System.nanoTime() - startTime;
        System.out.println("\nQuickSort mediana de 3 para quantidade de óbitos acumulados para caso médio: " + (totalTime) + " milisegundos");
        double memoriaUtilizada = ( (double)((double)(Runtime.getRuntime().totalMemory()/1024)/1024))- ((double)((double)(Runtime.getRuntime().freeMemory()/1024)/1024));
        System.out.printf("Memória utlizada: %.2f Mb\n", memoriaUtilizada);
        System.out.printf("Memória utlizada: %.3f Gb\n", memoriaUtilizada/1024);
        String path = "q3Sort_ordena_obitos_medio.csv";
        escreverCsv(A, path);
        quicksortMedianaDeTresMelhor(A);
    }

    private static void quicksortMedianaDeTres(Dados[] A, int inicio, int fim){        
        if(inicio < fim){
            //realiza a partição
            int q = partition(A, inicio, fim);
            //ordena a partição esquerda
            quicksortMedianaDeTres(A, inicio, q - 1);
            //ordena a partição direita
            quicksortMedianaDeTres(A, q + 1, fim);            
        }
    }
    
    //Método de partição
    private static int partition(Dados[] A, int inicio, int fim){
        //procura a mediana entre inicio, meio e fim
        int meio = (inicio + fim)/2;
        int a = A[inicio].getObitosAcumulados();
        int b = A[meio].getObitosAcumulados();
        int c = A[fim].getObitosAcumulados();
        int medianaIndice; //índice da mediana
        //A sequência de if...else a seguir verifica qual é a mediana
        if(a < b){
            if(b < c){
                //a < b && b < c
                medianaIndice = meio;
            }else{                
                if(a < c){
                    //a < c && c <= b
                    medianaIndice = fim;
                }else{
                    //c <= a && a < b
                    medianaIndice = inicio;
                }
            }
        }else{
            if(c < b){
                //c < b && b <= a
                medianaIndice = meio;
            }else{
                if(c < a){
                    //b <= c && c < a
                    medianaIndice = fim;
                }else{
                    //b <= a && a <= c
                    medianaIndice = inicio;
                }
            }
        }
        //coloca o elemento da mediana no fim para poder usar o Quicksort de Cormen
        swap(A, medianaIndice, fim);
        
        //*******************ALGORITMO DE PARTIÇÃO DE CORMEN*********************
        //o pivo é o elemento final
        int pivo = A[fim].getObitosAcumulados();
        int i = inicio - 1;
        /*
         * Este laço irá varrer os vetores da esquerda para direira
         * procurando os elementos que são menores ou iguais ao pivô.
         * Esses elementos são colocados na partição esquerda.         
         */
        for(int j = inicio; j <= fim - 1; j++){
            if(A[j].getObitosAcumulados() <= pivo){
                i = i + 1;
                swap(A, i, j);
            }
        }
        //coloca o pivô na posição de ordenação
        swap(A, i + 1, fim);
        return i + 1; //retorna a posição do pivô
    }
    
    //método auxiliar para realizar as trocas de elementos
    private static void swap(Dados[] A, int i, int j){
        Dados temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    
    public static void quicksortMedianaDeTresMelhor(Dados[] A){
        long startTime = System.nanoTime();        
        quicksortMedianaDeTresMelhor(A, 0, A.length - 2);
        long totalTime = System.nanoTime() - startTime;
        System.out.println("\nQuickSort mediana de 3 para quantidade de óbitos acumulados para o melhor caso: " + (totalTime) + " milisegundos");
        double memoriaUtilizada = ( (double)((double)(Runtime.getRuntime().totalMemory()/1024)/1024))- ((double)((double)(Runtime.getRuntime().freeMemory()/1024)/1024));
        System.out.printf("Memória utlizada: %.2f Mb\n", memoriaUtilizada);
        System.out.printf("Memória utlizada: %.3f Gb\n", memoriaUtilizada/1024);
        String path = "q3Sort_ordena_obitos_melhor.csv";
        escreverCsv(A, path);
        quicksortMedianaDeTresPior(A);
    }

    private static void quicksortMedianaDeTresMelhor(Dados[] A, int inicio, int fim){        
        if(inicio < fim){
            //realiza a partição
            int q = partitionMelhor(A, inicio, fim);
            //ordena a partição esquerda
            quicksortMedianaDeTresMelhor(A, inicio, q - 1);
            //ordena a partição direita
            quicksortMedianaDeTresMelhor(A, q + 1, fim);            
        }
    }
    
    //Método de partição
    private static int partitionMelhor(Dados[] A, int inicio, int fim){
        //procura a mediana entre inicio, meio e fim
        int meio = (inicio + fim)/2;
        int a = A[inicio].getObitosAcumulados();
        int b = A[meio].getObitosAcumulados();
        int c = A[fim].getObitosAcumulados();
        int medianaIndice; //índice da mediana
        //A sequência de if...else a seguir verifica qual é a mediana
        if(a < b){
            if(b < c){
                //a < b && b < c
                medianaIndice = meio;
            }else{                
                if(a < c){
                    //a < c && c <= b
                    medianaIndice = fim;
                }else{
                    //c <= a && a < b
                    medianaIndice = inicio;
                }
            }
        }else{
            if(c < b){
                //c < b && b <= a
                medianaIndice = meio;
            }else{
                if(c < a){
                    //b <= c && c < a
                    medianaIndice = fim;
                }else{
                    //b <= a && a <= c
                    medianaIndice = inicio;
                }
            }
        }
        //coloca o elemento da mediana no fim para poder usar o Quicksort de Cormen
        swapMelhor(A, medianaIndice, fim);
        
        //*******************ALGORITMO DE PARTIÇÃO DE CORMEN*********************
        //o pivo é o elemento final
        int pivo = A[fim].getObitosAcumulados();
        int i = inicio - 1;
        /*
         * Este laço irá varrer os vetores da esquerda para direira
         * procurando os elementos que são menores ou iguais ao pivô.
         * Esses elementos são colocados na partição esquerda.         
         */
        for(int j = inicio; j <= fim - 1; j++){
            if(A[j].getObitosAcumulados() <= pivo){
                i = i + 1;
                swapMelhor(A, i, j);
            }
        }
        //coloca o pivô na posição de ordenação
        swapMelhor(A, i + 1, fim);
        return i + 1; //retorna a posição do pivô
    }
    
    //método auxiliar para realizar as trocas de elementos
    private static void swapMelhor(Dados[] A, int i, int j){
        Dados temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }    

    public static void quicksortMedianaDeTresPior(Dados[] A){
        long startTime = System.nanoTime();        
        quicksortMedianaDeTresPior(A, 0, A.length - 2);
        long totalTime = System.nanoTime() - startTime;
        System.out.println("\nQuickSort mediana de 3 para quantidade de óbitos acumulados para o pior caso: " + (totalTime) + " milisegundos");
        double memoriaUtilizada = ( (double)((double)(Runtime.getRuntime().totalMemory()/1024)/1024))- ((double)((double)(Runtime.getRuntime().freeMemory()/1024)/1024));
        System.out.printf("Memória utlizada: %.2f Mb\n", memoriaUtilizada);
        System.out.printf("Memória utlizada: %.3f Gb\n", memoriaUtilizada/1024);
        String path = "q3Sort_ordena_obitos_pior.csv";
        escreverCsv(A, path);
    }

    private static void quicksortMedianaDeTresPior(Dados[] A, int inicio, int fim){        
        if(inicio < fim){
            //realiza a partição
            int q = partitionPior(A, inicio, fim);
            //ordena a partição esquerda
            quicksortMedianaDeTresPior(A, inicio, q - 1);
            //ordena a partição direita
            quicksortMedianaDeTresPior(A, q + 1, fim);            
        }
    }
    
    //Método de partição
    private static int partitionPior(Dados[] A, int inicio, int fim){
        //procura a mediana entre inicio, meio e fim
        int meio = (inicio + fim)/2;
        int a = A[inicio].getObitosAcumulados();
        int b = A[meio].getObitosAcumulados();
        int c = A[fim].getObitosAcumulados();
        int medianaIndice; //índice da mediana
        //A sequência de if...else a seguir verifica qual é a mediana
        if(a < b){
            if(b < c){
                //a < b && b < c
                medianaIndice = meio;
            }else{                
                if(a < c){
                    //a < c && c <= b
                    medianaIndice = fim;
                }else{
                    //c <= a && a < b
                    medianaIndice = inicio;
                }
            }
        }else{
            if(c < b){
                //c < b && b <= a
                medianaIndice = meio;
            }else{
                if(c < a){
                    //b <= c && c < a
                    medianaIndice = fim;
                }else{
                    //b <= a && a <= c
                    medianaIndice = inicio;
                }
            }
        }
        //coloca o elemento da mediana no fim para poder usar o Quicksort de Cormen
        swapPior(A, medianaIndice, fim);
        
        //*******************ALGORITMO DE PARTIÇÃO DE CORMEN*********************
        //o pivo é o elemento final
        int pivo = A[fim].getObitosAcumulados();
        int i = inicio - 1;
        /*
         * Este laço irá varrer os vetores da esquerda para direira
         * procurando os elementos que são menores ou iguais ao pivô.
         * Esses elementos são colocados na partição esquerda.         
         */
        for(int j = inicio; j <= fim - 1; j++){
            if(A[j].getObitosAcumulados() >= pivo){
                i = i + 1;
                swapPior(A, i, j);
            }
        }
        //coloca o pivô na posição de ordenação
        swapPior(A, i + 1, fim);
        return i + 1; //retorna a posição do pivô
    }
    
    //método auxiliar para realizar as trocas de elementos
    private static void swapPior(Dados[] A, int i, int j){
        Dados temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }    
}