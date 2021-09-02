public class CountingCasos extends Escrever{
    public static void countingSortCasos(Dados[] array){
        long startTime = System.nanoTime();

        int size = array.length - 1;
        Dados[] output = new Dados[size + 1];

        int max = array[0].getConfirmados();
        for (int i = 1; i < size; i++) {
            if (array[i].getConfirmados() > max)
                max = array[i].getConfirmados();
        }

        int[] count = new int[max + 1];

        for (int i = 0; i < max; ++i) {
            count[i] = 0;
        }

        for (int i = 0; i < size; i++) {
            count[array[i].getConfirmados()]++;
        }

        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        for (int i = size - 1; i >= 0; i--) {
            output[count[array[i].getConfirmados()] - 1] = array[i];
            count[array[i].getConfirmados()]--;
        }

        for (int i = 0; i < size; i++) {
            array[i] = output[i];
        }


        long totalTime = System.nanoTime() - startTime;
        System.out.println("CountingSort para quantidade de casos acumulados para o caso médio: " + (totalTime) + " milisegundos");
		String path = "cSort_ordena_casos_medio.csv";
        escreverCsv(array, path);
        countingSortCasosMelhor(array);
    }

    public static void countingSortCasosMelhor(Dados[] array){
        long startTime = System.nanoTime();

        int size = array.length - 1;
        Dados[] output = new Dados[size + 1];

        int max = array[0].getConfirmados();
        for (int i = 1; i < size; i++) {
            if (array[i].getConfirmados() > max)
                max = array[i].getConfirmados();
        }

        int[] count = new int[max + 1];

        for (int i = 0; i < max; ++i) {
            count[i] = 0;
        }

        for (int i = 0; i < size; i++) {
            count[array[i].getConfirmados()]++;
        }

        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        for (int i = size - 1; i >= 0; i--) {
            output[count[array[i].getConfirmados()] - 1] = array[i];
            count[array[i].getConfirmados()]--;
        }

        for (int i = 0; i < size; i++) {
            array[i] = output[i];
        }


        long totalTime = System.nanoTime() - startTime;
        System.out.println("CountingSort para quantidade de casos acumulados para o melhor caso: " + (totalTime) + " milisegundos");
		String path = "cSort_ordena_casos_melhor.csv";
        escreverCsv(array, path);
        countingSortCasosPior(array);
    }

    public static void countingSortCasosPior(Dados[] array){
        long startTime = System.nanoTime();

        int size = array.length - 1;
        Dados[] output = new Dados[size + 1];

        int max = array[0].getConfirmados();
        for (int i = 1; i < size; i++) {
            if (array[i].getConfirmados() > max)
                max = array[i].getConfirmados();
        }

        int[] count = new int[max + 1];

        for (int i = 0; i < max; ++i) {
            count[i] = 0;
        }

        for (int i = 0; i < size; i++) {
            count[array[i].getConfirmados()]++;
        }

        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        for (int i = size - 1; i >= 0; i--) {
            output[(array.length) - count[array[i].getConfirmados()] - 1] = array[i];
            count[array[i].getConfirmados()]--;
        }

        for (int i = 0; i < size; i++) {
            array[i] = output[i];
        }


        long totalTime = System.nanoTime() - startTime;
        System.out.println("CountingSort para quantidade de casos acumulados para o pior caso: " + (totalTime) + " milisegundos");
		String path = "cSort_ordena_casos_pior.csv";
        escreverCsv(array, path);
    }
}
