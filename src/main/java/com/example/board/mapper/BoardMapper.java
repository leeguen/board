package com.example.board.mapper;

import com.example.board.domain.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    // 게시글 목록 조회
    List<Board> getBoardList();

    // 게시글 상세 조회
    Board getBoardDetail(int board_seq);

    // 게시글 등록
    int insertBoard(Board board);

    // 게시글 수정
    int updateBoard(Board board);

    // 게시글 삭제
    int deleteBoard(int board_seq);

}