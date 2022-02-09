package me.dio;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Autor = Hawking, Stephen - Livro = nome: Uma breve Historia do Tempo. páginas: 256 
		 * Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito. páginas: 408 
		 * Autor = Harari, Yuval Noah - Livro = nome: 21 Lições Para o Século 21. páginas: 432
		 */

		/*
		 * Map<String, String> aluno = new HashMap<>();
		 * 
		 * aluno.put("Nome", "João" ); aluno.put("Idade", "17" ); aluno.put("Media",
		 * "8.5" ); aluno.put("Turma", "3a" );
		 * 
		 * System.out.println(aluno);
		 * 
		 * System.out.println(aluno.keySet()); System.out.println(aluno.values());
		 * 
		 * List<Map<String, String>> listaAlunos = new ArrayList<>();
		 * 
		 * listaAlunos.add(aluno);
		 * 
		 * Map<String, String> aluno2 = new HashMap<>();
		 * 
		 * aluno2.put("Nome", "Carlão" ); aluno2.put("Idade", "18" );
		 * aluno2.put("Media", "8.9" ); aluno2.put("Turma", "3b" );
		 * 
		 * listaAlunos.add(aluno2);
		 * 
		 * System.out.println(listaAlunos);
		 * 
		 * System.out.println(aluno.containsKey("Nome"));
		 */

		/*
		 * modelo = gol - consumo = 14,4km/l modelo = uno - consumo = 15,6km/l modelo =
		 * mobi - consumo = 16,1km/l modelo = hb20 - consumo = 14,5km/l modelo = kwid -
		 * consumo = 15,6km/l
		 */

		/*
		 * Map<String, Double> carrosPopulares = new HashMap<>() { private static final
		 * long serialVersionUID = 1L;
		 * 
		 * { put("gol", 14.4); put("uno", 15.6); put("mobi", 16.1); put("hb20", 14.5);
		 * put("kwid", 15.6);
		 * 
		 * } };
		 * 
		 * System.out.println(carrosPopulares.toString());
		 * 
		 * carrosPopulares.put("gol", 15.2);
		 * 
		 * System.out.println(carrosPopulares.toString());
		 * 
		 * System.out.println(carrosPopulares.containsKey("tucson"));
		 * 
		 * System.out.println(carrosPopulares.containsKey("uno"));
		 * 
		 * System.out.println(carrosPopulares.get("uno"));
		 * 
		 * System.out.println(carrosPopulares.keySet());
		 * 
		 * System.out.println(carrosPopulares.values());
		 * 
		 * Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
		 * Set<Map.Entry<String, Double>> entrySet = carrosPopulares.entrySet();
		 * 
		 * String modeloMasEficiente = " ";
		 * 
		 * for (Map.Entry<String, Double> entry : entrySet) { if
		 * (entry.getValue().equals(consumoMaisEficiente)) { modeloMasEficiente =
		 * entry.getKey(); System.out.println("Modelo mais eficiente: " +
		 * modeloMasEficiente + " - " + consumoMaisEficiente); } } Double
		 * consumoMenosEficiente = Collections.min(carrosPopulares.values());
		 * Set<Map.Entry<String, Double>> entrySet2 = carrosPopulares.entrySet();
		 * 
		 * String modeloMenosEficiente = " ";
		 * 
		 * for (Map.Entry<String, Double> entry : entrySet2) { if
		 * (entry.getValue().equals(consumoMenosEficiente)) { modeloMenosEficiente =
		 * entry.getKey(); System.out.println("Modelo menos eficiente: " +
		 * modeloMenosEficiente + " - " + consumoMenosEficiente); } }
		 * 
		 * Iterator<Double> iterator = carrosPopulares.values().iterator(); Double soma
		 * = 0d; while (iterator.hasNext()) { soma+= iterator.next(); }
		 * 
		 * System.out.println(soma);
		 * 
		 * System.out.println(soma/carrosPopulares.size());
		 * 
		 * Iterator<Double> iterator1 = carrosPopulares.values().iterator(); Double
		 * soma1= 0d; while (iterator1.hasNext()) { if(iterator1.next().equals(15.6))
		 * iterator1.remove(); }
		 * 
		 * System.out.println(carrosPopulares);
		 * 
		 */

	}

	class Livro {

		private String Nome;
		private Integer paginas;

		public Livro(String Nome, Integer paginas) {
			this.Nome = Nome;
			this.paginas = paginas;
		}

		public String getNome() {
			return Nome;
		}

		public void setNome(String Nome) {
			this.Nome = Nome;
		}

		public Integer getPaginas() {
			return paginas;
		}

		public void setPaginas(Integer paginas) {
			this.paginas = paginas;
		}

		@Override
		public int hashCode() {
			return Objects.hash(Nome, paginas);
		}

		@Override
		public boolean equals(Object o) {
			if (this == o)
				return true;
			if (o == null || getClass() != o.getClass())
				return false;
			Livro livro = (Livro) o;
			return Nome.equals(livro.Nome) && paginas.equals(livro.paginas);

		}

		@Override
		public String toString() {
			return "Livro [Nome=" + Nome + ", paginas=" + paginas + "]";
		}
		
		
	}
}
