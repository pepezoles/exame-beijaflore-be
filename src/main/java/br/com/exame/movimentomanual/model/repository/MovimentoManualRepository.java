package br.com.exame.movimentomanual.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.exame.movimentomanual.model.entity.MovimentoManual;
import br.com.exame.movimentomanual.model.entity.MovimentoManualId;

@Repository
public interface MovimentoManualRepository extends JpaRepository<MovimentoManual, MovimentoManualId> {
	
	@Query(value = "SELECT max(m.id.numeroLancamento) from MovimentoManual m where m.id.mes = ?1 and m.id.ano = ?2")
	public Integer findMaxLancamentoByMesAndAno(Integer mes, Integer ano);

}
