package me.dio.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* # 1- Crie um Map e execute as seguintes operações:
	 * Adicione os 26 estados Brasileiros no map, onde a sigla será a chave e o nome do estado o valor. 
	 * Remova o estado de Minas Gerais.
	 * Adicione o Distrito Federal.
	 * Verifique o tamanho do mapa.
	 * Remova o estado do Mato Grosso do Sul usando o nome.
	 * Navegue em todos os registros do map, mostrando no console o seguinte formato: NOME(SIGLA)
	 * Verifique se o estado de Santa Catarina existe no map, buscando pela sigla SC
	 * Verifique se o estado do Maranhão existe no map, buscando pelo seu nome
	 * */
public class ExercicioFinal {

	public static void main(String[] args) {
		
		Map<String, String> estadosBrasileiros = new HashMap<>();
	//	Adicione os 26 estados Brasileiros no map, onde a sigla será a chave e o nome do estado o valor.
		estadosBrasileiros.put("AC", "Acre");
		estadosBrasileiros.put("AL", "Alagoas");
		estadosBrasileiros.put("AP", "Amapá");
		estadosBrasileiros.put("AM", "Amazonas");
		estadosBrasileiros.put("BA", "Bahia");
		estadosBrasileiros.put("CE", "Ceará");
		estadosBrasileiros.put("ES", "Espirito Santo");
		estadosBrasileiros.put("GO", "Goiás");
		estadosBrasileiros.put("MA", "Maranhão");
		estadosBrasileiros.put("MT", "Mato Grosso");
		estadosBrasileiros.put("MS", "Mato Grosso do Sul");
		estadosBrasileiros.put("MG", "Minas Gerais");
		estadosBrasileiros.put("PA", "Pará");
		estadosBrasileiros.put("PB", "Paraíba");
		estadosBrasileiros.put("PR", "Paraná");
		estadosBrasileiros.put("PE", "Pernambuco");
		estadosBrasileiros.put("PI", "Piauí");
		estadosBrasileiros.put("RJ", "Rio de Janeiro");
		estadosBrasileiros.put("RN", "Rio Grande do Norte");
		estadosBrasileiros.put("RS", "Rio Grande do Sul");
		estadosBrasileiros.put("RO", "Rondônia");
		estadosBrasileiros.put("RR", "Roraima");
		estadosBrasileiros.put("SC", "Santa Catarina");
		estadosBrasileiros.put("SP", "São Paulo");
		estadosBrasileiros.put("SE", "Sergipe");
		estadosBrasileiros.put("TO", "Tocantins");
		
		System.out.println(estadosBrasileiros);
		// Remova o estado de Minas Gerais.
		estadosBrasileiros.remove("MG");
		System.out.println(estadosBrasileiros);
		
		// Adicione o Distrito Federal.
		estadosBrasileiros.put("DF", "Distrito Federal");
		System.out.println(estadosBrasileiros);
		
		// Verifique o tamanho do mapa.
		System.out.println(estadosBrasileiros.size());
		
		// Remova o estado do Mato Grosso do Sul usando o nome.
		estadosBrasileiros.remove("Mato Grosso do Sul");
		
		Iterator<String> iterator = estadosBrasileiros.keySet().iterator();
		
		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(estadosBrasileiros.get(key)+"( "+key+" )");
		}
		
		// Verifique se o estado de Santa Catarina existe no map, buscando pela sigla SC
		System.out.println(estadosBrasileiros.containsKey("SC"));
		
		// Verifique se o estado do Maranhão existe no map, buscando pelo seu nome
		System.out.println(estadosBrasileiros.containsValue("Maranhão"));
	}

}
