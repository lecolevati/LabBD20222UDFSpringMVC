package br.edu.fateczl.ExercicioSpringMVCUDFProduto.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Produto {

	private int codigo;
	private String nome;
	private double valorUnitario;
	private int qtdEstoque;
	
}
