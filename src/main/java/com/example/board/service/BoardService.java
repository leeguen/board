package com.example.board.service;

import com.example.board.domain.Board;
import com.example.board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardMapper  boardMapper;

    //게시글 목록 조회
    public List<Board> getBoardList(){
        return boardMapper.getBoardList();
    }

    //게시글 상세 조회
    public Board getBoardDetail(int board_seq){
        return boardMapper.getBoardDetail(board_seq);
    }

    //게시글 등록
    public int insertBoard(Board board){
        return boardMapper.insertBoard(board);
    }

    //게시글 수정
    public int updateBoard(Board board){
        return boardMapper.updateBoard(board);
    }

    //게시글 삭제
    public int deleteBoard(int board_seq){
        return boardMapper.deleteBoard(board_seq);
    }


}
