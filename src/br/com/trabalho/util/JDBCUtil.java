package br.com.trabalho.util;

import java.util.Collections;

public class JDBCUtil {
	public static String inserir(String tabela, String ... campos) {
		StringBuilder construtorString = new StringBuilder("INSERT INTO ");
		construtorString.append(tabela);
		construtorString.append(String.join(", ", campos));
		construtorString.append(" VALUES (");
		construtorString.append(String.join(", ", Collections.nCopies(campos.length, "?")));
		construtorString.append(");");
		return construtorString.toString();
	}
}
