package br.com.trabalho.carregamento;

import br.com.trabalho.modelo.Cliente;

public class CarregamentoCliente {

	public static Cliente carregarDracula() {
		Cliente cliente = new Cliente();
		cliente.setCodigo(6);
		cliente.setPj_pf("j");
		cliente.setAtivProf("cl�nica de tranfus�o de sangue");
		cliente.setCep("02394223");
		cliente.setRazSoc_nome("Conde Dr�cula Tranfus�o de Sangue");
		cliente.setCnpj_cpf("12.313.958/0001-13");
		cliente.setInsEst_rg("23.424.232.42");
		cliente.setTel1("90-3234-23242");
		cliente.setTel2("11-99832-9482");
		cliente.setEmail("condedraculasasngue@gmail.com");
		cliente.setUf("sp");
		cliente.setCidade("Transilv�nia");
		cliente.setRua("Rua Meia Niote");
		cliente.setNum_comp("n� 00, debaixo da lua cheia");
		cliente.setBairro("Dos Vampiros");
		cliente.setSite_instagram("Dracula chupa sangue");
		cliente.setObservacao("Cl�nica para doa��o de sangue.");
		return cliente;
	}
}
