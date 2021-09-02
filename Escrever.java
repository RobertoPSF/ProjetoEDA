import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Escrever extends Covid{
    public static void escreverCsv(Dados[] lista, String path) {
		String cabecalho = String.format("%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s%n","semana_epidemologica","data","dia","estado","cidade","codigo_ibge","tipo_de_local","casos_acumulados","casos_confirmados_por_100k_habitantes","confirmacao_do_dia","obitos_acumulados","mortes_dia","obitos_confirmados","populacao","ultimo","repetido");
        try {
        	FileWriter fw = new FileWriter(path,true);
        	BufferedWriter bw = new BufferedWriter(fw);
        	PrintWriter pw = new PrintWriter(bw);
        	
        	pw.print(cabecalho);
        	pw.flush();
        	for(int i = 0; i < lista.length - 1; i++) {
        		pw.print(lista[i]);
        		pw.flush();
        	}
        	pw.close();
        }catch(Exception E){
        	
        }
	}
}
