package kr.soft.shopping.api;

import kr.soft.shopping.dto.board.BoardListDTO;
import kr.soft.shopping.dto.board.BoardRegiterDTO;
import kr.soft.shopping.service.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/board")
public class BoardController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BoardService boardService;

    @GetMapping("/list")
    public List<BoardListDTO> list() {
        return boardService.list();
    }

    @PostMapping("/register")
    public void register(@RequestBody BoardRegiterDTO boardRegiterDTO) {

        //테스트, 만약에 client에서 요청을 했는지
        //데이터를 제대로 전달 했는지 ★★★★★ 확인!!!!
        logger.info("data: {}", boardRegiterDTO.toString());

        boardService.register(boardRegiterDTO);
    }
}
