package br.com.trabalho;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.trabalho.carregamento.CarregamentoCliente;
import br.com.trabalho.conexao.Conexao;
import br.com.trabalho.modelo.Cliente;

public class AplicacaoTrabalho {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente = CarregamentoCliente.carregarDracula();
		
		String sqlInserirCliente = "INSERT INTO public.cliente ("
				+ "codigo_serial,"
				+ "pfpj,"
				+ "ativprof,"
				+ "cep,"
				+ "razsoc_nome,"
				+ "cnpj_cpf,"
				+ "insest_rg,"
				+ "tel1,tel2,"
				+ "email,uf,"
				+ "cidade,"
				+ "rua,num_comp,"
				+ "bairro,"
				+ "site_instagram,"
				+ "observacao)\r\n"
				+ "	VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);\r\n";
		
		Conexao preparaConexao = new Conexao();
		
		Connection con = preparaConexao.criarConexao();
		
		PreparedStatement st;
		try {
			st = con.prepareStatement(sqlInserirCliente);
			
			st.setLong(1, cliente.getCodigo());
			st.setString(2, cliente.getPj_pf());
			st.setString(3, cliente.getAtivProf());
			st.setString(4, cliente.getCep());
			st.setString(5, cliente.getRazSoc_nome());
			st.setString(6, cliente.getCnpj_cpf());
			st.setString(7, cliente.getInsEst_rg());
			st.setString(8, cliente.getTel1());
			st.setString(9, cliente.getTel2());
			st.setString(10, cliente.getEmail());
			st.setString(11, cliente.getUf());
			st.setString(12, cliente.getCidade());
			st.setString(13, cliente.getRua());
			st.setString(14, cliente.getNum_comp());
			st.setString(15, cliente.getBairro());
			st.setString(16, cliente.getSite_instagram());
			st.setString(17, cliente.getObservacao());
			
			st.executeUpdate();
			
			st.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
