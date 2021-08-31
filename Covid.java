import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.Normalizer;
import java.util.regex.Pattern;

public class Covid {

	public static String deAccent(String str) {
		String nfdNormalizedString = Normalizer.normalize(str, Normalizer.Form.NFD); 
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		return pattern.matcher(nfdNormalizedString).replaceAll("");
	}

		public static void main(String[] args) {
		String path = "/covid19-paraiba.csv";
		
		Dados[] lista = new Dados[1];
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8") ) ){
			String linha = br.readLine();
			linha = br.readLine();
			int i = 0;
			while(linha != null) {
				String[] vetor = linha.split(",");
				String semanaEpidemologica = vetor[0];
				String data = vetor[1];
				String dias = vetor[2];
				String estado = vetor[3];
				String cidade = vetor[4];
				String codigoIbge = vetor[5];
				String tipoDeLocal = vetor[6];
				int confirmados = Integer.parseInt(vetor[7]);
				String confirmadosPor100k =  vetor[8];
				int confirmacaoDia = Integer.parseInt(vetor[9]);
				int obitosAcumulados = Integer.parseInt(vetor[10]);
				int obitosDia = Integer.parseInt(vetor[11]);
				double obitosConfirmados =  Double.parseDouble(vetor[12]);
				String populacao = vetor[13];
				String ultimo = vetor[14];
				String repetido = vetor[15];
				
				Dados dados = new Dados(semanaEpidemologica, data, dias, estado, cidade, codigoIbge, tipoDeLocal, confirmados, confirmadosPor100k, confirmacaoDia, obitosAcumulados, obitosDia, obitosConfirmados, populacao, ultimo, repetido);
				lista[i] = dados;
				Dados[] transferir = new Dados[lista.length + 1];

				for(int j = 0; j < lista.length; j++) {
					transferir[j] = lista[j];
				}

				lista = new Dados[transferir.length];

				for(int j = 0; j < transferir.length; j++) {
					lista[j] = transferir[j];
				}
				i++;
				linha = br.readLine();
			}
			
			//Dados[] listaInsertionObitos = lista.clone();
			//Dados[] listaInsertionCasos = lista.clone();
			//Dados[] listaInsertionAlfabetico = lista.clone();
			//Dados[] listaSelectionObitos = lista.clone();
			//Dados[] listaSelectionCasos = lista.clone();
			//Dados[] listaSelectionAlfabetico = lista.clone(); 
			//Dados[] listaCountingObitos = lista.clone();
			//Dados[] listaCountingCasos = lista.clone();
			//Dados[] listaCountingAlfabetico = lista.clone();
			//Dados[] listaHeapObitos = lista.clone();
			//Dados[] listaHeapCasos = lista.clone();
			//Dados[] listaHeapAlfabetico = lista.clone();
			//Dados[] listaQuickObitos = lista.clone();
			//Dados[] listaQuickCasos = lista.clone();
			Dados[] listaQuickAlfabetico = lista.clone();
			//Dados[] listaQuick3Obitos = lista.clone();
			//Dados[] listaQuick3Casos = lista.clone();
			//Dados[] listaQuick3Alfabetico = lista.clone(); 
			//Dados[] listaMergeObitos = lista.clone();
			//Dados[] listaMergeCasos = lista.clone();
			//Dados[] listaMergeAlfabetico = lista.clone();

			//InsertionObitos.insertionSortObitos(listaInsertionObitos);
			//InsertionCasos.insertionSortCasos(listaInsertionCasos);
			//InsertionAlfabetico.insertionSortAlfabetica(listaInsertionAlfabetico);
			//SelectionObitos.selectionSortObitos(listaSelectionObitos);
			//SelectionCasos.selectionSortCasos(listaSelectionCasos);
			//SelectionAlfabetico.selectionSortAlfabetico(listaSelectionAlfabetico);
			//CountingSortObitos.countingSortObitos(listaCountingObitos);
			//CountingCasos.countingSortCasos(listaCountingCasos);			
			//HeapObitos.heapSort(listaHeapObitos);
			//HeapCasos.heapSort(listaHeapCasos);
			//HeapAlfabetico.heapSort(listaHeapAlfabetico);
			//QuickObitos.quickSortObitos(listaQuickObitos);
			//QuickCasos.quickSortCasos(listaQuickCasos);
			QuickAlfabetico.quickSortAlfabetico(listaQuickAlfabetico);
			//Quick3Obitos.quicksortMedianaDeTres(listaQuick3Obitos);
			//Quick3Casos.quicksortMedianaDeTres(listaQuick3Casos);
			//Quick3Alfabetico.quicksortMedianaDeTres(listaQuick3Alfabetico);
			//MergeObitos.mergeSortObitos(listaMergeObitos);
			//MergeCasos.mergeSortCasos(listaMergeCasos);
			//MergeAlfabetico.mergeSortAlfabetico(listaMergeAlfabetico);
		}
		catch(IOException e) {
			System.out.println("Error: "+ e.getMessage());
		}
	}
}
