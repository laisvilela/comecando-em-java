package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Cidade;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);


		System.out.print("Insira a quantidade de cidades: ");
		int numeroCidades = sc.nextInt();
		System.out.println();

		List<Cidade> listaCidades = obterDadosCidades(sc, numeroCidades);

		Cidade cidadeMinimaInicial = listaCidades.get(0);

		for (Cidade cidade : listaCidades) {
			if (cidadeMinimaInicial.getNumeroAcidentes() > cidade.getNumeroAcidentes()) {
				cidadeMinimaInicial = cidade;

			}

		}

		Cidade cidadeMaximaInicial = listaCidades.get(0);

		for (Cidade cidade : listaCidades) {
			if (cidadeMaximaInicial.getNumeroAcidentes() < cidade.getNumeroAcidentes()) {
				cidadeMaximaInicial = cidade;

			}

		}

		System.out.println("Índice mínimo: " + cidadeMinimaInicial.getNumeroAcidentes() + ", Código da cidade: "
				+ cidadeMinimaInicial.getCodigo());
		System.out.println("Índice máximo: " + cidadeMaximaInicial.getNumeroAcidentes() + ", Código da cidade: "
				+ cidadeMaximaInicial.getCodigo());

		double soma;
		soma = 0;
		for (Cidade veiculo : listaCidades) {
			soma += veiculo.getVeiculosPasseio();
		}

		double media = soma / numeroCidades;

		System.out.println();
		System.out.printf("Média de veículos nas cidades: %.2f%n", media);
		System.out.println();

		double somaAcidentes = 0;
		double numeroCidades2 = 0;

		for (Cidade numeroVeiculos : listaCidades) {
			if (numeroVeiculos.getVeiculosPasseio() < 2000) {
				somaAcidentes += numeroVeiculos.getNumeroAcidentes();
				numeroCidades2++;
			}
		}

		double mediaAcidentes = somaAcidentes / numeroCidades2;

		System.out.println();
		System.out.println("Total de acidentes em cidades com menos de 2000 veículos: " + somaAcidentes);
		System.out.println("Total de cidades com menos de 2000 veículos: " + numeroCidades2);
		System.out.printf("Média de acidentes em cidades com menos de 2000 veículos: %.2f%n", mediaAcidentes);

	}

	private static List<Cidade> obterDadosCidades(Scanner sc, int numeroCidades) {
		List<Cidade> listaCidades = new ArrayList<>(numeroCidades);

		for (int i = 1; i <= numeroCidades; i++) {
			System.out.println("Informações #" + i + ": ");
			System.out.print("Código da cidade: ");
			int codigo = sc.nextInt();
			System.out.print("Veículos de passeio: ");
			int veiculosPasseio = sc.nextInt();
			System.out.print("Número de Acidentes: ");
			int numeroAcidentes = sc.nextInt();
			System.out.println();

			Cidade cidade = new Cidade(codigo, veiculosPasseio, numeroAcidentes);
			listaCidades.add(cidade);

		}
		return listaCidades;
	}

}
