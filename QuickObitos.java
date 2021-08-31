public class QuickObitos extends Escrever{
    public static void quickSortObitos(Dados[] vetor) {
        long startTime = System.nanoTime();    
        quickSort(vetor, 0, vetor.length - 2);
        long totalTime = System.nanoTime() - startTime;
        System.out.println("QuickSort para quantidade de óbitos acumulados para caso médio: " + (totalTime) + " milisegundos");
        String path = "qSort_ordena_obitos_medio.csv";
        escreverCsv(vetor, path);
        quickSortObitosMelhor(vetor);
    }
    
    private static void quickSort(Dados[] vetor, int inicio, int fim) {
        if(fim > inicio) {
          //Chamada da rotina que ira dividir o vetor em 3 partes.
          int indexPivo = dividir(vetor, inicio, fim);
          /* Chamada recursiva para redivisao do vetor de elementos menores
            que o pivô. */
          quickSort(vetor, inicio, indexPivo - 1);
          /* Chamada recursiva para redivisao do vetor de elementos maiores
            que o pivô. */
          quickSort(vetor, indexPivo + 1, fim);
        }
    }

    private static int dividir(Dados[] vetor, int inicio, int fim) {
        int pivo, pontEsq, pontDir = fim;
        pontEsq = inicio + 1;
        pivo = vetor[inicio].getObitosAcumulados();
    
        while(pontEsq <= pontDir) {
          /* Vai correr o vetor ate que ultrapasse o outro ponteiro
            ou ate que o elemento em questão seja menor que o pivô. */
          while(pontEsq <= pontDir && vetor[pontEsq].getObitosAcumulados() <= pivo) {
            pontEsq++;
          }
    
          /* Vai correr o vetor ate que ultrapasse o outro ponteiro
            que o elemento em questão seja maior que o pivô. */
          while(pontDir >= pontEsq && vetor[pontDir].getObitosAcumulados() > pivo) {
            pontDir--;
          }
    
          /* Caso os ponteiros ainda nao tenham se cruzado, significa que valores
            menores e maiores que o pivô foram localizados em ambos os lados.
            Trocar estes elementos de lado. */
          if(pontEsq < pontDir) {
            trocar(vetor, pontDir, pontEsq);
            pontEsq++;
            pontDir--;
          }
        }
    
        trocar(vetor, inicio, pontDir);
        return pontDir;
      }

      private static void trocar(Dados[] vetor, int i, int j) {
        Dados temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }

    public static void quickSortObitosMelhor(Dados[] vetor) {
        long startTime = System.nanoTime();    
        quickSortMelhor(vetor, 0, vetor.length - 2);
        long totalTime = System.nanoTime() - startTime;
        System.out.println("QuickSort para quantidade de óbitos acumulados para o melhor caso: " + (totalTime) + " milisegundos");
        String path = "qSort_ordena_obitos_melhor.csv";
        escreverCsv(vetor, path);
        quickSortObitosPior(vetor);
    }
    
    private static void quickSortMelhor(Dados[] vetor, int inicio, int fim) {
        if(fim > inicio) {
          //Chamada da rotina que ira dividir o vetor em 3 partes.
          int indexPivo = dividirMelhor(vetor, inicio, fim);
          /* Chamada recursiva para redivisao do vetor de elementos menores
            que o pivô. */
          quickSortMelhor(vetor, inicio, indexPivo - 1);
          /* Chamada recursiva para redivisao do vetor de elementos maiores
            que o pivô. */
          quickSortMelhor(vetor, indexPivo + 1, fim);
        }
    }

    private static int dividirMelhor(Dados[] vetor, int inicio, int fim) {
        int pivo, pontEsq, pontDir = fim;
        pontEsq = inicio + 1;
        pivo = vetor[inicio].getObitosAcumulados();
    
        while(pontEsq <= pontDir) {
          /* Vai correr o vetor ate que ultrapasse o outro ponteiro
            ou ate que o elemento em questão seja menor que o pivô. */
          while(pontEsq <= pontDir && vetor[pontEsq].getObitosAcumulados() <= pivo) {
            pontEsq++;
          }
    
          /* Vai correr o vetor ate que ultrapasse o outro ponteiro
            que o elemento em questão seja maior que o pivô. */
          while(pontDir >= pontEsq && vetor[pontDir].getObitosAcumulados() > pivo) {
            pontDir--;
          }
    
          /* Caso os ponteiros ainda nao tenham se cruzado, significa que valores
            menores e maiores que o pivô foram localizados em ambos os lados.
            Trocar estes elementos de lado. */
          if(pontEsq < pontDir) {
            trocarMelhor(vetor, pontDir, pontEsq);
            pontEsq++;
            pontDir--;
          }
        }
    
        trocarMelhor(vetor, inicio, pontDir);
        return pontDir;
      }

      private static void trocarMelhor(Dados[] vetor, int i, int j) {
        Dados temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }

    public static void quickSortObitosPior(Dados[] vetor) {
        long startTime = System.nanoTime();    
        quickSortPior(vetor, 0, vetor.length - 2);
        long totalTime = System.nanoTime() - startTime;
        System.out.println("QuickSort para quantidade de óbitos acumulados para o pior caso: " + (totalTime) + " milisegundos");
        String path = "qSort_ordena_obitos_pior.csv";
        escreverCsv(vetor, path);
    }
    
    private static void quickSortPior(Dados[] vetor, int inicio, int fim) {
        if(fim > inicio) {
          //Chamada da rotina que ira dividir o vetor em 3 partes.
          int indexPivo = dividirPior(vetor, inicio, fim);
          /* Chamada recursiva para redivisao do vetor de elementos menores
            que o pivô. */
          quickSortPior(vetor, inicio, indexPivo - 1);
          /* Chamada recursiva para redivisao do vetor de elementos maiores
            que o pivô. */
          quickSortPior(vetor, indexPivo + 1, fim);
        }
    }

    private static int dividirPior(Dados[] vetor, int inicio, int fim) {
        int pivo, pontEsq, pontDir = fim;
        pontEsq = inicio + 1;
        pivo = vetor[inicio].getObitosAcumulados();
    
        while(pontEsq <= pontDir) {
          /* Vai correr o vetor ate que ultrapasse o outro ponteiro
            ou ate que o elemento em questão seja menor que o pivô. */
          while(pontEsq <= pontDir && vetor[pontEsq].getObitosAcumulados() >= pivo) {
            pontEsq++;
          }
    
          /* Vai correr o vetor ate que ultrapasse o outro ponteiro
            que o elemento em questão seja maior que o pivô. */
          while(pontDir >= pontEsq && vetor[pontDir].getObitosAcumulados() < pivo) {
            pontDir--;
          }
    
          /* Caso os ponteiros ainda nao tenham se cruzado, significa que valores
            menores e maiores que o pivô foram localizados em ambos os lados.
            Trocar estes elementos de lado. */
          if(pontEsq < pontDir) {
            trocarPior(vetor, pontDir, pontEsq);
            pontEsq++;
            pontDir--;
          }
        }
    
        trocarPior(vetor, inicio, pontDir);
        return pontDir;
      }

      private static void trocarPior(Dados[] vetor, int i, int j) {
        Dados temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }
}
