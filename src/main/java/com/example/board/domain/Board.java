package com.example.board.domain;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Board {

    int board_seq;
    String board_writer;
    String board_subject;
    String board_content;
    int board_hits;
    String ins_user_id;
    String ins_date;
    String upd_user_id;
    String upd_date;

}
