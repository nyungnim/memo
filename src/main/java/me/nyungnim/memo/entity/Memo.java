package me.nyungnim.memo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.nyungnim.memo.dto.MemoRequestDto;

@Getter
@Setter
@NoArgsConstructor
public class Memo {
    private Long id;
    private String username;
    private String contents;

    public Memo(MemoRequestDto requestDto) {
        this.username = requestDto.getUsername();
        this.contents = requestDto.getContents();
    }
}
