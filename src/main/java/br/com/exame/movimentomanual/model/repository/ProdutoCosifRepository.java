package br.com.exame.movimentomanual.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.exame.movimentomanual.model.entity.ProdutoCosif;
import br.com.exame.movimentomanual.model.entity.ProdutoCosifId;

@Repository
public interface ProdutoCosifRepository extends JpaRepository<ProdutoCosif, ProdutoCosifId> {
	
	public List<ProdutoCosif> findByIdProdutoProdutoId(Integer produtoId);

}
