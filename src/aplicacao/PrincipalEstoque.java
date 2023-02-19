package aplicacao;

import javax.swing.JOptionPane;

import entidades.Estoque;

public class PrincipalEstoque {

	public static void main(String[] args) {
		Estoque estoque = new Estoque("Celular", 2100.0, 200);
		estoque.imprimir();
		estoque.removerProdutos(201);
		estoque.imprimir();
		JOptionPane.showMessageDialog(null, "Vala");

	}

}
