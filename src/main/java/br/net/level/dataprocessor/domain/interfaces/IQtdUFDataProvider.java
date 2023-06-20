package br.net.level.dataprocessor.domain.interfaces;

import br.net.level.dataprocessor.domain.entities.QtdUFDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IQtdUFDataProvider extends JpaRepository<QtdUFDto, Long> {

	@Query(value = "SELECT COUNT(*) AS QTD, ESTADO FROM TB_PESSOA GROUP BY ESTADO", nativeQuery = true)
	List<QtdUFDto> findQtdUF();
}
