public class Quick3Alfabetico extends Escrever{
    //Facilita a vida: só pede o array como argumento
    public static void quicksortMedianaDeTres(Dados[] A){
        long startTime = System.nanoTime();        
        quicksortMedianaDeTres(A, 0, A.length - 2);
        long totalTime = System.nanoTime() - startTime;
        System.out.println("\nQuickSort mediana de 3 para quantidade de cidades acumulados para caso médio: " + (totalTime) + " milisegundos");
        double memoriaUtilizada = ( (double)((double)(Runtime.getRuntime().totalMemory()/1024)/1024))- ((double)((double)(Runtime.getRuntime().freeMemory()/1024)/1024));
        System.out.printf("Memória utlizada: %.2f Mb\n", memoriaUtilizada);
        System.out.printf("Memória utlizada: %.3f Gb\n", memoriaUtilizada/1024);
        String path = "q3Sort_ordena_cidades_medio.csv";
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
        String a = deAccent(A[inicio].getCidade());
        String b = deAccent(A[meio].getCidade());
        String c = deAccent(A[fim].getCidade());
        int medianaIndice; //índice da mediana
        //A sequência de if...else a seguir verifica qual é a mediana
        if(deAccent(a).compareTo(deAccent(b)) < 0){
            if(deAccent(b).compareTo(deAccent(c)) < 0){
                //a < b && b < c
                medianaIndice = meio;
            }else{                
                if(deAccent(a).compareTo(deAccent(c)) < 0){
                    //a < c && c <= b
                    medianaIndice = fim;
                }else{
                    //c <= a && a < b
                    medianaIndice = inicio;
                }
            }
        }else{
            if(deAccent(c).compareTo(deAccent(b)) < 0){
                //c < b && b <= a
                medianaIndice = meio;
            }else{
                if(deAccent(c).compareTo(deAccent(a)) < 0){
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
        Dados pivo = A[fim];
        int i = inicio - 1;
        /*
         * Este laço irá varrer os vetores da esquerda para direira
         * procurando os elementos que são menores ou iguais ao pivô.
         * Esses elementos são colocados na partição esquerda.         
         */
        for(int j = inicio; j <= fim - 1; j++){
            if(deAccent(A[j].getCidade()).compareTo(deAccent(pivo.getCidade())) < 0){
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
        System.out.println("\nQuickSort mediana de 3 para quantidade de cidades acumulados para o melhor caso: " + (totalTime) + " milisegundos");
        double memoriaUtilizada = ( (double)((double)(Runtime.getRuntime().totalMemory()/1024)/1024))- ((double)((double)(Runtime.getRuntime().freeMemory()/1024)/1024));
        System.out.printf("Memória utlizada: %.2f Mb\n", memoriaUtilizada);
        System.out.printf("Memória utlizada: %.3f Gb\n", memoriaUtilizada/1024);
        String path = "q3Sort_ordena_cidades_melhor.csv";
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
        String a = deAccent(A[inicio].getCidade());
        String b = deAccent(A[meio].getCidade());
        String c = deAccent(A[fim].getCidade());
        int medianaIndice; //índice da mediana
        //A sequência de if...else a seguir verifica qual é a mediana
        if(deAccent(a).compareTo(deAccent(b)) < 0){
            if(deAccent(b).compareTo(deAccent(c)) < 0){
                //a < b && b < c
                medianaIndice = meio;
            }else{                
                if(deAccent(a).compareTo(deAccent(c)) < 0){
                    //a < c && c <= b
                    medianaIndice = fim;
                }else{
                    //c <= a && a < b
                    medianaIndice = inicio;
                }
            }
        }else{
            if(deAccent(c).compareTo(deAccent(b)) < 0){
                //c < b && b <= a
                medianaIndice = meio;
            }else{
                if(deAccent(c).compareTo(deAccent(a)) < 0){
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
        Dados pivo = A[fim];
        int i = inicio - 1;
        /*
         * Este laço irá varrer os vetores da esquerda para direira
         * procurando os elementos que são menores ou iguais ao pivô.
         * Esses elementos são colocados na partição esquerda.         
         */
        for(int j = inicio; j <= fim - 1; j++){
            if(deAccent(A[j].getCidade()).compareTo(deAccent(pivo.getCidade())) < 0){
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
        System.out.println("\nQuickSort mediana de 3 para quantidade de cidades acumulados para o pior caso: " + (totalTime) + " milisegundos");
        double memoriaUtilizada = ( (double)((double)(Runtime.getRuntime().totalMemory()/1024)/1024))- ((double)((double)(Runtime.getRuntime().freeMemory()/1024)/1024));
        System.out.printf("Memória utlizada: %.2f Mb\n", memoriaUtilizada);
        System.out.printf("Memória utlizada: %.3f Gb\n", memoriaUtilizada/1024);
        String path = "q3Sort_ordena_cidades_pior.csv";
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
        String a = deAccent(A[inicio].getCidade());
        String b = deAccent(A[meio].getCidade());
        String c = deAccent(A[fim].getCidade());
        int medianaIndice; //índice da mediana
        //A sequência de if...else a seguir verifica qual é a mediana
        if(deAccent(a).compareTo(deAccent(b)) > 0){
            if(deAccent(b).compareTo(deAccent(c)) > 0){
                //a < b && b < c
                medianaIndice = meio;
            }else{                
                if(deAccent(a).compareTo(deAccent(c)) > 0){
                    //a < c && c <= b
                    medianaIndice = fim;
                }else{
                    //c <= a && a < b
                    medianaIndice = inicio;
                }
            }
        }else{
            if(deAccent(c).compareTo(deAccent(b)) > 0){
                //c < b && b <= a
                medianaIndice = meio;
            }else{
                if(deAccent(c).compareTo(deAccent(a)) > 0){
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
        Dados pivo = A[fim];
        int i = inicio - 1;
        /*
         * Este laço irá varrer os vetores da esquerda para direira
         * procurando os elementos que são menores ou iguais ao pivô.
         * Esses elementos são colocados na partição esquerda.         
         */
        for(int j = inicio; j <= fim - 1; j++){
            if(deAccent(A[j].getCidade()).compareTo(deAccent(pivo.getCidade())) > 0){
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