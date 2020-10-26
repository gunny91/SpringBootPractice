package com.ghsoft.persistence;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ghsoft.dto.BoardDTO;

/**
 * We set Id and Entity at BoardDTO
 * public interface BoardRepository extends CrudRepository<T ->>will be BoardDTO, Id ->> whill be Long >
 * @author Geonhee Cho
 *
 */
public interface BoardRepository extends CrudRepository<BoardDTO, Long> {

	public List<BoardDTO> findBoardDTOByTitle(String title);
	public List<BoardDTO> findBoardDTOByWriter(String writer);
}
