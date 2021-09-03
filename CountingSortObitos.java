public class CountingSortObitos extends Escrever{
    public static void countingSortObitos(Dados[] array){
        long startTime = System.nanoTime();

        int size = array.length - 1;
        Dados[] output = new Dados[size + 1];

        int max = array[0].getObitosAcumulados();
        for (int i = 1; i < size; i++) {
            if (array[i].getObitosAcumulados() > max)
                max = array[i].getObitosAcumulados();
        }

        int[] count = new int[max + 1];

        for (int i = 0; i < max; ++i) {
            count[i] = 0;
        }

        for (int i = 0; i < size; i++) {
            count[array[i].getObitosAcumulados()]++;
        }

        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        for (int i = size - 1; i >= 0; i--) {
            output[count[array[i].getObitosAcumulados()] - 1] = array[i];
            count[array[i].getObitosAcumulados()]--;
        }

        for (int i = 0; i < size; i++) {
            array[i] = output[i];
        }


        long totalTime = System.nanoTime() - startTime;
        System.out.println("\nCountingSort para quantidade de óbitos acumulados para o caso médio: " + (totalTime) + " milisegundos");
		double memoriaUtilizada = ( (double)((double)(Runtime.getRuntime().totalMemory()/1024)/1024))- ((double)((double)(Runtime.getRuntime().freeMemory()/1024)/1024));
        System.out.printf("Memória utlizada: %.2f Mb\n", memoriaUtilizada);
        System.out.printf("Memória utlizada: %.3f Gb\n", memoriaUtilizada/1024);
        String path = "cSort_ordena_obitos_medio.csv";
        escreverCsv(array, path);
        countingSortObitosMelhor(array);
    }

    public static void countingSortObitosMelhor(Dados[] array){
        long startTime = System.nanoTime();

        int size = array.length - 1;
        Dados[] output = new Dados[size + 1];

        int max = array[0].getObitosAcumulados();
        for (int i = 1; i < size; i++) {
            if (array[i].getObitosAcumulados() > max)
                max = array[i].getObitosAcumulados();
        }

        int[] count = new int[max + 1];

        for (int i = 0; i < max; ++i) {
            count[i] = 0;
        }

        for (int i = 0; i < size; i++) {
            count[array[i].getObitosAcumulados()]++;
        }

        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        for (int i = size - 1; i >= 0; i--) {
            output[count[array[i].getObitosAcumulados()] - 1] = array[i];
            count[array[i].getObitosAcumulados()]--;
        }

        for (int i = 0; i < size; i++) {
            array[i] = output[i];
        }


        long totalTime = System.nanoTime() - startTime;
        System.out.println("\nCountingSort para quantidade de óbitos acumulados para o melhor caso: " + (totalTime) + " milisegundos");
		String path = "cSort_ordena_obitos_melhor.csv";
        double memoriaUtilizada = ( (double)((double)(Runtime.getRuntime().totalMemory()/1024)/1024))- ((double)((double)(Runtime.getRuntime().freeMemory()/1024)/1024));
        System.out.printf("Memória utlizada: %.2f Mb\n", memoriaUtilizada);
        System.out.printf("Memória utlizada: %.3f Gb\n", memoriaUtilizada/1024);
        escreverCsv(array, path);
        countingSortObitosPior(array);
    }

    public static void countingSortObitosPior(Dados[] array){
        long startTime = System.nanoTime();

        int size = array.length - 1;
        Dados[] output = new Dados[size + 1];

        int max = array[0].getObitosAcumulados();
        for (int i = 1; i < size; i++) {
            if (array[i].getObitosAcumulados() > max)
                max = array[i].getObitosAcumulados();
        }

        int[] count = new int[max + 1];

        for (int i = 0; i < max; ++i) {
            count[i] = 0;
        }

        for (int i = 0; i < size; i++) {
            count[array[i].getObitosAcumulados()]++;
        }

        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        for (int i = size - 1; i >= 0; i--) {
            output[(array.length) - count[array[i].getObitosAcumulados()] - 1] = array[i];
            count[array[i].getObitosAcumulados()]--;
        }

        for (int i = 0; i < size; i++) {
            array[i] = output[i];
        }


        long totalTime = System.nanoTime() - startTime;
        System.out.println("\nCountingSort para quantidade de óbitos acumulados para o pior caso: " + (totalTime) + " milisegundos");
		double memoriaUtilizada = ( (double)((double)(Runtime.getRuntime().totalMemory()/1024)/1024))- ((double)((double)(Runtime.getRuntime().freeMemory()/1024)/1024));
        System.out.printf("Memória utlizada: %.2f Mb\n", memoriaUtilizada);
        System.out.printf("Memória utlizada: %.3f Gb\n", memoriaUtilizada/1024);
        String path = "cSort_ordena_obitos_pior.csv";
        escreverCsv(array, path);
    }
}
