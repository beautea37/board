package com.fullstack.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fullstack.board.dto.BoardDTO;
import com.fullstack.board.dto.PageRequestDTO;
import com.fullstack.board.dto.PageResultDTO;
import com.fullstack.board.service.BoardService;

@SpringBootTest
public class ServiceTests {

	@Autowired
	private BoardService boardService;
	
//	@Test
//	public void registTest() {
//		//테스트구문을 만들어서 실행시켜 보세요
//		BoardDTO boardDTO = BoardDTO.builder()
//				.title("이건 신규 등록")
//				.content("신규등록 글내용")
//				.writereEmail("tlawltjr21@abc.com")
//				.build();
//		
//		Long newBno = boardService.register(boardDTO);
//		System.out.println("신규등록 글번호 : " + newBno);
//	}
	
	
	//글목록 가져오기 테스트
	@Test
	public void testList() {
		//PageRequestDTO 객체를 생성하면 기본 0페이지, 10개의 목록을 가져오도록 설정됨
		PageRequestDTO dto = new PageRequestDTO();
		
		PageResultDTO<BoardDTO , Object[]> result = boardService.getList(dto);
		
		for(BoardDTO boardDTO : result.getDtoList()) {
			System.out.println(boardDTO);
		}
		
	}
	
	
	
	
}
