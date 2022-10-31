package br.edu.fateczl.ExercicioSpringMVCUDFProduto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.fateczl.ExercicioSpringMVCUDFProduto.persistence.ProdutoDao;

@SpringBootTest
public class QtdEstoqueTest {

	@Autowired
	ProdutoDao pDao;
	
	@Test
	void estoqueMinimo() {
		try {
			assertEquals(pDao.consultaQtdForaEstoque(10), 4);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
