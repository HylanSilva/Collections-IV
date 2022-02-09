package me.dio.Map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {

	public static void main(String[] args) {

		TreeMap<String, String> abreviacoesEstados = new TreeMap<>();

		abreviacoesEstados.put("PE", "Pernambuco");
		abreviacoesEstados.put("PB", "Paraíba");
		abreviacoesEstados.put("PI", "Piauí");
		abreviacoesEstados.put("AL", "Alagoas");
		abreviacoesEstados.put("BA", "Bahia");
		abreviacoesEstados.put("SE", "Sergipe");

		System.out.println(abreviacoesEstados);

		// Retorna a primeira capital no topo da árvore
		System.out.println(abreviacoesEstados.firstKey());

		// Retorna a ultima capital no final da arvore
		System.out.println(abreviacoesEstados.lastKey());

		// Retorna a primeira capital abaixo na árvore da capital parametrizada

		System.out.println(abreviacoesEstados.lowerKey("PI"));

		// Retorna a primeira capital acima na árvore da capital parametrizada
		System.out.println(abreviacoesEstados.lowerKey("PI"));

		// Exibe todas as capitais no console
		System.out.println(abreviacoesEstados);

		// Retorna a primeira capital no topo da arvore
		System.out
				.println(abreviacoesEstados.firstEntry().getKey() + "--" + abreviacoesEstados.firstEntry().getValue());

		// Retorna a primeira capital no topo da arvore
		System.out.println(abreviacoesEstados.lastEntry().getKey() + "--" + abreviacoesEstados.lastEntry().getValue());

		// Retorna a capital abaixo na árvore da capital parametrizada
		System.out.println(
				abreviacoesEstados.lowerEntry("PI").getKey() + "--" + abreviacoesEstados.lowerEntry("PI").getValue());

		// Retorna a capital abaixo na árvore da capital parametrizada
		System.out.println(
				abreviacoesEstados.lowerEntry("PI").getKey() + "--" + abreviacoesEstados.lowerEntry("PI").getValue());

		// Exibe todas as capitais no console
		System.out.println(abreviacoesEstados);

		Map.Entry<String, String> firstEntry = abreviacoesEstados.pollFirstEntry();
		Map.Entry<String, String> lasstEntry = abreviacoesEstados.pollLastEntry();

		// Retorna a primeira capital no topo da árvore, removendo do map
		System.out.println(firstEntry.getKey() + "--" + firstEntry.getValue());

		// Retorna a primeira capital no topo da árvore, removendo do map
		System.out.println(lasstEntry.getKey() + "--" + lasstEntry.getValue());

		// Exibe todas as capitais no console
		System.out.println(abreviacoesEstados);

		// Navega todas as chaves do iterator

		Iterator<String> iterator = abreviacoesEstados.keySet().iterator();

		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(key+"=="+abreviacoesEstados.get(key));
		}

		for (String cidade : abreviacoesEstados.keySet()) {
			System.out.println(cidade+"=="+abreviacoesEstados.get(cidade));
		}
		
		for (Map.Entry<String, String> cidade: abreviacoesEstados.entrySet()) {
			System.out.println(cidade.getKey()+"=="+cidade.getValue());
		}
	}

}
