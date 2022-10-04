package com.example.board.controller;

import com.example.board.domain.Board;
import com.example.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/board")
@RestController
public class BoardController {

    @Autowired
    private BoardService boardService;

    // 게시글 목록 조회
    @GetMapping
    public List<Board> getBoardList(){
        return boardService.getBoardList();
    }

    // 게시글 상세 조회
    @GetMapping("/{board_seq}")
    public Board getBoardDetail(@PathVariable("board_seq") int board_seq){
        return boardService.getBoardDetail(board_seq);
    }

    // 게시글 등록
    @PostMapping
    public Board insertBoard(@RequestBody Board board){
        boardService.insertBoard(board);
        int boardSeq = board.getBoard_seq();
        Board boardDetail = boardService.getBoardDetail(boardSeq);

        return boardDetail;
    }

    // 게시글 수정
    @PutMapping("/{board_seq}")
    public Board updateBoard(@PathVariable("board_seq") int board_seq, @RequestBody Board board){
        boardService.updateBoard(board);
        Board boardDetail = boardService.getBoardDetail(board_seq);

        return boardDetail;
    }

    // 게시글 삭제
    @DeleteMapping("/{board_seq}")
    public Board deleteBoard(@PathVariable("board_seq") int board_seq){
        boardService.deleteBoard(board_seq);

        Board deleteBoard = new Board();
        deleteBoard.setBoard_seq(board_seq);

        return deleteBoard;
    }


}
